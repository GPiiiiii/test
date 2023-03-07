package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.mapper.MyHelloMapper;
import com.ruoyi.system.mapper.MyServiceMapper;
import com.ruoyi.system.service.IMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class IMyServiceImpl implements IMyService {

    @Autowired
    private MyServiceMapper myServiceMapper;

    @Autowired
    private MyHelloMapper myHelloMapper;


    @Override
    public List<MyService> selectServiceOnlineList(MyService myService) {
        return myServiceMapper.selectServiceOnlineList(myService);
    }

    @Override
    public MyService selectServiceById(Long id) {
        return myServiceMapper.selectServiceById(id);
    }

    @Override
    public int insert(MyService myService) {
        return myServiceMapper.insert(myService);
    }

    @Override
    public Integer completeService(Integer roomServiceId) {
        return myServiceMapper.completeService(roomServiceId);
    }

    @Override
    public int insertMeal(MyService myService) {
        SysUser currentUser = ShiroUtils.getSysUser();
        Long a=currentUser.getUserId();
        MyRoom room =  myHelloMapper.selectRoomByUserId(a);
        System.out.println(room);
        Integer b =room.getRoomId();
        myService.setRoomId(b);
        return myServiceMapper.insertMeal(myService);
    }


    @Override
    public List<MyService> selectUserServiceList(MyService myService) {
        SysUser currentUser = ShiroUtils.getSysUser();
        Long a=currentUser.getUserId();
        MyRoom room =  myHelloMapper.selectRoomByUserId(a);
        System.out.println(room);
        Integer b =room.getRoomId();
        myService.setRoomId(b);
        return myServiceMapper.selectUserServiceList(myService);
    }


}
