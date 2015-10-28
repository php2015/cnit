package com.cnit.yoyo.dao.goods;

import com.cnit.yoyo.model.goods.ConsultReplace;
import com.cnit.yoyo.model.goods.ConsultReplaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultReplaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int countByExample(ConsultReplaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int deleteByExample(ConsultReplaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int insert(ConsultReplace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int insertSelective(ConsultReplace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    List<ConsultReplace> selectByExample(ConsultReplaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    ConsultReplace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int updateByExampleSelective(@Param("record") ConsultReplace record, @Param("example") ConsultReplaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int updateByExample(@Param("record") ConsultReplace record, @Param("example") ConsultReplaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int updateByPrimaryKeySelective(ConsultReplace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_consult_replace
     *
     * @mbggenerated Tue May 12 14:31:16 CST 2015
     */
    int updateByPrimaryKey(ConsultReplace record);
}