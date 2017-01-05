package com.ahoo.controller;

import com.ahoo.convert.ProductParameterConvert;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.*;
import com.ahoo.service.*;
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

    @Autowired
    ProductParameterPicUrlService productParameterPicUrlService;

    @Autowired
    SupProductParameterService supProductParameterService;

    @Autowired
    SupProductParameterUrlService supProductParameterUrlService;


    @RequestMapping("desParam.do")
    public String getProductDes(ModelMap modelMap, Integer childFkId) {

        List<ProductParameterEntity> entities = productParameterService.selectProDesParamByFkId(childFkId);

        ChildSeriesProDesEntity childSeriesProDesEntity = childSeriesProDesService.selectByFkId(childFkId);

        if (entities.size() > 0 && childSeriesProDesEntity != null) {
            List<ProductParameterDto.ProductParameter> dtos = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto dto = new ProductParameterDto();
            dto.setProductParameterList(dtos);
            dto.setDesEntity(childSeriesProDesEntity);
            //dto.setFkChildRecId(childFkId);
            dto.setRecId(childFkId);
            modelMap.put("dto", dto);

            return "product_param";
        }
        return "product_param";
    }

    @RequestMapping("selectB.json")
    public String getSelectB(ModelMap modelMap, Integer fkId, String paramA) {

        List<ProductParameterEntity> entities = productParameterService.selectParamB(fkId, paramA);
        String jsonStr = "";
        if (entities.size()>0) {
            List<ProductParameterDto.ProductParameter> dtoB = ProductParameterConvert.convertFromEntity(entities);
            modelMap.put("dtoB", dtoB);

            jsonStr = JSON.toJSONString(dtoB);
            return jsonStr;
        }
        return jsonStr;
    }

    @RequestMapping("queryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkId, String paramA, String paramB) {

        ProductParameterEntity entity = productParameterService.selectProByParam(fkId, paramA, paramB);
        ProductParameterPicUrlEntity productParameterPicUrlEntity = productParameterPicUrlService.selectByFkId(fkId);
        SupProductParameterEntity supProductParameterEntity = supProductParameterService.selectByFkId(fkId);
        SupProductParameterUrlEntity supProductParameterUrlEntity = supProductParameterUrlService.selectByFkId(fkId);

//&& productParameterPicUrlEntity != null && supProductParameterEntity != null && supProductParameterUrlEntity != null
        if (entity != null) {
            ProductParameterDto.ProductParameter parameter = ProductParameterConvert.convertFromEntity(entity);
            ProductParameterDto dto = new ProductParameterDto();
            List<ProductParameterDto.ProductParameter> list = new ArrayList<ProductParameterDto.ProductParameter>();
            list.add(parameter);

            dto.setProductParameterPicUrlEntity(productParameterPicUrlEntity);
            dto.setSupProductParameterEntity(supProductParameterEntity);
            dto.setSupProductParameterUrlEntity(supProductParameterUrlEntity);
            dto.setProductParameterList(list);

            modelMap.put("dto", dto);

            return "singe_product";
        }
        return "singe_product";
    }


}
