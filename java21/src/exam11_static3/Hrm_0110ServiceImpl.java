package cres.mis.hrm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.nexacro17.xapi.tx.HttpPlatformRequest;

import cres.com.SystemException;
import cres.common.ComServiceImpl;
import cres.common.api.shiftee.service.AppService;
import cres.common.util.CommonUtil;
import cres.mis.hrm.service.Hrm_0110Service;

/**
 * @FileName : Hrm_0110ServiceImpl.java
 * @Description :
 * @author : crespeed
 * @since : 2021. 2. 2.
 * @version : 1.0
 * @see
 * 
 *      <pre>
 * << Modification Information >>
 *  수정일       수정자      수정내용
 *  -----------  --------    ---------------------------
 *  2021. 2. 2.  crespeed    최초 생성
 *  2025. 2. 14. 이용주		승인 시, Shiftee API 연동
 *      </pre>
 */
@Service("mis.hrm.hrm0110Service")
@SuppressWarnings({"rawtypes", "unchecked"})
public class Hrm_0110ServiceImpl extends ComServiceImpl implements Hrm_0110Service {
	
	/* Shiftee API*/
	@Resource(name = "common.shiftee.service.AppService")
	private AppService ShifteeAppSvc;
	
	protected static final Log log = LogFactory.getLog(Hrm_0110ServiceImpl.class);

	/**
	 * @Method Name : getOrgRginList
	 * @Description : 조직개편 조회
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List getOrgRginList(Map params) throws Exception {
		List list = dao.list("mis.hrm.hrm0110.getOrgRginList", params);
		return list;
	}

	/**
	 * @Method Name : getOrgchtList
	 * @Description : 부서조직도관리 조회
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List getOrgchtList(Map params) throws Exception {
		List list = dao.list("mis.hrm.hrm0110.getOrgchtList", params);
		return list;
	}

	/**
	 * @Method Name : insNewOrgchtData
	 * @Description : 조직개편 생성
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@Override
	public String insNewOrgchtData(HttpPlatformRequest request) throws Exception {
		Map loginMap = request.getLoginMap();
		Map dmap = request.getDataSetMap("ds_main");
		//Object resultObj = new HashMap();
		String useYn = "N";

		useYn = (String) dao.item("mis.hrm.hrm0110.getChkOrgRginDt", dmap);

		if ("Y".equals(useYn)) {
			throw new SystemException("해당 조직개편일자에 조직개편내역이 존재합니다.");
		}

		dmap.put("SESS_USER_ID", loginMap.get("SESS_USER_ID"));
		dmap.put("SESS_IP", loginMap.get("SESS_IP"));
		//resultObj = dao.insert("mis.hrm.hrm0110.insOrgRginData", dmap);
		dao.insert("mis.hrm.hrm0110.insNewOrgchtData", dmap);

		return "Y";
	}

	/**
	 * @Method Name : setData
	 * @Description : 부서조직관리 저장
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@Override
	public String setData(HttpPlatformRequest request) throws Exception {
		Map loginMap = request.getLoginMap();
		Map dmap = request.getDataSetMap("ds_main");
		List orgchtList = request.getDataSetList("ds_listOrgcht");

		String aprovYn = (String) loginMap.get("APROV_YN");
		String dcsnYn = (String) dmap.get("ORG_RGIN_DCSN_YN");
		String tmHeader = "";

		// 조직개편 - 참고사항 UPDATE
		dao.update("mis.hrm.hrm0110.uptOrgRgin", dmap);

		for (int i = 0; i < orgchtList.size(); i++) {
			Map map = (Map) orgchtList.get(i);
			tmHeader = (String) map.get("tmHeader");

			if ("I".equals(tmHeader)) {
				dao.insert("mis.hrm.hrm0110.insOrgchtData", map);
			} else if ("U".equals(tmHeader)) {
				dao.update("mis.hrm.hrm0110.uptOrgchtData", map);

				// 확정처리 이후 부서장 변경.
				if ("Y".equals(dcsnYn)) {
					dao.update("mis.hrm.hrm0110.uptHrmDept", map);
				}

			} else if ("D".equals(tmHeader)) {
				dao.delete("mis.hrm.hrm0110.delOrgchtData", map);
			}
		}

		// 해당 조직개편일자에 중복된 부서코드가 있는 지 체크한다.
		String deptCdOverStr = (String) dao.item("mis.hrm.hrm0110.getChkDeptCdOver", dmap);

		if (!CommonUtil.isNull(deptCdOverStr)) {
			throw new SystemException(deptCdOverStr);
		}

		// 확정처리
		// HRM_DEPT 업데이트
		if ("Y".equals(aprovYn)) {

			String orgRginDt = (String) dmap.get("ORG_RGIN_DT");

			if (CommonUtil.isNull(orgRginDt)) {
				throw new SystemException("조직개편일정보가 존재하지않습니다.");
			}
			dao.insert("mis.hrm.hrm0110.insAprovData", dmap);
			
			System.out.println("========== hrm_0110 부서조직관리 확정 API 호출 START ==========");
			// 조직 개편 시, 부서/직원 PUT API 호출
			ShifteeAppSvc.setReorganization();
			System.out.println("========== hrm_0110 부서조직관리 확정 API 호출 END ==========");
		}
		return "Y";
	}

}
