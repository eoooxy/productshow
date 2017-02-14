package com.ahoo.controller;

import com.ahoo.convert.LzjdConvert;
import com.ahoo.convert.LzjdlxConvert;
import com.ahoo.dto.LzjdDto;
import com.ahoo.dto.LzjdlxDto;
import com.ahoo.entity.LzjdEntity;
import com.ahoo.entity.LzjdlxEntity;
import com.ahoo.entity.LzjdlxmsEntity;
import com.ahoo.service.LzjdService;
import com.ahoo.service.LzjdlxService;
import com.ahoo.service.LzjdlxmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:53
 */
@Controller
public class LzjdController {


    @Autowired
    LzjdService lzjdService;

    @Autowired
    LzjdlxService lzjdlxService;

    @Autowired
    LzjdlxmsService lzjdlxmsService;

    @RequestMapping("twoTotal.do")
    public String getProduct(ModelMap modelMap) {

        List<LzjdlxEntity> entities = lzjdlxService.selectAll();
        LzjdlxmsEntity lzjdlxmsEntity = lzjdlxmsService.selectById(999);
        if (entities.size() > 0 && lzjdlxmsService != null) {
            List<LzjdlxDto.Lzjdlx> dtos = LzjdlxConvert.convertFromEntity(entities);
            LzjdlxDto dto = new LzjdlxDto();
            dto.setLzjdlxList(dtos);
            dto.setDesEntity(lzjdlxmsEntity);
            modelMap.put("dto", dto);
            return "two/product_total";
        }
        return "two/product_total";
    }


    @RequestMapping("twoPros.do")
    public String getChildProduct(ModelMap modelMap, Integer fkRecId) {

        List<LzjdEntity> entities = lzjdService.selectByFkId(fkRecId);

        LzjdlxmsEntity lzjdlxmsEntity = lzjdlxmsService.selectByFkId(fkRecId);

        if (entities.size() > 0 && lzjdlxmsEntity != null) {
            List<LzjdDto.Lzjd> dtos = LzjdConvert.convertFromEntity(entities);
            LzjdDto dto = new LzjdDto();
            dto.setLzjdList(dtos);
            dto.setDesEntity(lzjdlxmsEntity);


            List<String> strings = new ArrayList<String>();
            for (LzjdDto.Lzjd d : dtos) {
                if (!strings.contains(d.getProductNormsA())) {
                    strings.add(d.getProductNormsA());
                }
            }
            dto.setRecId(fkRecId);
            dto.setStrings(strings);
            modelMap.put("dto", dto);

            return "two/product_param";
        }
        return "two/product_param";
    }

    @RequestMapping("twoSelectB.json")
    public void getSelectB(ModelMap modelMap, Integer fkRecId, String paramA) {

        List<LzjdEntity> entities = lzjdService.selectParam(fkRecId, paramA, null);
        //String jsonStr = "";
        if (entities.size() > 0) {
            List<LzjdDto.Lzjd> dtoB = LzjdConvert.convertFromEntity(entities);
            modelMap.put("dtoB", dtoB);
        }
    }

    @RequestMapping("twoQueryOne.do")
    public String getSelectOne(ModelMap modelMap, Integer fkRecId, String paramA, String paramB) {

        List<LzjdEntity> entities = lzjdService.selectParam(fkRecId, paramA, paramB);

        if (entities.size() > 0) {
            List<LzjdDto.Lzjd> parameters = LzjdConvert.convertFromEntity(entities);
            LzjdDto dto = new LzjdDto();
            dto.setLzjdList(parameters);
            int pageNumber = (parameters.size() + 19) / 20;
            dto.setPageNumber(pageNumber);

            modelMap.put("dto", dto);

            return "two/singe_product";
        }
        return "two/singe_product";
    }
}
