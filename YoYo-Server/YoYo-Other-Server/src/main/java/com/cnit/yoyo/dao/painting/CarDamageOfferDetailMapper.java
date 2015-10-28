package com.cnit.yoyo.dao.painting;

import java.util.List;

import com.cnit.yoyo.model.painting.CarDamageOfferDetail;

public interface CarDamageOfferDetailMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int insert(CarDamageOfferDetail record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int insertSelective(CarDamageOfferDetail record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    CarDamageOfferDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int updateByPrimaryKeySelective(CarDamageOfferDetail record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CarDamageOfferDetail record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_car_damage_offer_detail
     * @mbggenerated  Mon May 18 11:22:29 CST 2015
     */
    int updateByPrimaryKey(CarDamageOfferDetail record);

    void batchInsert(List<CarDamageOfferDetail> list);
    
    List<CarDamageOfferDetail> selectByDamageId(Integer damageId, Integer companyId);
}