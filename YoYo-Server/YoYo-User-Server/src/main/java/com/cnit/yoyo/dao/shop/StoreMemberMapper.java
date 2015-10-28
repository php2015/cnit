package com.cnit.yoyo.dao.shop;

import com.cnit.yoyo.model.shop.StoreMember;

public interface StoreMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    int deleteByPrimaryKey(Long attachId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    int insert(StoreMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    int insertSelective(StoreMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    StoreMember selectByPrimaryKey(Long attachId);
    
    StoreMember selectByOtherId(StoreMember record);
    
    int selectByMemberId(Long memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    int updateByPrimaryKeySelective(StoreMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_storemember
     *
     * @mbggenerated Fri May 29 13:03:00 CST 2015
     */
    int updateByPrimaryKey(StoreMember record);
}