package com.ahoo.controller;

import com.ahoo.convert.ProductParameterConvert;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.ProductParameterEntity;
import com.ahoo.service.ProductParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:48
 */

@Controller
public class ProductParameterController {


    @Autowired
    ProductParameterService productParameterService;


    @RequestMapping("desParam.do")
    public String getProductDes(ModelMap modelMap, Integer childFkId) {

        List<ProductParameterEntity> entities = productParameterService.selectProDesParam(childFkId);
        if (entities.size() > 0) {
            List<ProductParameterDto.ProductParameter> dtos = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto dto = new ProductParameterDto();
            dto.setProductParameterList(dtos);
            modelMap.put("dto", dto);

            return "product_param";
        }
        return "product_param";
    }
}
