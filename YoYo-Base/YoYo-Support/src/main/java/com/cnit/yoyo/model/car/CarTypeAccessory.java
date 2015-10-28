package com.cnit.yoyo.model.car;

import java.io.Serializable;

public class CarTypeAccessory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_car_type_accessory.id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_car_type_accessory.car_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    private Integer carId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_car_type_accessory.acc_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    private Integer accId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_car_type_accessory.disabled
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    private String disabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_car_type_accessory
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_car_type_accessory.id
     *
     * @return the value of t_car_type_accessory.id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_car_type_accessory.id
     *
     * @param id the value for t_car_type_accessory.id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_car_type_accessory.car_id
     *
     * @return the value of t_car_type_accessory.car_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_car_type_accessory.car_id
     *
     * @param carId the value for t_car_type_accessory.car_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_car_type_accessory.acc_id
     *
     * @return the value of t_car_type_accessory.acc_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public Integer getAccId() {
        return accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_car_type_accessory.acc_id
     *
     * @param accId the value for t_car_type_accessory.acc_id
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_car_type_accessory.disabled
     *
     * @return the value of t_car_type_accessory.disabled
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_car_type_accessory.disabled
     *
     * @param disabled the value for t_car_type_accessory.disabled
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_type_accessory
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carId=").append(carId);
        sb.append(", accId=").append(accId);
        sb.append(", disabled=").append(disabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_type_accessory
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
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
        CarTypeAccessory other = (CarTypeAccessory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()))
            && (this.getAccId() == null ? other.getAccId() == null : this.getAccId().equals(other.getAccId()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_car_type_accessory
     *
     * @mbggenerated Fri Apr 03 15:57:54 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        result = prime * result + ((getAccId() == null) ? 0 : getAccId().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        return result;
    }
}