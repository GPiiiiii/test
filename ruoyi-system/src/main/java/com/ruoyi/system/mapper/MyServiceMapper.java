package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.domain.MyUser;

import java.util.List;

public interface MyServiceMapper {
    public List<MyService> selectServiceOnlineList(MyService myService);
    public MyService selectServiceById(Long id);

    public int insert(MyService myService);
    public List<MyService> selectUserServiceList(MyService myService);

    Integer completeService(Integer roomServiceId);

    int insertMeal(MyService myService);
}
