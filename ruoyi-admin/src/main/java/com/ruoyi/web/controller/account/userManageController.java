package com.ruoyi.web.controller.account;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.MyUser;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyUserVo;
import com.ruoyi.system.service.IMyUser;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/**
 * build 表单构建
 *
 * @author ruoyi
 */

@Controller
@RequestMapping("/account/userManage")
public class userManageController extends BaseController{

    @Autowired
    IMyUser iMyUser;

    private String prefix = "account";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/userManage";
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyUser myUser)
    {
       startPage();
        //获取数据
        List<MyUser> list = iMyUser.selectUserList(myUser);
        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("user:manage:update")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, ModelMap mmap)
    {
        mmap.put("user",iMyUser.selectUserById(id));

        return prefix + "/UserUpdate";
    }

    @RequiresPermissions("system:user:update")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody MyUserVo userVo)
    {
        System.out.println("user = " + userVo);

        return toAjax(iMyUser.updateUser1(userVo));
    }

    @RequiresPermissions("system:user:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyUser user)
    {

        return toAjax(iMyUser.insertUser(user));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        return prefix + "/UserAdd";
    }

    @RequiresPermissions("user:manage:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iMyUser.deleteUserByIds(ids));
    }
}
