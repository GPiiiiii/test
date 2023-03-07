package com.ruoyi.web.controller.home;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 路由地址
@RequestMapping("/home/notice")
public class NoticeController {
    // 文件路径
    private String prefix = "home";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    // 文件名
    public String build()
    {
        return prefix + "/notice";
    }
}
