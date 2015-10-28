package com.cnit.yoyo.dao.order;

import com.cnit.yoyo.model.member.CommentPraise;
import com.cnit.yoyo.model.member.CommentPraiseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentPraiseMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int countByExample(CommentPraiseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int deleteByExample(CommentPraiseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int insert(CommentPraise record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int insertSelective(CommentPraise record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	List<CommentPraise> selectByExample(CommentPraiseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	CommentPraise selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int updateByExampleSelective(@Param("record") CommentPraise record,
			@Param("example") CommentPraiseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int updateByExample(@Param("record") CommentPraise record,
			@Param("example") CommentPraiseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int updateByPrimaryKeySelective(CommentPraise record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_comment_praise
	 * @mbggenerated  Tue Jun 23 16:32:33 CST 2015
	 */
	int updateByPrimaryKey(CommentPraise record);

	/**
     * @Title:  selectCountByCommentId  
     * @Description:  TODO(根据评论id查询点赞数量)  
     * @author <a href="cmlai@chinacnit.com">赖彩�?/a> 
     * @date 2015-6-23 下午4:23:57  
     * @version 1.0.0 
     * @param @param commentId
     * @param @return
     * @return int  返回类型 
     * @throws
     */
    int selectCountByCommentId(Integer commentId);
}