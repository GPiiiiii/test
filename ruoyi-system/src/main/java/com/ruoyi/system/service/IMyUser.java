package com.ruoyi.system.service;


import com.ruoyi.system.domain.MyRepair;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.MyUser;
import com.ruoyi.system.domain.VO.MyStaffVo;
import com.ruoyi.system.domain.VO.MyUserVo;


import java.math.BigInteger;
import java.util.List;
public interface IMyUser {
    /**
     * 查询会话集合
     *
     * @param myUser 分页参数
     * @return 会话集合
     */
    public List<MyUser> selectUserOnlineList(MyUser myUser);
    /**
     * 更新
     * @param myUser
     * @return
     */

    public List<MyUser> selectUserList(MyUser myUser);
    public int updateMyuserOnline1(MyUser myUser);

    public List<MyUser> selectUserAll();

    MyUser selectUserById(Long id);

    public int updateUser(MyUserVo myUserVo);
    public int updateUser1(MyUserVo myUserVo);

    int deleteUserByIds(String ids);

    int insertUser(MyUser user);

    int update(MyUserVo userVo);
}
