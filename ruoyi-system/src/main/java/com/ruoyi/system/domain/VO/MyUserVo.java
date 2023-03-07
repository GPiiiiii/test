package com.ruoyi.system.domain.VO;

import com.ruoyi.system.domain.MyUser;

public class MyUserVo extends MyUser {
    private Long oldUserId;

    public Long getOldUserId() {
        return oldUserId;
    }

    public void setOldUserId(Long oldUserId) {
        this.oldUserId = oldUserId;
    }

    @Override
    public String toString() {
        return "MyUserVo{" +
                "oldUserId=" + oldUserId +
                '}';
    }
}
