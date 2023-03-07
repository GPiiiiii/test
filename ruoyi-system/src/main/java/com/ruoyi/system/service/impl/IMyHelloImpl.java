package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.mapper.MyHelloMapper;
import com.ruoyi.system.mapper.MyRepairMapper;
import com.ruoyi.system.mapper.SysUserOnlineMapper;
import com.ruoyi.system.service.IMyHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IMyHelloImpl implements IMyHello {

    @Autowired
    private MyHelloMapper myHelloMapper;

    @Autowired
    private MyRepairMapper myRepairMapper;

    @Override
    public List<MyRoom> selectUserOnlineList(MyRoom myRoom) {
        return myHelloMapper.selectUserOnlineList(myRoom);
    }

    @Override
    public List<MyRoom> selectRoomAll() {
        return myHelloMapper.selectRoomAll();
    }


    @Override
    public MyRoom selectRoomById(Long id) {
        return myHelloMapper.selectRoomById(id);
    }

    @Override
    public int deleteRoomByIds(String ids) {

        Long[] userIds = Convert.toLongArray(ids);

        //删除房间相关维修单
        myRepairMapper.deleteRepireByIds(userIds);

        return myHelloMapper.deleteRoomByIds(userIds);
    }

    /**
     * 新增数据
     * @param room
     * @return
     */
    @Override
    public int insert(MyRoom room) {

        return myHelloMapper.insert(room);
    }

    @Override
    public int update(MyRoomVo roomVo) {
        return myHelloMapper.update(roomVo);
    }
}
