package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyUser extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private BigInteger UserId;
    private String UserName;
    private Integer UserAge;
    private String UserSex;
    private String UserPhone;
    private BigDecimal UserBalance;
    private String DelFlag;

    @Override
    public String toString() {
        return "MyCustomer{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserAge=" + UserAge +
                ", UserSex='" + UserSex + '\'' +
                ", UserPhone='" + UserPhone + '\'' +
                ", UserBalance=" + UserBalance +
                ", DelFlag='" + DelFlag + '\'' +
                '}';
    }

    public BigInteger getUserId() {
        return UserId;
    }

    public void setUserId(BigInteger userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getUserAge() {
        return UserAge;
    }

    public void setUserAge(Integer userAge) {
        UserAge = userAge;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public BigDecimal getUserBalance() {
        return UserBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        UserBalance = userBalance;
    }

    public String getDelFlag() {
        return DelFlag;
    }

    public void setDelFlag(String delFlag) {
        DelFlag = delFlag;
    }
}
