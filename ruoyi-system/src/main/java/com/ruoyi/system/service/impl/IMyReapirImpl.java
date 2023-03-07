package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.MyRepair;

import com.ruoyi.system.domain.VO.MyRepairVo;
import com.ruoyi.system.mapper.MyRepairMapper;

import com.ruoyi.system.service.IMyRepair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IMyReapirImpl implements IMyRepair {
    @Autowired
    private MyRepairMapper myRepairMapper;

    @Override
    public List<MyRepair> selectUserOnlineList(MyRepair myRepair) {
        return myRepairMapper.selectUserOnlineList(myRepair);
    }

    @Override
    public int update(MyRepairVo repairVo) {
        return myRepairMapper.update(repairVo);
    }

    @Override
    public MyRepair selectRepairById(Long id) {
        return myRepairMapper.selectRepairById(id);
    }
}
