package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.mapper.MyHelloMapper;
import com.ruoyi.system.mapper.MyRoomMapper1;
import com.ruoyi.system.service.IMyRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class IMyRoomImpl implements IMyRoom{
    @Autowired
    private MyHelloMapper myHelloMapper;

    @Override
    public List<MyRoom> selectUserOnlineList(MyRoom myRoom) {
        return  myHelloMapper.selectUserOnlineList(myRoom);
    }



    @Override
    public List<MyRoom> selectRoomAll() {
        return myHelloMapper.selectRoomAll();
    }

    @Override
    public List<MyRoom> selectUserRoomById(MyRoom myRoom) {
        SysUser currentUser = ShiroUtils.getSysUser();
        myRoom.setUserId(BigInteger.valueOf(currentUser.getUserId()));
        System.out.println("///////////////////////"+currentUser.getUserId());
        return myHelloMapper.selectUserRoomById(myRoom);
    }

    @Override
    public int updateUserRoomById(BigInteger id) {

        return myHelloMapper.updateUserRoomById(id);
    }
}
