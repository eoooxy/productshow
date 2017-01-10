package com.ahoo.controller;

import com.ahoo.entity.SingleParameDesEntity;
import com.ahoo.service.SingleParameDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xueyuan
 * @dater 2017-1-10 0010.
 */

@Controller
public class SingleParameDesController {

    @Autowired
    SingleParameDesService singleParameDesService;


    @RequestMapping("getParameDes.do")
    public String getParameDes(ModelMap modelMap, String type, String des) {

        SingleParameDesEntity entity = singleParameDesService.selectByParame(type, des);

        if (entity != null) {
            return "parem_introduce";
        }
        
        return "parem_introduce";
    }
}
