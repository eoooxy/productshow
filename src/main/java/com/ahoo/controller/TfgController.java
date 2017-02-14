package com.ahoo.controller;

import com.ahoo.convert.TfgConvert;
import com.ahoo.convert.TfglxConvert;
import com.ahoo.dto.TfgDto;
import com.ahoo.dto.TfglxDto;
import com.ahoo.entity.TfgEntity;
import com.ahoo.entity.TfglxEntity;
import com.ahoo.entity.TfglxmsEntity;
import com.ahoo.service.TfgService;
import com.ahoo.service.TfglxService;
import com.ahoo.service.TfglxmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/13 0009
 * Time: 20:52
 */

@Controller
public class TfgController {

    @Autowired
    TfgService tfgService;

    @Autowired
    TfglxService tfglxService;

    @Autowired
    TfglxmsService tfglxmsService;

    @RequestMapping("threeTotal.do")
    public String getProduct(ModelMap modelMap) {

        List<TfglxEntity> entities = tfglxService.selectAll();
        TfglxmsEntity tfglxmsEntity = tfglxmsService.selectById(999);
        if (entities.size() > 0 && tfglxmsService != null) {
            List<TfglxDto.Tfglx> dtos = TfglxConvert.convertFromEntity(entities);
            TfglxDto dto = new TfglxDto();
            dto.setTfglxList(dtos);
            dto.setDesEntity(tfglxmsEntity);
            modelMap.put("dto", dto);
            return "three/product_total";
        }
        return "three/product_total";
    }


    @RequestMapping("threePros.do")
    public String getChildProduct(ModelMap modelMap, Integer fkRecId) {

        List<TfgEntity> entities = tfgService.selectByFkId(fkRecId);

        TfglxEntity entity = tfglxService.selectById(fkRecId);

        TfglxmsEntity tfglxmsEntity = tfglxmsService.selectByFkId(fkRecId);

        if (entities.size() > 0 && tfglxmsEntity != null && entity != null) {
            List<TfgDto.Tfg> dtos = TfgConvert.convertFromEntity(entities);
            TfgDto dto = new TfgDto();
            dto.setTfgList(dtos);
            dto.setDesEntity(tfglxmsEntity);
            dto.setProType(entity.getProductType());

            List<String> strings = new ArrayList<String>();
            for (TfgDto.Tfg d : dtos) {
                if (!strings.contains(d.getProductNorms())) {
                    strings.add(d.getProductNorms());
                }
            }
            dto.setRecId(fkRecId);
            dto.setStrings(strings);
            modelMap.put("dto", dto);

            return "three/product_param";
        }
        return "three/product_param";
    }

    @RequestMapping("threeSelectB.json")
    public void getSelectB(ModelMap modelMap, Integer fkRecId, String paramA) {

        List<TfgEntity> entities = tfgService.selectParam(fkRecId, paramA, null);
        //String jsonStr = "";
        if (entities.size() > 0) {
            List<TfgDto.Tfg> dtoB = TfgConvert.convertFromEntity(entities);
            modelMap.put("dtoB", dtoB);
        }
    }

    @RequestMapping("threeQueryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkRecId, String paramA, String paramB) {

        List<TfgEntity> entities = tfgService.selectParam(fkRecId, paramA, paramB);

        TfglxEntity entity = tfglxService.selectById(fkRecId);

        if (entities.size() > 0 && entity != null) {
            List<TfgDto.Tfg> parameters = TfgConvert.convertFromEntity(entities);
            TfgDto dto = new TfgDto();
            dto.setTfgList(parameters);
            int pageNumber = (parameters.size() + 19) / 20;
            dto.setProType(entity.getProductType());
            dto.setPageNumber(pageNumber);

            modelMap.put("dto", dto);

            return "three/singe_product";
        }
        return "three/singe_product";
    }
}

