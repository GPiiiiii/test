package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MySchedule;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyScheduleVo;
import com.ruoyi.system.mapper.MyScheduleMapper;
import com.ruoyi.system.service.IMySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class IMyScheduleImpl implements IMySchedule {

    @Autowired
    private MyScheduleMapper myScheduleMapper;


    @Override
    public List<MyRoom> selectUserOnlineList(MyRoom myRoom) {
        return null;
    }

    @Override
    public MyRoom selectRoomById(Long id) {
        return null;
    }

    @Override
    public MySchedule selectScheduleById(BigInteger id) {
        return myScheduleMapper.selectScheduleById(id);
    }

    @Override
    public int insert(MySchedule schedule) { return myScheduleMapper.insert(schedule); }

    @Override
    public int update(MyScheduleVo scheduleVo) {
        return myScheduleMapper.update(scheduleVo);
    }

    @Override
    public List<MySchedule> selectmyScheduleList(MySchedule mySchedule) {


        return myScheduleMapper.selectmyScheduleList(mySchedule);
    }


}
