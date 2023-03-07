package com.ruoyi.system.service;

import com.ruoyi.system.domain.MyService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMyService {
    public List<MyService> selectServiceOnlineList(MyService myService);

    public MyService selectServiceById(Long id);

    int insert(MyService myService);

    Integer completeService(Integer roomServiceId);

    int insertMeal(MyService myService);

    List<MyService> selectUserServiceList(MyService myService);
}
