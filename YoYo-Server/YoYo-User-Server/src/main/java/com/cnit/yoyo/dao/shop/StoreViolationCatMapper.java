package com.cnit.yoyo.dao.shop;

import com.cnit.yoyo.model.shop.StoreViolationCat;
import com.cnit.yoyo.model.shop.StoreViolationCatExample;
import com.cnit.yoyo.model.shop.StoreViolationCatWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreViolationCatMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int countByExample(StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int deleteByExample(StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int deleteByPrimaryKey(Integer catId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int insert(StoreViolationCatWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int insertSelective(StoreViolationCatWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	List<StoreViolationCatWithBLOBs> selectByExampleWithBLOBs(
			StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	List<StoreViolationCat> selectByExample(StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	StoreViolationCatWithBLOBs selectByPrimaryKey(Integer catId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByExampleSelective(
			@Param("record") StoreViolationCatWithBLOBs record,
			@Param("example") StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByExampleWithBLOBs(
			@Param("record") StoreViolationCatWithBLOBs record,
			@Param("example") StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByExample(@Param("record") StoreViolationCat record,
			@Param("example") StoreViolationCatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByPrimaryKeySelective(StoreViolationCatWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByPrimaryKeyWithBLOBs(StoreViolationCatWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_business_violationcat
	 * @mbggenerated  Wed Jun 03 16:26:50 CST 2015
	 */
	int updateByPrimaryKey(StoreViolationCat record);

	/**
	 * @Title:  updateCatPath  
	 * @Description:  TODO(更新路径)  
	 * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
	 * @date 2015-6-3 下午1:42:56  
	 * @version 1.0.0 
	 * @param @param oldPath
	 * @param @param newPath
	 * @param @return
	 * @return int  返回类型 
	 * @throws
	 */
	int updateCatPath(@Param("oldPath")String oldPath, @Param("newPath")String newPath);
	
	/**
	 * @Title:  selectByParentId  
	 * @Description:  TODO(根据父级id查询违规类型)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-4 下午5:16:24  
	 * @version 1.0.0 
	 * @param @param parentId
	 * @param @param exist
	 * @param @return
	 * @return List<StoreViolationCatWithBLOBs>  返回类型 
	 * @throws
	 */
	List<StoreViolationCatWithBLOBs> selectByParentId(@Param("parentId")Integer parentId, @Param("exist")boolean exist);
	
	/**
	 * @Title:  selectChild  
	 * @Description:  TODO(查询除第一级分类外的违规类型)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-9 下午4:52:03  
	 * @version 1.0.0 
	 * @param @return
	 * @return List<StoreViolationCatWithBLOBs>  返回类型 
	 * @throws
	 */
	List<StoreViolationCatWithBLOBs> selectChild();
}