package com.ahoo.controller;

import com.ahoo.convert.ProductParameterConvert;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.ChildSeriesProDesEntity;
import com.ahoo.entity.ProductParameterEntity;
import com.ahoo.service.ChildSeriesProDesService;
import com.ahoo.service.ProductParameterService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

    @Autowired
    ChildSeriesProDesService childSeriesProDesService;

    @RequestMapping("desParam.do")
    public String getProductDes(ModelMap modelMap, Integer childFkId) {

        List<ProductParameterEntity> entities = productParameterService.selectProDesParamByFkId(childFkId);

        ChildSeriesProDesEntity childSeriesProDesEntity = childSeriesProDesService.selectByFkId(childFkId);

        if (entities.size() > 0 && childSeriesProDesEntity != null) {
            List<ProductParameterDto.ProductParameter> dtos = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto dto = new ProductParameterDto();
            dto.setProductParameterList(dtos);
            dto.setDesEntity(childSeriesProDesEntity);
            dto.setFkChildRecId(childFkId);
            modelMap.put("dto", dto);

            return "product_param";
        }
        return "product_param";
    }

    @RequestMapping("selectB.json")
    public String getSelectB(ModelMap modelMap, Integer fkId, String paramA) {

        ProductParameterEntity entity = productParameterService.selectParamB(fkId, paramA);
        String jsonStr = "";
        if (entity != null) {
            ProductParameterDto.ProductParameter dtoB = ProductParameterConvert.convertFromEntity(entity);
            modelMap.put("dtoB", dtoB);

            jsonStr = JSON.toJSONString(entity);
            return jsonStr;
        }
        return jsonStr;
    }

    @RequestMapping("queryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkId, String paramA, String paramB) {

        ProductParameterEntity entity = productParameterService.selectProByParam(fkId, paramA, paramB);

        if (entity != null) {
            ProductParameterDto.ProductParameter parameter = ProductParameterConvert.convertFromEntity(entity);
            ProductParameterDto dto = new ProductParameterDto();
            List<ProductParameterDto.ProductParameter> list = new ArrayList<ProductParameterDto.ProductParameter>();
            list.add(parameter);

            dto.setProductParameterList(list);
            


            modelMap.put("dto", dto);

            return "singe_product";
        }
        return "singe_product";
    }


}
