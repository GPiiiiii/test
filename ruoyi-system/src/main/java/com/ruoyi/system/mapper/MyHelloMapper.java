package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRoomVo;

import java.math.BigInteger;
import java.util.List;

/**
 * 在线用户 数据层
 * 
 * @author ruoyi
 */
public interface MyHelloMapper
{

    public MyRoom selectRoomById(Long RoomId);


    public List<MyRoom> selectUserOnlineList(MyRoom myRoom);

    public List<MyRoom> selectRoomAll();

    int deleteRoomByIds(Long[] ids);


    int insert(MyRoom room);

    int update(MyRoomVo roomVo);
    public MyRoom selectRoomByUserId(Long userId);
    public List<MyRoom> selectUserRoomById(MyRoom myRoom);
    int updateUserRoomById(BigInteger id);
}
