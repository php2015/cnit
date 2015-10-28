
package com.cnit.yoyo.system.shopManager;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnit.yoyo.constant.GlobalStatic;
import com.cnit.yoyo.domain.HeadObject;
import com.cnit.yoyo.domain.RequestObject;
import com.cnit.yoyo.domain.ResultObject;
import com.cnit.yoyo.model.system.dto.ShopRoleAddDTO;
import com.cnit.yoyo.rmi.interfaces.RemoteService;
import com.cnit.yoyo.util.CommonHeadUtil;
import com.cnit.yoyo.util.StringUtil;

/**
 * 角色管理类
* @author ssd
* @date 2015-4-22 下午3:14:08
 */
@Controller
@RequestMapping("/shopRole")
public class ShopRoleController {
    public static final Logger log = LoggerFactory.getLogger(ShopRoleController.class);
    
    @Autowired
    private RemoteService memberService;

    /**
     * 
    *
    * @Description: 跳转到角色管理首页
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-22 下午3:15:00 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("/roleIndex")
    public String roleIndex() {
        return "pages/biz/system/shopManager/shopRole";
    }
    
    /**
     * 
    *
    * @Description:获取角色列表
    * @param @param request
    * @param @return
    * @param @throws Exception    设定文件 
    * @author ssd
    * @date 2015-4-22 下午3:27:06 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/shopRoleList")
    @ResponseBody
    public Object getShopRoleList(HttpServletRequest request) throws Exception {
        HeadObject headObject = CommonHeadUtil.geneHeadObject(request, "990304-01", GlobalStatic.SYSTEM_CODE_DATA, GlobalStatic.SYSTEM_CODE_BACK);
        Map<String, Object> data = new HashMap<String, Object>();
        String pageIndex = request.getParameter("page");
        String pageSize = request.getParameter("rows");
        data.put("pageIndex", StringUtil.isEmpty(pageIndex) ? GlobalStatic.DEFAULT_PAGE_INDEX : Integer.parseInt(pageIndex));
        data.put("pageSize", StringUtil.isEmpty(pageSize) ? GlobalStatic.DEFAULT_PAGE_SIZE : Integer.parseInt(pageSize));
        ResultObject resultObject = memberService.doService(new RequestObject(headObject,data));
        return resultObject;
    }
    
    /**
     * 
    *
    * @Description: 获取角色的ID和名称作为添加页面的下拉框数据
    * @param @param request
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-29 下午5:42:56 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/findStoreSelect")
    @ResponseBody
    public Object findStoreSelect(HttpServletRequest request,@RequestParam(value="companyId",required=false)Long companyId){
    	 HeadObject headObject = CommonHeadUtil.geneHeadObject(request, "031001-03", GlobalStatic.SYSTEM_CODE_DATA, GlobalStatic.SYSTEM_CODE_BACK);
    	 ResultObject resultObject = null;
         try {
        	   resultObject = memberService.doService(new RequestObject(headObject,companyId));
        	   
		} catch (Exception e) {
			e.printStackTrace();
		}
         return  resultObject ;
    }
    
    /**
     * 
    *
    * @Description: 获取角色的ID和名称作为添加页面的下拉框数据
    * @param @param request
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-29 下午5:42:56 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/findCompanySelect")
    @ResponseBody
    public Object findCompanySelect(HttpServletRequest request){
    	 HeadObject headObject = CommonHeadUtil.geneHeadObject(request, "1000020103-08", GlobalStatic.SYSTEM_CODE_DATA, GlobalStatic.SYSTEM_CODE_BACK);
    	 ResultObject resultObject = null;
         try {
        	   resultObject = memberService.doService(new RequestObject(headObject));
        	   
		} catch (Exception e) {
			e.printStackTrace();
		}
         return  resultObject ;
    }
    
    /**
     * 
    *
    * @Description: 添加角色
    * @param @param request
    * @param @param carYear
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-22 下午4:59:55 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/insertShopRole")
    @ResponseBody
    public Object insertShopRole(HttpServletRequest request,ShopRoleAddDTO shopRoleAddDTO){
    	 ResultObject resultObject = null;
         try {
        	 HeadObject  headObject = CommonHeadUtil.geneHeadObject(request, "990304-02", GlobalStatic.SYSTEM_CODE_DATA, GlobalStatic.SYSTEM_CODE_BACK);
        	 resultObject = memberService.doService(new RequestObject(headObject, shopRoleAddDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
         return  resultObject ;
    }
    

    /**
     * 
    *
    * @Description: 删除角色
    * @param @param request
    * @param @param id
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-29 下午5:44:11 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/deleteRole")
    @ResponseBody
    public Object deleteRole(HttpServletRequest request,@RequestParam(value="id",required=true)Long id){
    	 HeadObject headObject = CommonHeadUtil.geneHeadObject(request, "990302-06", GlobalStatic.SYSTEM_CODE_DATA, GlobalStatic.SYSTEM_CODE_BACK);
    	 ResultObject resultObject = null;
         try {
        	   resultObject = memberService.doService(new RequestObject(headObject, id));
        	   
		} catch (Exception e) {
			e.printStackTrace();
		}
         return  resultObject ;
    }
    
    /**
     * 
    *
    * @Description: 更新角色 
    * @param @param request
    * @param @param carYear
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-29 下午7:22:48 
    * @return Object    返回类型 
    * @throws
     */
    @RequestMapping("/updateRole")
    @ResponseBody
	public Object updateRole(HttpServletRequest request,ShopRoleAddDTO shopRoleAddDTO) {
		ResultObject resultObject = null;
		try {
			HeadObject headObject = CommonHeadUtil.geneHeadObject(request,"990304-04", GlobalStatic.SYSTEM_CODE_DATA,GlobalStatic.SYSTEM_CODE_BACK);
			resultObject = memberService.doService(new RequestObject(headObject, shopRoleAddDTO));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultObject;
	}
  
}
