package com.cnit.yoyo.dao.trade;

import com.cnit.yoyo.model.trade.ReshipLog;

public interface ReshipLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    int deleteByPrimaryKey(Integer reshipLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    int insert(ReshipLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    int insertSelective(ReshipLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    ReshipLog selectByPrimaryKey(Integer reshipLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    int updateByPrimaryKeySelective(ReshipLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_reship_log
     *
     * @mbggenerated Fri Apr 17 10:01:17 CST 2015
     */
    int updateByPrimaryKey(ReshipLog record);
}