package com.ruoyi.system.domain.VO;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyStaff;

public class MyStaffVo extends MyStaff {
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
                "MyStaffVo{" +
                "Oldid=" + Oldid +
                '}';
    }
}