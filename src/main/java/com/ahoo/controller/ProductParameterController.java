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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("back/selectA.json")
    public void getSelectA(ModelMap modelMap, Integer fkRecId) {

        List<ProductParameterEntity> entities = productParameterService.selectProDesParamByFkId(fkRecId);
        if (entities.size() > 0) {
            List<ProductParameterDto.ProductParameter> dtoA = ProductParameterConvert.convertFromEntity(entities);

            List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
            List<String> strings = new ArrayList<>();
            for (ProductParameterDto.ProductParameter d : dtoA) {
                if (!strings.contains(d.getConductorA())) {
                    Map<String, Object> map = new HashMap<>();
                    strings.add(d.getConductorA());
                    map.put("name", d.getConductorA());
                    map.put("recId", d.getRecId());
                    mapList.add(map);
                }
            }

            String jsonStr = JSON.toJSONString(mapList);
            modelMap.put("mapList", jsonStr);
        }
    }

    @RequestMapping("selectB.json")
    public void getSelectB(ModelMap modelMap, Integer fkRecId, String paramA) {

        List<ProductParameterEntity> entities = productParameterService.selectParamB(fkRecId, paramA);
        //String jsonStr = "";
        if (entities.size() > 0) {
            List<ProductParameterDto.ProductParameter> dtoB = ProductParameterConvert.convertFromEntity(entities);
            modelMap.put("dtoB", dtoB);
        }
    }

    @RequestMapping("queryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkRecId, String paramA, String paramB) {

        List<ProductParameterEntity> entities = productParameterService.selectProByParam(fkRecId, paramA, paramB);
        ProductParameterPicUrlEntity productParameterPicUrlEntity = productParameterPicUrlService.selectByFkId(fkRecId);
        SupProductParameterEntity supProductParameterEntity = supProductParameterService.selectByFkId(fkRecId);
        SupProductParameterUrlEntity supProductParameterUrlEntity = supProductParameterUrlService.selectByFkId(fkRecId);

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

    @RequestMapping("back/table.do")
    public String getTableData(ModelMap modelMap, Integer childRecId, String paramA, Integer page, Integer pageSize) {

        List<ProductParameterEntity> entities = productParameterService.selectProByParamPage(childRecId, paramA, page * pageSize, pageSize);
        List<ProductParameterEntity> entities1 = productParameterService.selectParamB(childRecId, paramA);
        if (entities.size() > 0) {
            List<ProductParameterDto.ProductParameter> parameters = ProductParameterConvert.convertFromEntity(entities);
            ProductParameterDto dto = new ProductParameterDto();
            dto.setProductParameterList(parameters);
            dto.setTotalPage((entities1.size() + pageSize - 1) / pageSize);
            modelMap.put("dto", dto);

            return "back/protable";
        }
        return "protable";
    }

    @RequestMapping("back/editDes.json")
    public void editDes(ModelMap modelMap, Integer recId) {

       /* ProductParameterEntity entity = productParameterService.selectByRecid(recId);
        if (entity != null) {
            ProductParameterDto.ProductParameter dto = ProductParameterConvert.convertFromEntity(entity);
            modelMap.put("dto", dto);
        }*/
    }

}
