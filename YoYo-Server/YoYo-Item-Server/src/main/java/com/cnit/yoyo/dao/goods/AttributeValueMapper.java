package com.cnit.yoyo.dao.goods;

import com.cnit.yoyo.model.goods.AttributeValue;
import com.cnit.yoyo.model.goods.AttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributeValueMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int countByExample(AttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int deleteByExample(AttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int deleteByPrimaryKey(Integer attrValueId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int insert(AttributeValue record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int insertSelective(AttributeValue record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    List<AttributeValue> selectByExample(AttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    AttributeValue selectByPrimaryKey(Integer attrValueId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int updateByExampleSelective(@Param("record") AttributeValue record, @Param("example") AttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int updateByExample(@Param("record") AttributeValue record, @Param("example") AttributeValueExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int updateByPrimaryKeySelective(AttributeValue record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_attribute_value
     * @mbggenerated  Wed Mar 25 10:32:24 CST 2015
     */
    int updateByPrimaryKey(AttributeValue record);

    int insertBatch(List list);
}