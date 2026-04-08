package cres.mis.hrm.service;

import java.util.List;
import java.util.Map;

import com.nexacro17.xapi.tx.HttpPlatformRequest;

/**
 * @FileName		: Hrm_0110Service.java
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
@SuppressWarnings("rawtypes")
public interface Hrm_0110Service {

	public List<Map<String, Object>> getOrgRginList(Map params) throws Exception;

	public List<Map<String, Object>> getOrgchtList(Map params) throws Exception;

	public String insNewOrgchtData(HttpPlatformRequest request) throws Exception;

	public String setData(HttpPlatformRequest request) throws Exception;
}
