package com.ruoyi.web.controller.staff;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.service.IMyHello;
import com.ruoyi.system.service.IMyRoom;
import com.ruoyi.system.service.IMyUser;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/staff/roomManage")
public class RoomManageController extends BaseController {
    private String prefix = "staff";

    @Autowired
    IMyHello myHello;

    @Autowired
    IMyUser myUser;

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/StaffRoomManage";
    }


    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyRoom myRoom) {
        startPage();
        //获取数据
        List<MyRoom> list = myHello.selectUserOnlineList(myRoom);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("system:user:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyRoom room)
    {

        return toAjax(myHello.insert(room));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap) {
        mmap.put("rooms", myHello.selectRoomAll());
        return prefix + "/RoomAdd";
    }

    @RequiresPermissions("staff:room:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, ModelMap mmap) {

        mmap.put("rooms", myHello.selectRoomById(id));
        mmap.put("users", myUser.selectUserAll());
        return prefix + "/RoomEdit";
    }

    @RequiresPermissions("system:user:update")
    @Log(title = "房间管理", businessType = BusinessType.INSERT)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult update(@RequestBody MyRoomVo roomVo)
    {
        System.out.println("room = " + roomVo);

        return toAjax(myHello.update(roomVo));
    }

    @RequiresPermissions("test:hello:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(myHello.deleteRoomByIds(ids));
    }
}

