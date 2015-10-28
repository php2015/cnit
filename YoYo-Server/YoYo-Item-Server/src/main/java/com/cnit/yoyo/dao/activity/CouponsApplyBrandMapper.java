package com.cnit.yoyo.dao.activity;

import java.util.List;

import com.cnit.yoyo.model.activity.CouponsApplyBrand;
import com.cnit.yoyo.model.activity.dto.CouponsApplyBrandDTO;

public interface CouponsApplyBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    int insert(CouponsApplyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    int insertSelective(CouponsApplyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    CouponsApplyBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    int updateByPrimaryKeySelective(CouponsApplyBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_coupons_apply_brand
     *
     * @mbggenerated Mon Jul 13 16:39:11 CST 2015
     */
    int updateByPrimaryKey(CouponsApplyBrand record);
    
    int batchInsert(List<CouponsApplyBrand> list);
    
    int batchDelete(int couponsId);
    List<CouponsApplyBrandDTO> findByCouponsId(Integer couponsId);
}