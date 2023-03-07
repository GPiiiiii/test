package com.ruoyi.web.controller.customer;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.domain.MyUser;
import com.ruoyi.system.service.IMyService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/customer/wakeup")
public class wakeupController extends  BaseController{
    private String prefix = "customer";

    @Autowired
    IMyService iMyService;


    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/wakeup";
    }


    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyService myService)
    {
        startPage();
        //获取数据
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
         List<MyService> list = iMyService.selectServiceOnlineList(myService);
//        System.out.println("323232332");
        System.out.println("list = " + list);
        return getDataTable(list);
    }
    @RequiresPermissions("system:user:addService")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/addService")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyService myService)
    {

        return toAjax(iMyService.insert(myService));
    }

    @GetMapping("/addService")
    public String add(ModelMap mmap)
    {
        return prefix + "/addService";
    }
}
