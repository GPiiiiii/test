package com.ruoyi.system.domain.VO;

import com.ruoyi.system.domain.MyRepair;

public class MyRepairVo extends MyRepair {
    private Long Oldid;

    public Long getOldid() {
        return Oldid;
    }

    public void setOldid(Long oldid) {
        Oldid = oldid;
    }

    @Override
    public String toString() {
        return super.toString()+
                "MyRepairVo{" +
                "Oldid=" + Oldid +
                '}';
    }
}
