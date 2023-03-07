package com.ruoyi.web.controller.customer;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer/personalInformation")
public class personalInfoController extends BaseController {
    private String prefix = "customer";

    @Autowired
    IMyUser iMyUser;

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/personalInformation";
    }



    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyUser myUser)
    {
        startPage();
        //获取数据
        System.out.println(myUser);
        List<MyUser> list = iMyUser.selectUserOnlineList(myUser);
//        boolean a=list.contains(myUser.getUserId());
//        System.out.println(a);
//        Object list1[]=list.toArray();
//        System.out.println(list.size());
//        for(int i=0;i<list1.length;i++){
//            if(list1[i][0]==myUser.getUserId()&&)
//        }
//
        System.out.println("list = " + list);
        return getDataTable(list);
    }



    @RequiresPermissions("test:personalinformation:userUpdate")
    @GetMapping("/userUpdate/{id}")
    public String update(@PathVariable Long id, ModelMap mmap)
    {

        mmap.put("user",iMyUser.selectUserById(id));

        return prefix + "/userUpdate";

    }
    @RequiresPermissions("system:user:update")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/userUpdate")
    @ResponseBody
    public AjaxResult update(@RequestBody MyUserVo myUserVo)
    {
        System.out.println("aaauser = " + myUserVo);

        return toAjax(iMyUser.updateUser(myUserVo));
    }
}
