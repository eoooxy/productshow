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


    //List<ProductParameterEntity> entities;
    //ProductParameterPicUrlEntity productParameterPicUrlEntity;


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

            //得到不重复的导体a的参数

            List<String> strings = new ArrayList<String>();
            for (ProductParameterDto.ProductParameter d : dtos) {
                if (!strings.contains(d.getConductorA())) {
                    strings.add(d.getConductorA());
                }
            }
            dto.setStrings(strings);

            modelMap.put("dto", dto);

            return "product_param";
        }
        return "product_param";
    }

    @RequestMapping("selectB.json")
    public String getSelectB(ModelMap modelMap, Integer fkId, String paramA) {

        List<ProductParameterEntity> entities = productParameterService.selectParamB(fkId, paramA);
        String jsonStr = "";
        if (entities.size() > 0) {
            List<ProductParameterDto.ProductParameter> dtoB = ProductParameterConvert.convertFromEntity(entities);
            modelMap.put("dtoB", dtoB);

            jsonStr = JSON.toJSONString(dtoB);
            return jsonStr;
        }
        return jsonStr;
    }

    @RequestMapping("queryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkId, String paramA, String paramB) {

        List<ProductParameterEntity> entities = productParameterService.selectProByParam(fkId, paramA, paramB);
        ProductParameterPicUrlEntity productParameterPicUrlEntity = productParameterPicUrlService.selectByFkId(fkId);
        SupProductParameterEntity supProductParameterEntity = supProductParameterService.selectByFkId(fkId);
        SupProductParameterUrlEntity supProductParameterUrlEntity = supProductParameterUrlService.selectByFkId(fkId);

//productParameterPicUrlEntity != null &&
        if (entities.size() > 0 && supProductParameterEntity != null && supProductParameterUrlEntity != null) {
            List<ProductParameterDto.ProductParameter> parameters = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto dto = new ProductParameterDto();

            dto.setProductParameterPicUrlEntity(productParameterPicUrlEntity);
            dto.setSupProductParameterEntity(supProductParameterEntity);
            dto.setSupProductParameterUrlEntity(supProductParameterUrlEntity);
            dto.setProductParameterList(parameters);


            //Map productParameterMap = Bean2MapConvert.transBean2Map(entity);
            //Map productParameterPicUrlMap = Bean2MapConvert.transBean2Map(productParameterPicUrlEntity);
            //Map supProductParameterMap = Bean2MapConvert.transBean2Map(supProductParameterEntity);
            //Map supProductParameterUrlMap = Bean2MapConvert.transBean2Map(supProductParameterUrlEntity);

            //dto.setProductParameterMap(productParameterMap);
            //dto.setProductParameterPicUrlMap(productParameterPicUrlMap);
            //dto.setSupProductParameterMap(supProductParameterMap);
            //dto.setSupProductParameterUrlMap(supProductParameterUrlMap);


            modelMap.put("dto", dto);

            return "singe_product";
        }
        return "singe_product";
    }


    @RequestMapping("page.do")
    public String getPage(ModelMap modelMap, Integer page, Integer fkId, String paramA, String paramB) {

        List<ProductParameterEntity> entities = productParameterService.selectProByParam(fkId, paramA, paramB);
        ProductParameterPicUrlEntity entity = productParameterPicUrlService.selectByFkId(fkId);
        if (entities.size() > 0) {

            List<ProductParameterDto.ProductParameter> parameters = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto.ProductParameter dto = parameters.get(page);
            modelMap.put("dto", dto);
            modelMap.put("entity", entity);

            return "paramtable";
        }
        return "paramtable";
    }


}
