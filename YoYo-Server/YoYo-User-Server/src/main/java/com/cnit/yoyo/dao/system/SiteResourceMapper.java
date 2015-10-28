package com.cnit.yoyo.dao.system;

import java.util.List;

import com.cnit.yoyo.model.system.Resource;
import com.cnit.yoyo.model.system.SiteResource;
import com.cnit.yoyo.model.system.dto.ResourceListDTO;
import com.cnit.yoyo.model.system.dto.ResourceQryDTO;
import com.cnit.yoyo.model.system.dto.SiteResourceListDTO;
import com.cnit.yoyo.model.system.dto.SiteResourceQryDTO;
import com.cnit.yoyo.model.system.dto.SiteResourceTreeDTO;

public interface SiteResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int insert(SiteResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int insertSelective(SiteResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    SiteResource selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int updateByPrimaryKeySelective(SiteResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(SiteResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_site_resource
     *
     * @mbggenerated Fri Apr 10 13:30:10 CST 2015
     */
    int updateByPrimaryKey(SiteResource record);
    
    /**
     * 
    *
    * @Description: 查找所有菜单  
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-4-10 下午1:32:25 
    * @return List<Resource>    返回类型 
    * @throws
     */
    List<SiteResource> findAllMenu(Integer parentId);
    
    /**
     * 
    *
    * @Description: 根据用户ID查询菜单 
    * @param @param qry
    * @param @return    设定文件 
    * @author ssd
    * @date 2015-5-5 下午3:47:18 
    * @return List<SiteResource>    返回类型 
    * @throws
     */
    List<SiteResource> findAllMenuByAccoutId(ResourceQryDTO qry);
    
    List<SiteResource> findAllMenuByUserName(String loginName);
    
    /**
     * @Title: findAllMenuByOrder 
     * @Description: TODO(按指定字段顺序查询全部菜单) 
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-4-23 下午3:04:39 
     * @version 1.0.0 
     * @param column
     * @param @return    
     * @return List<Resource>    返回类型 
     * @throws
     */
    List<SiteResource> findAllMenuByOrder(SiteResourceQryDTO qry);

	List<SiteResourceListDTO> selectAll();

	List<SiteResourceTreeDTO> selectAllTree();

	List<SiteResource> findMenuByRoleId(Integer roleId);
}