package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRoomVo;

import java.util.List;

public interface IMyHello {

    /**
     * 查询会话集合
     *
     * @param myRoom 分页参数
     * @return 会话集合
     */
    public List<MyRoom> selectUserOnlineList(MyRoom myRoom);

    public List<MyRoom> selectRoomAll();

    MyRoom selectRoomById(Long id);

    int deleteRoomByIds(String ids);

    int insert(MyRoom room);

    int update(MyRoomVo roomVo);
}
