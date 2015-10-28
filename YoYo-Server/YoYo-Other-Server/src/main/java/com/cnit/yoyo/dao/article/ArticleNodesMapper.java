package com.cnit.yoyo.dao.article;

import com.cnit.yoyo.model.article.ArticleNodes;
import com.cnit.yoyo.model.article.ArticleNodesExample;
import com.cnit.yoyo.model.article.ArticleNodesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleNodesMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int countByExample(ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int deleteByExample(ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int deleteByPrimaryKey(Integer nodeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int insert(ArticleNodesWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int insertSelective(ArticleNodesWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	List<ArticleNodesWithBLOBs> selectByExampleWithBLOBs(
			ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	List<ArticleNodes> selectByExample(ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	ArticleNodesWithBLOBs selectByPrimaryKey(Integer nodeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByExampleSelective(@Param("record") ArticleNodesWithBLOBs record,
			@Param("example") ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByExampleWithBLOBs(@Param("record") ArticleNodesWithBLOBs record,
			@Param("example") ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByExample(@Param("record") ArticleNodes record,
			@Param("example") ArticleNodesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByPrimaryKeySelective(ArticleNodesWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByPrimaryKeyWithBLOBs(ArticleNodesWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_content_article_nodes
	 * @mbggenerated  Thu Jun 25 14:58:01 CST 2015
	 */
	int updateByPrimaryKey(ArticleNodes record);

	/**
     * @Title:  selectByParentId  
     * @Description:  TODO(根据父节点查询对�?  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-17 下午3:10:12  
     * @version 1.0.0 
     * @param @param parentId
     * @param @return
     * @return List<ArticleNodesWithBLOBs>  返回类型 
     * @throws
     */
    List<ArticleNodesWithBLOBs> selectByParentId(@Param("parentId")Integer parentId, @Param("disabled")Integer disabled);
    
    /**
     * @Title:  updateNodePathAndDepth  
     * @Description:  TODO(更新路径)  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-24 下午5:43:45  
     * @version 1.0.0 
     * @param @param oldPath
     * @param @param newPath
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int updateNodePathAndDepth(@Param("oldPath")String oldPath, @Param("newPath")String newPath, @Param("nodeDepth")Integer nodeDepth);
    
    /**
     * @Title:  updateifPubByPath  
     * @Description:  TODO(根据路径更新发布状�?)  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-24 下午7:00:29  
     * @version 1.0.0 
     * @param @param ifPub
     * @param @param path
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int updateifPubByPath(@Param("ifPub")Integer ifPub, @Param("path")String path);
    
    /**
     * @Title:  updateifPubByNodeId  
     * @Description:  TODO(根据主键更新发布状�?)  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-24 下午7:04:10  
     * @version 1.0.0 
     * @param @param ifPub
     * @param @param nodeId
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int updateifPubByNodeId(@Param("ifPub")Integer ifPub, @Param("nodeId")Integer nodeId);
    
    /**
     * @Title:  selectByNodeIds  
     * @Description:  TODO(根据主键列表查询对象)  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-25 上午9:36:45  
     * @version 1.0.0 
     * @param @param list
     * @param @return
     * @return List<ArticleNodesWithBLOBs>  返回类型 
     * @throws
     */
    List<ArticleNodesWithBLOBs> selectByNodeIds(List<Integer> list);
    
    /**
     * @Title:  updateDisabledById  
     * @Description:  TODO(根据栏目id更新disabled字段)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-7-3 上午11:40:19  
     * @version 1.0.0 
     * @param @param nodeId
     * @param @param disabled
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int updateDisabledById(@Param("nodeId") Integer nodeId, @Param("disabled") Integer disabled);
    
    /**
     * @Title:  selectCountByParentId  
     * @Description:  TODO(根据父级id查询子栏目数量)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-7-3 下午1:55:08  
     * @version 1.0.0 
     * @param @param parentId
     * @param @param disabled
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int selectCountByParentId(@Param("parentId") Integer parentId, @Param("disabled") Integer disabled);
    
    /**
     * @Title:  selectByNodeId  
     * @Description:  TODO(根据主键查找对象)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-7-3 下午2:11:05  
     * @version 1.0.0 
     * @param @param nodeId
     * @param @param disabled
     * @param @return
     * @return ArticleNodesWithBLOBs  返回类型 
     * @throws
     */
    ArticleNodesWithBLOBs selectByNodeId(@Param("nodeId") Integer nodeId, @Param("disabled") Integer disabled);
    
    /**
     * @Title:  selectByNodeName  
     * @Description:  TODO(根据栏目名称查询对象)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-7-3 下午2:23:13  
     * @version 1.0.0 
     * @param @param nodeName
     * @param @param disabled
     * @param @return
     * @return List<ArticleNodesWithBLOBs>  返回类型 
     * @throws
     */
    List<ArticleNodesWithBLOBs> selectByNodeName(@Param("nodeName") String nodeName, @Param("disabled") Integer disabled);
    
    int updateSubNodePath(Integer nodeId);
    
    List<ArticleNodesWithBLOBs> selectNodesWithArticle(Integer parentId);
}