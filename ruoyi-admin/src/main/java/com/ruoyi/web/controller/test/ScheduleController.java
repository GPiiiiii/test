package com.ruoyi.web.controller.test;

import com.ruoyi.common.core.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * build 表单构建
 *
 * @author ruoyi
 */

@Controller
@RequestMapping("/test/schedule")
public class ScheduleController extends BaseController{
    private String prefix = "test/schedule";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build()
    {
        return prefix + "/schedule";
    }

}
