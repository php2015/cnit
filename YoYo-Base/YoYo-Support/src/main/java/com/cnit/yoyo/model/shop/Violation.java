package com.cnit.yoyo.model.shop;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Violation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.violation_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer violationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.cat_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer catId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.score_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer scoreValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.goods_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer goodsDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.goodsdown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer goodsdownDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.news_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer newsDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.news_days_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer newsDaysValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.store_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer storeDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.storedown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer storedownDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.sales_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer salesDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.earnest_money
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private BigDecimal earnestMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.disabled
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer disabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.add_time
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.last_modify
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Date lastModify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.d_order
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private Integer dOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_business_violation.remark
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_business_violation
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.violation_id
     *
     * @return the value of t_business_violation.violation_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getViolationId() {
        return violationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.violation_id
     *
     * @param violationId the value for t_business_violation.violation_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setViolationId(Integer violationId) {
        this.violationId = violationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.cat_id
     *
     * @return the value of t_business_violation.cat_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.cat_id
     *
     * @param catId the value for t_business_violation.cat_id
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.score_value
     *
     * @return the value of t_business_violation.score_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getScoreValue() {
        return scoreValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.score_value
     *
     * @param scoreValue the value for t_business_violation.score_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.goods_days
     *
     * @return the value of t_business_violation.goods_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getGoodsDays() {
        return goodsDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.goods_days
     *
     * @param goodsDays the value for t_business_violation.goods_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setGoodsDays(Integer goodsDays) {
        this.goodsDays = goodsDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.goodsdown_days
     *
     * @return the value of t_business_violation.goodsdown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getGoodsdownDays() {
        return goodsdownDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.goodsdown_days
     *
     * @param goodsdownDays the value for t_business_violation.goodsdown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setGoodsdownDays(Integer goodsdownDays) {
        this.goodsdownDays = goodsdownDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.news_days
     *
     * @return the value of t_business_violation.news_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getNewsDays() {
        return newsDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.news_days
     *
     * @param newsDays the value for t_business_violation.news_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setNewsDays(Integer newsDays) {
        this.newsDays = newsDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.news_days_value
     *
     * @return the value of t_business_violation.news_days_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getNewsDaysValue() {
        return newsDaysValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.news_days_value
     *
     * @param newsDaysValue the value for t_business_violation.news_days_value
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setNewsDaysValue(Integer newsDaysValue) {
        this.newsDaysValue = newsDaysValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.store_days
     *
     * @return the value of t_business_violation.store_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getStoreDays() {
        return storeDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.store_days
     *
     * @param storeDays the value for t_business_violation.store_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setStoreDays(Integer storeDays) {
        this.storeDays = storeDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.storedown_days
     *
     * @return the value of t_business_violation.storedown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getStoredownDays() {
        return storedownDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.storedown_days
     *
     * @param storedownDays the value for t_business_violation.storedown_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setStoredownDays(Integer storedownDays) {
        this.storedownDays = storedownDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.sales_days
     *
     * @return the value of t_business_violation.sales_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getSalesDays() {
        return salesDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.sales_days
     *
     * @param salesDays the value for t_business_violation.sales_days
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setSalesDays(Integer salesDays) {
        this.salesDays = salesDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.earnest_money
     *
     * @return the value of t_business_violation.earnest_money
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public BigDecimal getEarnestMoney() {
        return earnestMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.earnest_money
     *
     * @param earnestMoney the value for t_business_violation.earnest_money
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setEarnestMoney(BigDecimal earnestMoney) {
        this.earnestMoney = earnestMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.disabled
     *
     * @return the value of t_business_violation.disabled
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.disabled
     *
     * @param disabled the value for t_business_violation.disabled
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.add_time
     *
     * @return the value of t_business_violation.add_time
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.add_time
     *
     * @param addTime the value for t_business_violation.add_time
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.last_modify
     *
     * @return the value of t_business_violation.last_modify
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Date getLastModify() {
        return lastModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.last_modify
     *
     * @param lastModify the value for t_business_violation.last_modify
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.d_order
     *
     * @return the value of t_business_violation.d_order
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public Integer getdOrder() {
        return dOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.d_order
     *
     * @param dOrder the value for t_business_violation.d_order
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setdOrder(Integer dOrder) {
        this.dOrder = dOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_business_violation.remark
     *
     * @return the value of t_business_violation.remark
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_business_violation.remark
     *
     * @param remark the value for t_business_violation.remark
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_violation
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", violationId=").append(violationId);
        sb.append(", catId=").append(catId);
        sb.append(", scoreValue=").append(scoreValue);
        sb.append(", goodsDays=").append(goodsDays);
        sb.append(", goodsdownDays=").append(goodsdownDays);
        sb.append(", newsDays=").append(newsDays);
        sb.append(", newsDaysValue=").append(newsDaysValue);
        sb.append(", storeDays=").append(storeDays);
        sb.append(", storedownDays=").append(storedownDays);
        sb.append(", salesDays=").append(salesDays);
        sb.append(", earnestMoney=").append(earnestMoney);
        sb.append(", disabled=").append(disabled);
        sb.append(", addTime=").append(addTime);
        sb.append(", lastModify=").append(lastModify);
        sb.append(", dOrder=").append(dOrder);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_violation
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Violation other = (Violation) that;
        return (this.getViolationId() == null ? other.getViolationId() == null : this.getViolationId().equals(other.getViolationId()))
            && (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getScoreValue() == null ? other.getScoreValue() == null : this.getScoreValue().equals(other.getScoreValue()))
            && (this.getGoodsDays() == null ? other.getGoodsDays() == null : this.getGoodsDays().equals(other.getGoodsDays()))
            && (this.getGoodsdownDays() == null ? other.getGoodsdownDays() == null : this.getGoodsdownDays().equals(other.getGoodsdownDays()))
            && (this.getNewsDays() == null ? other.getNewsDays() == null : this.getNewsDays().equals(other.getNewsDays()))
            && (this.getNewsDaysValue() == null ? other.getNewsDaysValue() == null : this.getNewsDaysValue().equals(other.getNewsDaysValue()))
            && (this.getStoreDays() == null ? other.getStoreDays() == null : this.getStoreDays().equals(other.getStoreDays()))
            && (this.getStoredownDays() == null ? other.getStoredownDays() == null : this.getStoredownDays().equals(other.getStoredownDays()))
            && (this.getSalesDays() == null ? other.getSalesDays() == null : this.getSalesDays().equals(other.getSalesDays()))
            && (this.getEarnestMoney() == null ? other.getEarnestMoney() == null : this.getEarnestMoney().equals(other.getEarnestMoney()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getLastModify() == null ? other.getLastModify() == null : this.getLastModify().equals(other.getLastModify()))
            && (this.getdOrder() == null ? other.getdOrder() == null : this.getdOrder().equals(other.getdOrder()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_business_violation
     *
     * @mbggenerated Wed Jun 03 17:11:04 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getScoreValue() == null) ? 0 : getScoreValue().hashCode());
        result = prime * result + ((getGoodsDays() == null) ? 0 : getGoodsDays().hashCode());
        result = prime * result + ((getGoodsdownDays() == null) ? 0 : getGoodsdownDays().hashCode());
        result = prime * result + ((getNewsDays() == null) ? 0 : getNewsDays().hashCode());
        result = prime * result + ((getNewsDaysValue() == null) ? 0 : getNewsDaysValue().hashCode());
        result = prime * result + ((getStoreDays() == null) ? 0 : getStoreDays().hashCode());
        result = prime * result + ((getStoredownDays() == null) ? 0 : getStoredownDays().hashCode());
        result = prime * result + ((getSalesDays() == null) ? 0 : getSalesDays().hashCode());
        result = prime * result + ((getEarnestMoney() == null) ? 0 : getEarnestMoney().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getLastModify() == null) ? 0 : getLastModify().hashCode());
        result = prime * result + ((getdOrder() == null) ? 0 : getdOrder().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}