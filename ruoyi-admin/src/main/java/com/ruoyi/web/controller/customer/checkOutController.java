package com.ruoyi.web.controller.customer;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.mapper.MyHelloMapper;
import com.ruoyi.system.service.IMyHello;
import com.ruoyi.system.service.IMyRoom;
import com.ruoyi.system.service.impl.IMyHelloImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer/checkOut")
public class checkOutController extends BaseController {
    @Autowired
    IMyRoom iMyRoom;
    private String prefix = "customer";
    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/checkOut";
    }
    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MyRoom myRoom)
    {
        startPage();
        //获取数据
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(myRoom);
        List<MyRoom> list =iMyRoom.selectUserRoomById(myRoom);
     System.out.println("323232332");
        System.out.println("list = " + list);
        return getDataTable(list);
    }
    @RequiresPermissions("tool:build:view")
    @GetMapping("/click/{id}")
    @ResponseBody
    // 文件名
    public int click(@PathVariable BigInteger id)
    {
        int a =iMyRoom.updateUserRoomById(id);
        return a;
    }
}
