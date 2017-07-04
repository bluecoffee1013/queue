package com.bluecoffee.queue.domain;

import java.util.Date;

public class UserOrder extends BaseEntity{
    private Long orderId;

    private String userName;

    private Integer gender;

    private String idCardNumber;

    private String socialCardNumber;

    private String userMobile;

    private Integer orderType;

    private Date orderDate;

    private Date orderApplyTime;

    private Long orderNumber;

    private Date getOrderTime;

    private Date effectiveTime;

    private Integer state;

    private String createOperator;

    private Date createTime;

    private String updateOperator;

    private Date updateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    public String getSocialCardNumber() {
        return socialCardNumber;
    }

    public void setSocialCardNumber(String socialCardNumber) {
        this.socialCardNumber = socialCardNumber == null ? null : socialCardNumber.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderApplyTime() {
        return orderApplyTime;
    }

    public void setOrderApplyTime(Date orderApplyTime) {
        this.orderApplyTime = orderApplyTime;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getGetOrderTime() {
        return getOrderTime;
    }

    public void setGetOrderTime(Date getOrderTime) {
        this.getOrderTime = getOrderTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(String updateOperator) {
        this.updateOperator = updateOperator == null ? null : updateOperator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}