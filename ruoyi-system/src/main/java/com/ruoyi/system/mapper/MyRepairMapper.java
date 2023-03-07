package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.MyRepair;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRepairVo;

import java.util.List;

public interface MyRepairMapper {
    /**
     * 通过会话序号查询信息
     *
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    public SysUserOnline selectOnlineById(String sessionId);

    /**
     * 通过会话序号删除信息
     *
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    public int deleteOnlineById(String sessionId);

    /**
     * 保存会话信息
     *
     * @param online 会话信息
     * @return 结果
     */
    public int saveOnline(SysUserOnline online);

    /**
     * 查询会话集合
     *
     * @param userOnline 会话参数
     * @return 会话集合
     */
    public List<MyRepair> selectUserOnlineList(MyRepair myRepair);

    /**
     * 更新
     * @param myRepair
     * @return
     */

    int update(MyRepairVo repairVo);
                                               /**
     * 查询过期会话集合
     *
     * @param lastAccessTime 过期时间
     * @return 会话集合
     */
    public List<SysUserOnline> selectOnlineByExpired(String lastAccessTime);

    public MyRepair selectRepairById(Long id);

    int deleteRepireByIds(Long[] userIds);
}
