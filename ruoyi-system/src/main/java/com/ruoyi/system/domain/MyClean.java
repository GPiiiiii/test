package com.ruoyi.system.domain;

import java.math.BigInteger;

public class MyClean {
    private Integer CleanId;
    private Integer RoomCleanStatus;
    private String CleanContent;
    private Integer RoomId;
    private BigInteger StaffId;

    public MyClean() {
    }

    public Integer getCleanId() {
        return CleanId;
    }

    public Integer getRoomCleanStatus() {
        return RoomCleanStatus;
    }

    public String getCleanContent() {
        return CleanContent;
    }

    public Integer getRoomId() {
        return RoomId;
    }

    public void setCleanId(Integer cleanId) {
        CleanId = cleanId;
    }

    public void setRoomCleanStatus(Integer roomCleanStatus) {
        RoomCleanStatus = roomCleanStatus;
    }

    public void setCleanContent(String cleanContent) {
        CleanContent = cleanContent;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    @Override
    public String toString() {
        return "MyClean{" +
                "CleanId=" + CleanId +
                ", RoomCleanStatus=" + RoomCleanStatus +
                ", CleanContent='" + CleanContent + '\'' +
                ", RoomId=" + RoomId +
                '}';
    }
}
