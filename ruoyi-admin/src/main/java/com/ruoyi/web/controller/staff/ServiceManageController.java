package com.ruoyi.web.controller.staff;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.service.IMyService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/staff/serviceManage")
public class ServiceManageController extends BaseController {
    private String prefix = "staff";

    @Autowired
    IMyService imyService;

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/ServiceManage";
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyService myService) {
        startPage();
        //获取数据
        List<MyService> list = imyService.selectServiceOnlineList(myService);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("monitor:online:list")
    @GetMapping ("/complete/{roomServiceId}")
    @ResponseBody
    public AjaxResult complete(@PathVariable Integer roomServiceId) {
        startPage();
        //获取数据
        Integer res = imyService.completeService(roomServiceId);

        System.out.println("res = " + res);
        return toAjax(res);
    }


}