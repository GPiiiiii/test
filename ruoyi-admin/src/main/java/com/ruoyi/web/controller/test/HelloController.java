package com.ruoyi.web.controller.test;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.service.IMyHello;
import com.ruoyi.system.service.ISysRoleService;
import com.ruoyi.system.service.ISysUserOnlineService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * build 表单构建
 * 
 * @author ruoyi
 */
@Controller
// 路由地址
@RequestMapping("/test/hello")
public class HelloController extends BaseController {
    // 文件路径
    private String prefix = "test/hello";

    @Autowired
    IMyHello myHello;

    @Autowired
    ISysRoleService roleService;


    /**
     * 跳转hello
     * @return
     */
    @RequiresPermissions("tool:build:view")
    @GetMapping()
    // 文件名
    public String hello()
    {
        return prefix + "/hello";
    }


    /**
     * 跳转hello2
     * @return
     */

    @RequiresPermissions("tool:build:view")
    @GetMapping("/hello2")
    // 文件名
    public String hello2()
    {
        return prefix + "/hello2";
    }




    /**
     * 点击按钮
     * @return
     */
    @RequiresPermissions("tool:build:view")
    @GetMapping("/click/{id}")
    @ResponseBody
    // 文件名
    public ArrayList<String> click(@PathVariable int id)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("idididid");
        System.out.println("你的id是"+id);
        return list;
    }

    /**
     * 获取房间列表
     * @return
     */
    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyRoom myRoom)
    {
        startPage();
        //获取数据
        List<MyRoom> list = myHello.selectUserOnlineList(myRoom);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("test:hello:update")
    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, ModelMap mmap)
    {

        mmap.put("room",myHello.selectRoomById(id));

        return prefix + "/update";
    }


    @RequiresPermissions("system:user:update")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/update")
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

    @RequiresPermissions("system:user:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyRoom room)
    {

        return toAjax(myHello.insert(room));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        return prefix + "/add";
    }






}



