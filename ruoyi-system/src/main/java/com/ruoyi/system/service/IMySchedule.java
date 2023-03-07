package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MySchedule;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyScheduleVo;

import java.math.BigInteger;
import java.util.List;

public interface IMySchedule {

    /**
     * 查询会话集合
     *
     * @param myRoom 分页参数
     * @return 会话集合
     */
    public List<MyRoom> selectUserOnlineList(MyRoom myRoom);

    MyRoom selectRoomById(Long id);

    public MySchedule selectScheduleById(BigInteger id);

    int insert(MySchedule schedule);

    int update(MyScheduleVo scheduleVo);

    List<MySchedule> selectmyScheduleList(MySchedule mySchedule);


   }
