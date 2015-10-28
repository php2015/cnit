package com.cnit.yoyo.dao.trade;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cnit.yoyo.model.trade.ReshipItems;

public interface ReshipItemsMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    int deleteByPrimaryKey(Integer itemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    int insert(ReshipItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    int insertSelective(ReshipItems record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    ReshipItems selectByPrimaryKey(Integer itemId);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    int updateByPrimaryKeySelective(ReshipItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_items
     *
     * @mbggenerated Thu Apr 16 14:01:33 CST 2015
     */
    int updateByPrimaryKey(ReshipItems record);
}