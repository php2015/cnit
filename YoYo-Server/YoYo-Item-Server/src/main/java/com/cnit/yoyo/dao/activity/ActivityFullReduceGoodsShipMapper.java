package com.cnit.yoyo.dao.activity;

import java.util.List;

import com.cnit.yoyo.model.activity.ActivityFullReduceGoodsShip;

public interface ActivityFullReduceGoodsShipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    int insert(ActivityFullReduceGoodsShip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    int insertSelective(ActivityFullReduceGoodsShip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    ActivityFullReduceGoodsShip selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    int updateByPrimaryKeySelective(ActivityFullReduceGoodsShip record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_activity_fullreduce_goods_ship
     *
     * @mbggenerated Thu Aug 27 15:46:30 CST 2015
     */
    int updateByPrimaryKey(ActivityFullReduceGoodsShip record);

	List<Integer> selectByActId(long actId);

	int deleteByActId(Long actId);
}