package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyStaffVo;

import java.math.BigInteger;
import java.util.List;

public interface IMyStaff {
    /**
     * 查询会话集合
     *
     * @param myStaff 分页参数
     * @return 会话集合
     */

    public List<MyStaff> selectUserOnlineList(MyStaff myStaff);

    public int updateStaffById(MyStaff myStaff);

    //MyStaff deleteStaffById(Long id);

    public List<MyStaff> selectStaffAll();

    public MyStaff selectStaffById(BigInteger id);

    int insert(MyStaff staff);

    int update(MyStaffVo roomVo);

    int deleteStaffByIds(String ids);

}
