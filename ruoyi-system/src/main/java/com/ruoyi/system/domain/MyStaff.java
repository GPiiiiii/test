package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import java.math.BigInteger;

public class MyStaff extends BaseEntity{
    private BigInteger StaffId;//工作人员ID

    private String StaffName;//工作人员名字

    private Long StaffAge;//工作人员年龄

    private Long StaffSex;//工作人员性别
    
    private String StaffPhone;//工作人员电话

    private Long StaffType;//员工类型

    private String del_flag;//删除标识

    public BigInteger getStaffId() {
        return StaffId;
    }

    public void setStaffId(BigInteger staffId) {
        StaffId = staffId;
    }

    public String getStaffName() {
        return StaffName;
    }

    public void setStaffName(String staffName) {
        StaffName = staffName;
    }

    public Long getStaffAge() {
        return StaffAge;
    }

    public void setStaffAge(Long staffAge) {
        StaffAge = staffAge;
    }

    public Long getStaffSex() {
        return StaffSex;
    }

    public void setStaffSex(Long staffSex) {
        StaffSex = staffSex;
    }

    public String getStaffPhone() {
        return StaffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        StaffPhone = staffPhone;
    }

    public Long getStaffType() {
        return StaffType;
    }

    public void setStaffType(Long staffType) {
        StaffType = staffType;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }

    @Override
    public String toString() {
        return "MyStaff{" +
                "StaffId=" + StaffId +
                ", StaffName='" + StaffName + '\'' +
                ", StaffAge=" + StaffAge +
                ", StaffSex=" + StaffSex +
                ", StaffPhone='" + StaffPhone + '\'' +
                ", StaffType=" + StaffType +
                ", del_flag='" + del_flag + '\'' +
                '}';
    }
}
