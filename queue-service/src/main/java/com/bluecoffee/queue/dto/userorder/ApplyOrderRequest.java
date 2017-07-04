package com.bluecoffee.queue.dto.userorder;

import java.util.Date;

/**
 * Created by qianlong on 2017/7/4.
 */
public class ApplyOrderRequest {

    private String userName;

    private Integer gender;

    private String idCardNumber;

    private String socialCardNumber;

    private String userMobile;

    private Integer orderType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        this.idCardNumber = idCardNumber;
    }

    public String getSocialCardNumber() {
        return socialCardNumber;
    }

    public void setSocialCardNumber(String socialCardNumber) {
        this.socialCardNumber = socialCardNumber;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
}
