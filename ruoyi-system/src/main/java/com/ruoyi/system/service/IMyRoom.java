package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

public interface IMyRoom {
    /**
     * 查询会话集合
     *
     * @param myRoom 分页参数
     * @return 会话集合
     */

    public List<MyRoom> selectUserOnlineList(MyRoom myRoom);

    public List<MyRoom> selectRoomAll();
    public List<MyRoom> selectUserRoomById(MyRoom myRoom);
    int updateUserRoomById(BigInteger id);
}
