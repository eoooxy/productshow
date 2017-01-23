package com.ahoo.controller;

import com.ahoo.convert.MainSeriesProductConvert;
import com.ahoo.dto.ChildSeriesProductDto;
import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.dto.MessageDto;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.ChildSeriesProDesEntity;
import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.service.Base64ToImageService;
import com.ahoo.service.MainSeriesProDesService;
import com.ahoo.service.MainSeriesProductService;
import com.sun.javafx.sg.prism.NGShape;
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
public class MainSeriesProductController {

    @Autowired
    MainSeriesProductService mainSeriesProductService;

    @Autowired
    MainSeriesProDesService mainSeriesProDesService;

    @Autowired
    Base64ToImageService base64ToImageService;

    @RequestMapping("proTotal.do")
    public String getProduct(ModelMap modelMap) {

        List<MainSeriesProductEntity> entities = mainSeriesProductService.selectAllProduct();
        MainSeriesProDesEntity mainSeriesProDesEntity = mainSeriesProDesService.selectById(999);
        if (entities.size() > 0 && mainSeriesProDesEntity != null) {
            List<MainSeriesProductDto.MainSeriesProduct> dtos = MainSeriesProductConvert.convertFromEntity(entities);
            MainSeriesProductDto dto = new MainSeriesProductDto();
            dto.setMainSeriesProductList(dtos);
            dto.setDesEntity(mainSeriesProDesEntity);
            modelMap.put("dto", dto);
            return "product_total";
        }
        return "product_total";
    }

    @RequestMapping("back/three_all.do")
    public String getBackThree(ModelMap modelMap) {
        List<MainSeriesProductEntity> entities = mainSeriesProductService.selectAllProduct();
        if (entities.size() > 0) {
            List<MainSeriesProductDto.MainSeriesProduct> dtos = MainSeriesProductConvert.convertFromEntity(entities);
            MainSeriesProductDto dto = new MainSeriesProductDto();
            /*List<String> strings = new ArrayList<String>();
            for (MainSeriesProductDto.MainSeriesProduct d : dtos) {
                if (!strings.contains(d.getProductMainType())) {
                    strings.add(d.getProductMainType());
                }
            }
            dto.setStrings(strings);*/
            dto.setMainSeriesProductList(dtos);
            modelMap.put("dto", dto);
            return "back/three_all";
        }
        return "back/three_all";
    }

    @RequestMapping("back/three_mainType.json")
    public void getBackThreeType(ModelMap modelMap) {
        List<MainSeriesProductEntity> entities = mainSeriesProductService.selectAllProduct();
        if (entities.size() > 0) {
            List<MainSeriesProductDto.MainSeriesProduct> dtos = MainSeriesProductConvert.convertFromEntity(entities);
            //MainSeriesProductDto dto = new MainSeriesProductDto();
            //dto.setMainSeriesProductList(dtos);
            modelMap.put("dtos", dtos);
        }
    }

    @RequestMapping("back/mainType.do")
    public String getBackThree(ModelMap modelMap, Integer page, Integer pageSize) {
        List<MainSeriesProductEntity> entities = mainSeriesProductService.selectProductPage(page, pageSize);
        if (entities.size() > 0) {
            List<MainSeriesProductDto.MainSeriesProduct> dtos = MainSeriesProductConvert.convertFromEntity(entities);
            MainSeriesProductDto dto = new MainSeriesProductDto();
            dto.setMainSeriesProductList(dtos);
            dto.setMark("main");
            dto.setTotalPage((entities.size() + pageSize - 1) / pageSize);
            modelMap.put("dto", dto);
            return "back/protable_des";
        }
        return "back/protable_des";
    }

    @RequestMapping("back/getMainByPk.json")
    public void getProByFkRecId(ModelMap modelMap, Integer id) {
        MainSeriesProductEntity productEntity = mainSeriesProductService.selectProByPkRecId(id);
        MainSeriesProDesEntity desEntity = mainSeriesProDesService.selectByFkId(id);
        if (productEntity != null && desEntity != null) {
            MainSeriesProductDto dto = new MainSeriesProductDto();

            dto.setRecId(productEntity.getRecId());
            dto.setRecIdDes(desEntity.getRecId());
            dto.setProductMainType(productEntity.getProductMainType());
            dto.setProductMainUrl(productEntity.getProductMainUrl());
            dto.setProductTitle(desEntity.getProductTitle());
            dto.setProductDes(desEntity.getProductDes());

            //dto.setFkRecId(productEntity.getFkRecId());

            modelMap.put("dto", dto);
        }
    }

    @RequestMapping("back/editDes.json")
    public void update(ModelMap modelMap, MainSeriesProductDto dto) {
        MessageDto msg = new MessageDto();
        if (dto != null) {
            MainSeriesProductEntity productEntity = new MainSeriesProductEntity();
            MainSeriesProDesEntity desEntity = new MainSeriesProDesEntity();

            productEntity.setRecId(dto.getRecId());
            productEntity.setProductMainType(dto.getProductMainType());

            desEntity.setRecId(dto.getRecIdDes());
            desEntity.setProductDes(dto.getProductDes());
            desEntity.setProductTitle(dto.getProductTitle());
            desEntity.setFkRecId(dto.getRecId());

            //保存图片到服务器 把图片地址放到 数据库
            String picName = System.currentTimeMillis() + ".jpg";
            String path = "E:/ahoo/service";
            base64ToImageService.Base64ToImageService(dto.getProductMainUrl(), picName, path);
            productEntity.setProductMainUrl(path + "/" + picName);


            if (mainSeriesProductService.updatePro(productEntity) > 0 && mainSeriesProDesService.updatePro(desEntity) > 0) {
                msg.setCode("1");
                msg.setCtx("新增成功！");
            } else {
                msg.setCode("0");
                msg.setCtx("新增失败！");
            }
            modelMap.put("msg", msg);
        }
    }
}
