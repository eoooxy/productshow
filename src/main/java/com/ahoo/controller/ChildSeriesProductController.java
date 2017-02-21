package com.ahoo.controller;

import com.ahoo.convert.ChildSeriesProductConvert;
import com.ahoo.dto.ChildSeriesProductDto;
import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.dto.MessageDto;
import com.ahoo.entity.ChildSeriesProDesEntity;
import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.service.Base64ToImageService;
import com.ahoo.service.ChildSeriesProDesService;
import com.ahoo.service.ChildSeriesProductService;
import com.ahoo.service.MainSeriesProDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
    ChildSeriesProDesService childSeriesProDesService;

    @Autowired
    MainSeriesProDesService mainSeriesProDesService;

    @Autowired
    Base64ToImageService base64ToImageService;

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

            return "one/product_child";
        }
        return "one/product_child";
    }

    @RequestMapping("back/childType.json")
    public void getChildType(ModelMap modelMap, Integer fkRecId) {

        List<ChildSeriesProductEntity> entities = childSeriesProductService.selectChildProductByFk(fkRecId);
        if (entities.size() > 0) {
            List<ChildSeriesProductDto.ChildSeriesProduct> childTypeDto = ChildSeriesProductConvert.convertFromEntity(entities);
            modelMap.put("childTypeDto", childTypeDto);
        }
    }

    @RequestMapping("back/childType.do")
    public String getChildType(ModelMap modelMap, Integer fkRecId, Integer page, Integer pageSize) {

        List<ChildSeriesProductEntity> entities = childSeriesProductService.selectChildProductByFkPage(fkRecId, page, pageSize);
        if (entities.size() > 0) {
            List<ChildSeriesProductDto.ChildSeriesProduct> dtos = ChildSeriesProductConvert.convertFromEntity(entities);
            ChildSeriesProductDto dto = new ChildSeriesProductDto();
            dto.setChildSeriesProductList(dtos);
            dto.setMark("child");
            dto.setTotalPage((entities.size() + pageSize - 1) / pageSize);
            modelMap.put("dto", dto);
            return "back/protable_des";
        }
        return "back/protable_des";
    }

    @RequestMapping("back/getChildByPk.json")
    public void getProByFkRecId(ModelMap modelMap, Integer id) {
        ChildSeriesProductEntity productEntity = childSeriesProductService.selectProByPkRecId(id);
        ChildSeriesProDesEntity desEntity = childSeriesProDesService.selectByFkId(id);
        if (productEntity != null && desEntity != null) {
            ChildSeriesProductDto dto = new ChildSeriesProductDto();
            dto.setRecId(productEntity.getRecId());
            dto.setRecIdDes(desEntity.getRecId());
            dto.setProductChildType(productEntity.getProductChildType());
            dto.setProductChildUrl(productEntity.getProductChildUrl());
            dto.setProductTitle(desEntity.getProductTitle());
            dto.setProductDes(desEntity.getProductDes());
            dto.setFkRecId(productEntity.getFkRecId());

            modelMap.put("dto", dto);
        }
    }


    @RequestMapping("back/editChildDes.json")
    public void update(ModelMap modelMap, ChildSeriesProductDto dto, HttpServletRequest request) {
        MessageDto msg = new MessageDto();
        if (dto != null) {
            ChildSeriesProductEntity productEntity = new ChildSeriesProductEntity();
            ChildSeriesProDesEntity desEntity = new ChildSeriesProDesEntity();

            productEntity.setRecId(dto.getRecId());
            productEntity.setProductChildType(dto.getProductChildType());
            productEntity.setFkRecId(dto.getFkRecId());

            desEntity.setRecId(dto.getRecIdDes());
            desEntity.setProductDes(dto.getProductDes());
            desEntity.setProductTitle(dto.getProductTitle());
            desEntity.setFkRecId(dto.getRecId());

            //保存图片到服务器 把图片地址放到 数据库
            String picName = System.currentTimeMillis() + ".jpg";
            String filePath = request.getSession().getServletContext().getRealPath("/");
            //String path = "E:";

            if (dto.getProductChildUrl() != "" && dto.getProductChildUrl() != null) {
                base64ToImageService.Base64ToImageService(dto.getProductChildUrl(), picName, filePath);
                productEntity.setProductChildUrl("/images/branch/" + picName);
            }

            if (childSeriesProductService.updatePro(productEntity) > 0 && childSeriesProDesService.updatePro(desEntity) > 0) {
                msg.setCode("1");
                msg.setCtx("子类更新成功！");
            } else {
                msg.setCode("0");
                msg.setCtx("子类更新失败！");
            }
            modelMap.put("msg", msg);
        }
    }

    @RequestMapping("back/addChildDes.json")
    public void add(ModelMap modelMap, ChildSeriesProductDto dto, HttpServletRequest request) {
        MessageDto msg = new MessageDto();
        if (dto != null) {
            ChildSeriesProductEntity productEntity = new ChildSeriesProductEntity();
            ChildSeriesProDesEntity desEntity = new ChildSeriesProDesEntity();


            productEntity.setRecId(dto.getRecId());
            productEntity.setProductChildType(dto.getProductChildType());
            productEntity.setFkRecId(dto.getFkRecId());

            desEntity.setRecId(dto.getRecIdDes());
            desEntity.setProductDes(dto.getProductDes());
            desEntity.setProductTitle(dto.getProductTitle());
            desEntity.setFkRecId(dto.getRecId());

            //保存图片到服务器 把图片地址放到 数据库
            String picName = System.currentTimeMillis() + ".jpg";
            String filePath = request.getSession().getServletContext().getRealPath("/");
            //String path = "E:";
            if (dto.getProductChildUrl() == "" || dto.getProductChildUrl() == null) {
                msg.setCode("0");
                msg.setCtx("图像必须上传！");
                modelMap.put("msg", msg);
                return;
            }
            base64ToImageService.Base64ToImageService(dto.getProductChildUrl(), picName, filePath);
            productEntity.setProductChildUrl("/images/branch/" + picName);

            if (childSeriesProductService.addPro(productEntity) > 0 && childSeriesProDesService.addPro(desEntity) > 0) {
                msg.setCode("1");
                msg.setCtx("子类新增成功！");
            } else {
                msg.setCode("0");
                msg.setCtx("子类新增失败！");
            }
            modelMap.put("msg", msg);
        }
    }

    @RequestMapping("back/delChildDes.json")
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
