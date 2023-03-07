package com.ruoyi.system.domain;

import java.math.BigInteger;

public class MyService {
    private Integer RoomServiceId;
    private String RoomServiceStatus;
    private Integer RoomId;
    private String Remarks;
    private BigInteger StaffId;

    private String RoomServiceType;



    public MyService() {
    }

    public Integer getRoomServiceId() {
        return RoomServiceId;
    }



    public Integer getRoomId() {
        return RoomId;
    }

    public String getRemarks() {
        return Remarks;
    }

    public BigInteger getStaffId() {
        return StaffId;
    }

    public void setRoomServiceId(Integer roomServiceId) {
        RoomServiceId = roomServiceId;
    }



    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public void setStaffId(BigInteger staffId) {
        StaffId = staffId;
    }


    public String getRoomServiceStatus() {
        return RoomServiceStatus;
    }

    public void setRoomServiceStatus(String roomServiceStatus) {
        RoomServiceStatus = roomServiceStatus;
    }

    public String getRoomServiceType() {
        return RoomServiceType;
    }

    public void setRoomServiceType(String roomServiceType) {
        RoomServiceType = roomServiceType;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "RoomServiceId=" + RoomServiceId +
                ", RoomServiceStatus='" + RoomServiceStatus + '\'' +
                ", RoomId=" + RoomId +
                ", Remarks='" + Remarks + '\'' +
                ", StaffId=" + StaffId +
                ", RoomServiceType='" + RoomServiceType + '\'' +
                '}';
    }
}
