package com.ruoyi.system.service.impl;


import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.domain.MyRepair;
import com.ruoyi.system.domain.MyUser;
import com.ruoyi.system.domain.VO.MyUserVo;
import com.ruoyi.system.mapper.MyUserMapper;
import com.ruoyi.system.service.IMyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class IMyUserImpl implements IMyUser {
    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public List<MyUser> selectUserOnlineList(MyUser myUser) {
        SysUser currentUser = ShiroUtils.getSysUser();
        myUser.setUserId(BigInteger.valueOf(currentUser.getUserId()));
        return myUserMapper.selectUserOnlineList(myUser);
    }

    @Override
    public int updateMyuserOnline1(MyUser myUser) {
        return myUserMapper.updateMyuserOnline(myUser);
    }

    @Override
    public List<MyUser> selectUserAll() {
        return myUserMapper.selectUserAll();
    }

    @Override
    public MyUser selectUserById(Long id) {
        return myUserMapper.selectUserById(id);
    }

    @Override
    public int updateUser(MyUserVo myUserVo){ return myUserMapper.updateUser(myUserVo);}


    @Override
    public List<MyUser> selectUserList(MyUser myUser){return myUserMapper.selectUserList(myUser);}

    @Override
    public int deleteUserByIds(String ids) {

        Long[] userIds = Convert.toLongArray(ids);

        return myUserMapper.deleteUserByIds(userIds);
    }

    @Override
    public int insertUser(MyUser User) {
        return myUserMapper.insertUser(User);
    }

    @Override
    public int update(MyUserVo userVo) {
        return myUserMapper.update(userVo);
    }

    @Override
    public int updateUser1(MyUserVo userVo) {
        return myUserMapper.updateUser1(userVo);
    }
}
