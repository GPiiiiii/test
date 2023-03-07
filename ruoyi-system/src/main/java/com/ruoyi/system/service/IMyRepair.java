package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyRepair;
import com.ruoyi.system.domain.VO.MyRepairVo;

import java.util.List;

public interface IMyRepair {
    /**
     * 查询会话集合
     *
     * @param myRepair 分页参数
     * @return 会话集合
     */
    public List<MyRepair> selectUserOnlineList(MyRepair myRepair);

    int update(MyRepairVo repairVo);

    MyRepair selectRepairById(Long id);
}
