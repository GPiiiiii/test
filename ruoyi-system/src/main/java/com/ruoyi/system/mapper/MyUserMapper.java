package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.*;
import com.ruoyi.system.domain.VO.MyStaffVo;
import com.ruoyi.system.domain.VO.MyUserVo;

import java.util.List;

public interface MyUserMapper {

    /**
     * 在线用户 数据层
     *
     * @author ruoyi
     */
//    public MyUser selectUserById(Long UserId);
//
//        /**
//         * 通过会话序号查询信息
//         *
//         * @param sessionId 会话ID
//         * @return 在线用户信息
//         */
//        public SysUserOnline selectOnlineById(String sessionId);
//
//        /**
//         * 通过会话序号删除信息
//         *
//         * @param sessionId 会话ID
//         * @return 在线用户信息
//         */
//        public int deleteOnlineById(String sessionId);
//
//        /**
//         * 保存会话信息
//         *
//         * @param online 会话信息
//         * @return 结果
//         */
//        public int saveOnline(SysUserOnline online);

        /**
         * 查询会话集合
         *
         * @param myUser 会话参数
         * @return 会话集合
         */
        public List<MyUser> selectUserOnlineList(MyUser myUser);

        public List<MyUser> selectUserAll();

        public int updateMyuserOnline(MyUser myUser);
        public MyUser selectUserById(Long userId);
        public int updateUser(MyUserVo myUserVo);
        public int updateUser1(MyUserVo myUserVo);

        public List<MyUser> selectUserList(MyUser myUser);

        int deleteUserByIds(Long[] ids);

        int insertUser(MyUser User);

        int update(MyUserVo userVo);
}
