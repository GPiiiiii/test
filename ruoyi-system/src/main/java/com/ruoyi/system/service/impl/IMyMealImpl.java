package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.MyService;
import com.ruoyi.system.mapper.MyMealMapper;
import com.ruoyi.system.service.IMyMeal;
import org.springframework.beans.factory.annotation.Autowired;

public class IMyMealImpl implements IMyMeal {

    @Autowired
    MyMealMapper myMealMapper;

    @Override
    public int insert(MyService myService) {
        return myMealMapper.insert(myService);
    }
}
