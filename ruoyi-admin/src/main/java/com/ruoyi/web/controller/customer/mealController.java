package com.ruoyi.web.controller.customer;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.service.IMyService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/customer/meal")
public class mealController extends BaseController{
    private String prefix = "customer";

    @Autowired
    IMyService imyService;



    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build() {

        // 获取当前的用户信息
        SysUser currentUser = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        String userName = currentUser.getUserName();
        System.out.println("userinfo -------->" + currentUser);
        return prefix + "/meal";
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyRoom myRoom) {
        startPage();
        //获取数据
        // 获取当前的用户信息
        SysUser currentUser = ShiroUtils.getSysUser();
        // 获取当前的用户名称
        Long userId = currentUser.getUserId();
        MyService myService = imyService.selectServiceById(userId);
        // mmap.put("service", imyService.selectServiceById(userId));
        List<MyService> list = null;
        list.add(myService);
        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("system:user:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyService myService)
    {

        return toAjax(imyService.insertMeal(myService));
    }






}
