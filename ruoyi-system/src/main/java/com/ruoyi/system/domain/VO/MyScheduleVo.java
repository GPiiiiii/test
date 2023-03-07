package com.ruoyi.system.domain.VO;

import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.*;
public class MyScheduleVo extends MySchedule {
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
                "MyScheduleVo{" +
                "Oldid=" + Oldid +
                '}';
    }
}




