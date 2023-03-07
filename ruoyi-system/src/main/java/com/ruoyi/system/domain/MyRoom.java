package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigInteger;

public class MyRoom extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 参数主键 */

    private Integer RoomId;

    /** 类型 */

    private String RoomType;

    /** 价格 */

    private Double RoomPrice;

    /** 房间入住状态（0未入住，1已入住） */

    private String RoomOccupancyStatus;

    /** 房间清洁状态（0未入住，1已入住） */

    private String RoomCleanStatus;

    /** 房间维修状态（0未入住，1已入住） */

    private String RoomServiceStatus;

    /** 住户ID */

    private BigInteger UserId;



    public Integer getRoomId() {
        return RoomId;
    }

    public void setRoomId(Integer roomId) {
        RoomId = roomId;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public Double getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        RoomPrice = roomPrice;
    }

    public String getRoomOccupancyStatus() {
        return RoomOccupancyStatus;
    }

    public void setRoomOccupancyStatus(String roomOccupancyStatus) {
        RoomOccupancyStatus = roomOccupancyStatus;
    }

    public String getRoomCleanStatus() {
        return RoomCleanStatus;
    }

    public void setRoomCleanStatus(String roomCleanStatus) {
        RoomCleanStatus = roomCleanStatus;
    }

    public String getRoomServiceStatus() {
        return RoomServiceStatus;
    }

    public void setRoomServiceStatus(String roomServiceStatus) {
        RoomServiceStatus = roomServiceStatus;
    }

    public BigInteger getUserId() {
        return UserId;
    }

    public void setUserId(BigInteger userId) {
        UserId = userId;
    }

    @Override
    public String toString() {
        return "MyRoom{" +
                "RoomId=" + RoomId +
                ", RoomType='" + RoomType + '\'' +
                ", RoomPrice=" + RoomPrice +
                ", RoomOccupancyStatus='" + RoomOccupancyStatus + '\'' +
                ", RoomCleanStatus='" + RoomCleanStatus + '\'' +
                ", RoomServiceStatus='" + RoomServiceStatus + '\'' +
                ", UserId=" + UserId +
                '}';
    }
}
