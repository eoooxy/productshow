package com.ahoo.controller;

import com.ahoo.convert.MainSeriesProductConvert;
import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.service.MainSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/18 0018
 * Time: 20:50
 */

@Controller
public class MainSeriesProductController {

    @Autowired
    MainSeriesProductService mainSeriesProductService;


    @RequestMapping("proTotal.do")
    public String getProduct(ModelMap modelMap) {

        List<MainSeriesProductEntity> entities = mainSeriesProductService.selectAllProduct();
        if (entities.size() > 0) {
            List<MainSeriesProductDto.MainSeriesProduct> dtos = MainSeriesProductConvert.convertFromEntity(entities);
            MainSeriesProductDto dto = new MainSeriesProductDto();
            dto.setMainSeriesProductList(dtos);
            modelMap.put("dto", dto);
            return "product_total";
        }
        return "product_total";
    }


}
