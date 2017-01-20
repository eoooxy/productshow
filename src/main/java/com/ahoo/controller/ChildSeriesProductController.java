package com.ahoo.controller;

import com.ahoo.convert.ChildSeriesProductConvert;
import com.ahoo.convert.MainSeriesProductConvert;
import com.ahoo.convert.ProductParameterConvert;
import com.ahoo.dto.ChildSeriesProductDto;
import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.ChildSeriesProDesEntity;
import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.service.ChildSeriesProDesService;
import com.ahoo.service.ChildSeriesProductService;
import com.ahoo.service.MainSeriesProDesService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:43
 */
@Controller
public class ChildSeriesProductController {

    @Autowired
    ChildSeriesProductService childSeriesProductService;

    @Autowired
    MainSeriesProDesService mainSeriesProDesService;

    @RequestMapping("proChild.do")
    public String getChildProduct(ModelMap modelMap, Integer fkRecId) {

        List<ChildSeriesProductEntity> entities = childSeriesProductService.selectChildProductByFk(fkRecId);

        MainSeriesProDesEntity mainSeriesProDesEntity = mainSeriesProDesService.selectByFkId(fkRecId);

        if (entities.size() > 0 && mainSeriesProDesEntity != null) {
            List<ChildSeriesProductDto.ChildSeriesProduct> dtos = ChildSeriesProductConvert.convertFromEntity(entities);
            ChildSeriesProductDto dto = new ChildSeriesProductDto();
            dto.setChildSeriesProductList(dtos);
            dto.setDesEntity(mainSeriesProDesEntity);
            modelMap.put("dto", dto);

            return "product_child";
        }
        return "product_child";
    }

    @RequestMapping("back/childType.json")
    public void getChildType(ModelMap modelMap, Integer fkRecId) {

        List<ChildSeriesProductEntity> entities = childSeriesProductService.selectChildProductByFk(fkRecId);
        if (entities.size() > 0) {
            List<ChildSeriesProductDto.ChildSeriesProduct> childTypeDto = ChildSeriesProductConvert.convertFromEntity(entities);
            modelMap.put("childTypeDto", childTypeDto);
        }
    }

}
