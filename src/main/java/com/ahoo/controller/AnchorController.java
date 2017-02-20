package com.ahoo.controller;

import com.ahoo.convert.SingleProDesConvert;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.dto.SingleProDesDto;
import com.ahoo.entity.SingleProDesEntity;
import com.ahoo.service.SingleProDesService;
import com.alibaba.fastjson.serializer.ListSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/18 0018
 * Time: 20:50
 */

@Controller
public class AnchorController {


    @Autowired
    SingleProDesService singleProDesService;

    @RequestMapping("index.do")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("productType.do")
    public String getProductType() {
        return "product";
    }

    @RequestMapping("services.do")
    public String getServices() {
        return "services";
    }

    @RequestMapping("about.do")
    public String getAbout() {
        return "about";
    }

    @RequestMapping("productOne.do")
    public String getProductOne() {
        return "one/product_one";
    }

    @RequestMapping("productTwo.do")
    public String getProductTwo() {
        return "two/product_two";
    }

    @RequestMapping("productThere.do")
    public String getProductThere() {
        return "three/product_there";
    }

    @RequestMapping("back/login.do")
    public String getBackLogin() {
        return "back/login";
    }

    @RequestMapping("back/index.do")
    public String getBackIndex() {
        return "back/index";
    }

    @RequestMapping("back/three_des.do")
    public String getBackThreeDes() {
        return "back/three_des";
    }

    @RequestMapping("back/singleprodes.do")
    public String getBackSingleProDes(ModelMap modelMap) {

        List<SingleProDesEntity> entityList = singleProDesService.selectByParame();
        if (entityList.size() > 0) {
            List<SingleProDesDto.SingleProDes> singleProDesList = SingleProDesConvert.convertFromEntity(entityList);
            SingleProDesDto dto = new SingleProDesDto();
            dto.setLists(singleProDesList);
            modelMap.put("dto", dto);
            return "back/singleprodes";
        }
        return "back/singleprodes";
    }

}
