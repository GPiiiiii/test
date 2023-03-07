package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyStaffVo;

import java.math.BigInteger;
import java.util.List;

public interface MyStaffMapper {
    /**
     * 查询会话集合
     *
     * @param MyStaff 会话参数
     * @return 会话集合
     */
    public List<MyStaff> selectUserOnlineList(MyStaff MyStaff);

    /**
     * 查询过期会话集合
     *
     * @param lastAccessTime 过期时间
     * @return 会话集合
     */
    public List<SysUserOnline> selectOnlineByExpired(String lastAccessTime);

    public List<MyStaff> selectStaffAll();

    int insert(MyStaff myStaff);

    int update(MyStaffVo staffVo);

    public int deleteStaffById(Long[] id);

    public int updateStaffById(MyStaff myStaff);

    public int deleteStaffByIds(Long[] ids);

    public MyStaff selectStaffById(BigInteger id);
}
