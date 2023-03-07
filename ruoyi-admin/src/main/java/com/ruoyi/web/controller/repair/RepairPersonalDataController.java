package com.ruoyi.web.controller.repair;

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
// 路由地址
@RequestMapping("/repair/personalData")
public class RepairPersonalDataController extends BaseController
{
    // 文件路径
    private String prefix = "repair";

    @RequiresPermissions("tool:build:view")
    @GetMapping()
    // 文件名
    public String build()
    {
        return prefix + "/PersonalData";
    }
}
