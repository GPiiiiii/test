package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MySchedule;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyScheduleVo;

import java.math.BigInteger;
import java.util.List;

/**
 * 在线用户 数据层
 *
 * @author ruoyi
 */
public interface MyScheduleMapper
{

    List<MySchedule> selectmyScheduleList(MySchedule mySchedule);

    int deleteScheduleByIds(Long[] Ids);

    public MySchedule selectScheduleById(BigInteger StaffId);

    int insert(MySchedule mySchedule);
    int update(MyScheduleVo scheduleVo);
}
