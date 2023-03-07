package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.MyRoom;
import java.util.List;
/*

 */
public interface MyRoomMapper1 {


    public List<MyRoom> selectUserOnlineList(MyRoom myRoom);

    public MyRoom selectRoomById(Long RoomId);

    public List<MyRoom> selectRoomAll();
    public List<MyRoom> selectUserRoomById(MyRoom myRoom);


}


