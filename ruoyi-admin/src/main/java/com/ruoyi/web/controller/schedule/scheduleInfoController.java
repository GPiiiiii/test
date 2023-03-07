package com.ruoyi.web.controller.schedule;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MyRoom;
import com.ruoyi.system.domain.MySchedule;
import com.ruoyi.system.domain.MyStaff;
import com.ruoyi.system.domain.VO.MyScheduleVo;
import com.ruoyi.system.domain.VO.MyStaffVo;
import com.ruoyi.system.service.IMySchedule;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

/**
 * build 表单构建
 *
 * @author ruoyi
 */
@Controller
@RequestMapping("/schedule/scheduleInfo")
public class scheduleInfoController extends BaseController{
    private String prefix = "schedule";

    @Autowired
    private IMySchedule myScheduleService;


    @RequiresPermissions("tool:build:view")
    @GetMapping()
    public String build(){
        return prefix + "/scheduleInfo";
    }

    @RequiresPermissions("schedule:scheduleInfo:list")
    @GetMapping("/list/{time}/{date}")
    public String list(@PathVariable String date,@PathVariable String time, ModelMap mmap){
        mmap.put("date",date);
        mmap.put("time",time);
        return prefix + "/list";
    }

    @RequiresPermissions("schedule:scheduleInfo:list")
    @PostMapping("/list/week/{date}")
    @ResponseBody
    public TableDataInfo listWeek(MySchedule mySchedule, @PathVariable String date)
    {
        startPage();
        mySchedule.setWeekDate(date);
        List<MySchedule> list = myScheduleService.selectmyScheduleList(mySchedule);

        System.out.println("list = " + list);
        return getDataTable(list);
    }




    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list/morning/{date}")
    @ResponseBody
    public TableDataInfo listMorning(MySchedule mySchedule, @PathVariable String date)
    {
        startPage();
        mySchedule.setIsmorning("1");
        mySchedule.setWeekDate(date);
        List<MySchedule> list = myScheduleService.selectmyScheduleList(mySchedule);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list/noon/{date}")
    @ResponseBody
    public TableDataInfo listNoon(MySchedule mySchedule, @PathVariable String date)
    {
        startPage();
        mySchedule.setIsnoon("1");
        mySchedule.setWeekDate(date);
        List<MySchedule> list = myScheduleService.selectmyScheduleList(mySchedule);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("monitor:online:list")
    @PostMapping("/list/night/{date}")
    @ResponseBody
    public TableDataInfo listNight(MySchedule mySchedule, @PathVariable String date)
    {
        startPage();
        mySchedule.setIsmidnight("1");
        mySchedule.setWeekDate(date);
        List<MySchedule> list = myScheduleService.selectmyScheduleList(mySchedule);

        System.out.println("list = " + list);
        return getDataTable(list);
    }

    @RequiresPermissions("schedule:scheduleInfo:list")
    @GetMapping("/update/{id}")
    public String update(@PathVariable BigInteger id, ModelMap mmap)
    {
        //System.out.println("id ==== "+id);
        //System.out.println(myScheduleService.selectScheduleById(id));
        mmap.put("schedule",myScheduleService.selectScheduleById(id));

        return prefix + "/scheduleUpdate";
    }

    @RequiresPermissions("system:user:update")
    @Log(title = "排班管理", businessType = BusinessType.INSERT)
    @PostMapping("/update")
    @ResponseBody
    public AjaxResult update(@RequestBody MyScheduleVo scheduleVo)
    {
        System.out.println("schedule = " + scheduleVo);

        return toAjax(myScheduleService.update(scheduleVo));
    }


    @RequiresPermissions("system:user:add")
    @Log(title = "排班管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody MySchedule schedule)
    {

        return toAjax(myScheduleService.insert(schedule));
    }

    @GetMapping("/add")
    public String add(ModelMap mmap)
    {
        return prefix + "/scheduleAdd";
    }

}
