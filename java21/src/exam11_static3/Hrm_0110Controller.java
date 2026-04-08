package cres.mis.hrm.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro17.spring.data.NexacroResult;
import com.nexacro17.xapi.tx.HttpPlatformRequest;

import cres.mis.hrm.service.Hrm_0110Service;

/**
 * @FileName		: Hrm_0110Controller.java
 * @Description	: 
 * @author			: crespeed
 * @since			: 2021. 2. 2. 
 * @version		: 1.0
 * @see
 * <pre>
 * << Modification Information >>
 *  수정일       수정자      수정내용
 *  -----------  --------    ---------------------------
 *  2021. 2. 2.  crespeed    최초 생성
 * </pre>
 */
@Controller
@SuppressWarnings("unchecked")
public class Hrm_0110Controller {

	@Resource(name = "mis.hrm.hrm0110Service")
	private Hrm_0110Service svc;

	/**
	 * @Method Name : getOrgRginList
	 * @Description : 조직개편 조회
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/mis/hrm/hrm0110/getOrgRginList.do")
	public NexacroResult getOrgRginList(HttpPlatformRequest request) throws Exception {
		Map dmap = request.getLoginMap();
		List<Map<String, Object>> ds_listOrgRgin = (List<Map<String, Object>>) svc.getOrgRginList(dmap);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_listOrgRgin", ds_listOrgRgin);
		return result;
	}

	/**
	 * @Method Name : getOrgchtList
	 * @Description : 부서조직관리 조회
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/mis/hrm/hrm0110/getOrgchtList.do")
	public NexacroResult getOrgchtList(HttpPlatformRequest request) throws Exception {
		Map dmap = request.getLoginMap();
		List<Map<String, Object>> ds_listOrgcht = (List<Map<String, Object>>) svc.getOrgchtList(dmap);
		NexacroResult result = new NexacroResult();
		result.addDataSet("ds_listOrgcht", ds_listOrgcht);
		return result;
	}

	/**
	 * @Method Name : insNewOrgchtData
	 * @Description : 신규 조직개편생성
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/mis/hrm/hrm0110/insNewOrgchtData.do")
	public NexacroResult insNewOrgchtData(HttpPlatformRequest request) throws Exception {

		System.out.println("insNewOrgchtData : ");

		String rslt = svc.insNewOrgchtData(request);
		NexacroResult result = new NexacroResult();
		result.addVariable("result", rslt);
		return result;
	}

	/**
	 * @Method Name : setData
	 * @Description : 부서조직관리 저장
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/mis/hrm/hrm0110/setData.do")
	public NexacroResult setData(HttpPlatformRequest request) throws Exception {
		String rslt = (String) svc.setData(request);
		NexacroResult result = new NexacroResult();
		result.addVariable("result", rslt);
		return result;
	}
}
