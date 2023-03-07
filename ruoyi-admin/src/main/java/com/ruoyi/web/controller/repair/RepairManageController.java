package com.ruoyi.web.controller.repair;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyRepair;
import com.ruoyi.system.domain.VO.MyRepairVo;
import com.ruoyi.system.service.IMyRepair;
import com.ruoyi.system.service.IMyRoom;
import com.ruoyi.system.service.IMyStaff;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * build 表单构建
 *
 * @author ruoyi
 */
@Controller
// 路由地址
@RequestMapping("/repair/manage")
public class RepairManageController extends BaseController {

    @Autowired
    IMyRepair imyRepair;

    @Autowired
    IMyStaff imyStaff;

    @Autowired
    IMyRoom imyRoom;

    // @Autowired
    // IRoomService roomService;

    // 文件路径
    private String prefix = "repair";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    // 文件名
    public String build() {
        return prefix + "/RepairManage";
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyRepair myRepair) {
        startPage();
        //获取数据
        List<MyRepair> list = imyRepair.selectUserOnlineList(myRepair);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("repair:manage:edit")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, ModelMap mmap) {

        mmap.put("repair", imyRepair.selectRepairById(id));
        mmap.put("staffs", imyStaff.selectStaffAll());
        mmap.put("rooms", imyRoom.selectRoomAll());

        return prefix + "/edit";
        // return objects;
    }

    @RequiresPermissions("system:repair:update")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody MyRepairVo repairVo)
    {
        System.out.println("repair = " + repairVo);

        return toAjax(imyRepair.update(repairVo));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        mmap.put("staffs", imyStaff.selectStaffAll());
        mmap.put("rooms", imyRoom.selectRoomAll());
        return prefix + "/add";
    }
}
