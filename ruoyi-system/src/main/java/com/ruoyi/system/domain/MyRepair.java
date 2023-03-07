package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigInteger;

public class MyRepair extends BaseEntity {
    private Integer RepairId;
    private Integer RoomRepairStatus;
    private String RepairContent;
    private Integer RoomId;
    private BigInteger StaffId;




    public Integer getRepairId() {
        return RepairId;
    }

    public void setRepairId(Integer repairId) {
        RepairId = repairId;
    }

    public Integer getRoomRepairStatus() {
        return RoomRepairStatus;
    }

    public void setRoomRepairStatus(Integer roomRepairStatus) {
        RoomRepairStatus = roomRepairStatus;
    }

    public String getRepairContent() {
        return RepairContent;
    }

    public void setRepairContent(String repairContent) {
        RepairContent = repairContent;
    }

    public Integer getRoomId() {
        return RoomId;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public BigInteger getStaffId() {
        return StaffId;
    }

    public void setStaffId(BigInteger staffId) {
        StaffId = staffId;
    }

    @Override
    public String toString() {
        return "MyRepair{" +
                "RepairId=" + RepairId +
                ", RoomRepairStatus=" + RoomRepairStatus +
                ", RepairContent='" + RepairContent + '\'' +
                ", RoomId=" + RoomId +
                ", StaffId=" + StaffId +
                '}';
    }
}
