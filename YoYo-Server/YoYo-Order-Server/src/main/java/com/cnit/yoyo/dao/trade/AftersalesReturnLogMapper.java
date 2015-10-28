package com.cnit.yoyo.dao.trade;

import com.cnit.yoyo.model.trade.AftersalesReturnLog;
import com.cnit.yoyo.model.trade.AftersalesReturnLogWithBLOBs;

public interface AftersalesReturnLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int deleteByPrimaryKey(Long logId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int insert(AftersalesReturnLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int insertSelective(AftersalesReturnLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	AftersalesReturnLogWithBLOBs selectByPrimaryKey(Long logId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int updateByPrimaryKeySelective(AftersalesReturnLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int updateByPrimaryKeyWithBLOBs(AftersalesReturnLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_aftersales_return_log
	 * @mbggenerated  Sat Apr 18 17:01:00 CST 2015
	 */
	int updateByPrimaryKey(AftersalesReturnLog record);
}