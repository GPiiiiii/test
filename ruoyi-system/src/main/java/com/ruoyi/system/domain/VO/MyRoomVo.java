package com.ruoyi.system.domain.VO;

import com.ruoyi.system.domain.MyRoom;

public class MyRoomVo extends MyRoom {
    private Long Oldid;

    public Long getOldid() {
        return Oldid;
    }

    public void setOldid(Long oldid) {
        Oldid = oldid;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "MyRoomVo{" +
                "Oldid=" + Oldid +
                '}';
    }
}
