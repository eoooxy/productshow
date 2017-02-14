package com.ahoo.controller;

import com.ahoo.convert.MainSeriesProductConvert;
import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.dto.MessageDto;
import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.service.Base64ToImageService;
import com.ahoo.service.MainSeriesProDesService;
import com.ahoo.service.MainSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
            return "one/product_total";
        }
        return "one/product_total";
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

    @RequestMapping("back/editMainDes.json")
    public void update(ModelMap modelMap, MainSeriesProductDto dto, HttpServletRequest request) {
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
            String filePath = request.getSession().getServletContext().getRealPath("/");
            //String path = "E:";

            if (dto.getProductMainUrl() != "" && dto.getProductMainUrl() != null) {
                base64ToImageService.Base64ToImageService(dto.getProductMainUrl(), picName, filePath);
                productEntity.setProductMainUrl(filePath + picName);
            }


            if (mainSeriesProductService.updatePro(productEntity) > 0 && mainSeriesProDesService.updatePro(desEntity) > 0) {
                msg.setCode("1");
                msg.setCtx("父类更新成功！");
            } else {
                msg.setCode("0");
                msg.setCtx("父类更新失败！");
            }
            modelMap.put("msg", msg);
        }
    }

    @RequestMapping("back/addMainDes.json")
    public void add(ModelMap modelMap, MainSeriesProductDto dto, HttpServletRequest request) {
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
            String filePath = request.getSession().getServletContext().getRealPath("/");
            //String path = "E:";
            if (dto.getProductMainUrl() == "" || dto.getProductMainUrl() == null) {
                msg.setCode("0");
                msg.setCtx("图像必须上传！");
                modelMap.put("msg", msg);
                return;
            }
            base64ToImageService.Base64ToImageService(dto.getProductMainUrl(), picName, filePath);
            productEntity.setProductMainUrl(filePath + picName);


            if (mainSeriesProductService.addPro(productEntity) > 0 && mainSeriesProDesService.addPro(desEntity) > 0) {
                msg.setCode("1");
                msg.setCtx("父类新增成功！");
            } else {
                msg.setCode("0");
                msg.setCtx("父类新增失败！");
            }
            modelMap.put("msg", msg);
        }
    }

    @RequestMapping("back/delMainDes.json")
    public void del(ModelMap modelMap, MainSeriesProductDto dto, HttpServletRequest request) {
       /* MessageDto msg = new MessageDto();
        int productEntityId = dto.getRecId();
        int desEntityId = dto.getRecIdDes();
        int child

        if (mainSeriesProductService.del(productEntityId) > 0 && mainSeriesProDesService.del(desEntityId) > 0) {
            msg.setCode("1");
            msg.setCtx("删除成功！");
        } else {
            msg.setCode("0");
            msg.setCtx("删除失败！");
        }
        modelMap.put("msg", msg);*/
    }

}
