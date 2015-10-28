package com.cnit.yoyo.dao.spider;

import java.util.List;

import com.cnit.yoyo.autohome.model.AutohomeCarInfoDTO;
import com.cnit.yoyo.model.spider.AutohomeCarInfo;

public interface AutohomeCarInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    int insert(AutohomeCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    int insertSelective(AutohomeCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    AutohomeCarInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    int updateByPrimaryKeySelective(AutohomeCarInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_autohome_car_info
     *
     * @mbggenerated Thu Aug 06 11:17:30 CST 2015
     */
    int updateByPrimaryKey(AutohomeCarInfo record);

    /**
     * @Description:查找所有爬虫数据集合
     * @param list
     * @return
     */
	List<AutohomeCarInfoDTO> queryAutohomeCarDataList(List<AutohomeCarInfoDTO> list);
	/**
	 * @Description:根据车型id查找车型对应的属性集合
	 * @param carId
	 * @return
	 */
	AutohomeCarInfoDTO selectCarInfoIncludeCarAttr(String carId);
}