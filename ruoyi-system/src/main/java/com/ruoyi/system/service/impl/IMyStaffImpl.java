package com.ruoyi.system.service.impl;
//111
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.VO.MyStaffVo;
import com.ruoyi.system.mapper.MyCleanMapper;
import com.ruoyi.system.mapper.MyScheduleMapper;
import com.ruoyi.system.mapper.MyStaffMapper;
import com.ruoyi.system.service.IMyStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class IMyStaffImpl implements IMyStaff {

    @Autowired
    private MyStaffMapper myStaffMapper;

    @Autowired
    private MyCleanMapper myCleanMapper;

    @Autowired
    private MyScheduleMapper myScheduleMapper;

    @Override
    public List<MyStaff> selectUserOnlineList(MyStaff myStaff) { return myStaffMapper.selectUserOnlineList(myStaff);}

    @Override
    public int updateStaffById(MyStaff myStaff) {
        return myStaffMapper.updateStaffById(myStaff);
    }


    @Override
    public List<MyStaff> selectStaffAll() {
        return myStaffMapper.selectStaffAll();
    }


    @Override
    public MyStaff selectStaffById(BigInteger id) {
        return myStaffMapper.selectStaffById(id);
    }

    @Override
    public int insert(MyStaff staff) {
        return myStaffMapper.insert(staff);
    }

    @Override
    public int update(MyStaffVo staffVo) {
        return myStaffMapper.update(staffVo);
    }

    @Override
    public int deleteStaffByIds(String ids) {

        Long[] staffIds = Convert.toLongArray(ids);

        //删除员工相关数据库
        myCleanMapper.deleteCleanByIds(staffIds);
        myScheduleMapper.deleteScheduleByIds(staffIds);

        return myStaffMapper.deleteStaffByIds(staffIds);
    }



}
