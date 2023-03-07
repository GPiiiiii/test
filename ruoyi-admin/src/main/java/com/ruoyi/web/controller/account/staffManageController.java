package com.ruoyi.web.controller.account;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.VO.MyRoomVo;
import com.ruoyi.system.domain.VO.MyStaffVo;
import com.ruoyi.system.service.IMyStaff;
import com.ruoyi.common.core.page.TableDataInfo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Controller
// 路由地址
@RequestMapping("/account/staffManage")
public class staffManageController extends BaseController{
    @Autowired
    IMyStaff iMyStaff;
    //文件路径
    private String prefix = "account";

    @RequiresPermissions("account:staffManage:list")
    @GetMapping()
    public String build()
    {
        return prefix + "/staffManage";
    }

    @RequiresPermissions("account:staffManage:list")
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

    @RequiresPermissions("account:staffManage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyStaff myStaff)
    {
        startPage();
        //获取数据
        List<MyStaff> list = iMyStaff.selectUserOnlineList(myStaff);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("staff:manage:update")
    @GetMapping("/update/{id}")
    public String update(@PathVariable BigInteger id, ModelMap mmap)
    {

        mmap.put("staff",iMyStaff.selectStaffById(id));

        return prefix + "/StaffUpdate";
    }

    @RequiresPermissions("system:user:update")
    @Log(title = "工作人员管理", businessType = BusinessType.INSERT)
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody MyStaffVo staffVo)
    {
        System.out.println("staff = " + staffVo);

        return toAjax(iMyStaff.update(staffVo));
    }


    @RequiresPermissions("system:user:add")
    @Log(title = "工作人员管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MyStaff staff)
    {

        return toAjax(iMyStaff.insert(staff));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        return prefix + "/StaffAdd";
    }

    @RequiresPermissions("staff:manage:remove")
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iMyStaff.deleteStaffByIds(ids));
    }
}

