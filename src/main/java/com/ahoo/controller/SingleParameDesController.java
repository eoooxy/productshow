package com.ahoo.controller;

import com.ahoo.dto.MessageDto;
import com.ahoo.entity.SingleParameDesEntity;
import com.ahoo.service.Base64ToImageService;
import com.ahoo.service.SingleParameDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @author xueyuan
 * @dater 2017-1-10 0010.
 */

@Controller
public class SingleParameDesController {

    @Autowired
    SingleParameDesService singleParameDesService;

    @Autowired
    Base64ToImageService base64ToImageService;


    @RequestMapping("getParameDes.do")
    public String getParameDes(ModelMap modelMap, String type, String des) {

        SingleParameDesEntity entity = singleParameDesService.selectByParame(type, des);

        if (entity != null) {
            return "parem_introduce";
        }

        return "parem_introduce";
    }

    @RequestMapping("/back/uploadImg.json")
    public void uploadImg(ModelMap modelMap, MultipartFile thumbnail, HttpServletRequest request) throws IOException {

        MessageDto msg = new MessageDto();
        if (thumbnail != null) {// 判断上传的文件是否为空
            String path = null;// 文件路径
            String type = null;// 文件类型
            String fileName = thumbnail.getOriginalFilename();// 文件原名称
            System.out.println("上传的文件原名称:" + fileName);
            // 判断文件类型
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            if (type != null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase()) || "JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = String.valueOf(System.currentTimeMillis()) + fileName;
                    // 设置存放图片文件的路径
                    path = realPath +/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("存放图片文件的路径:" + path);
                    // 转存文件到指定的路径
                    thumbnail.transferTo(new File(path));
                    System.out.println("文件成功上传到指定目录下");
                    modelMap.put("src", path);

                } else {
                    msg.setCode("0");
                    msg.setCtx("不是我们想要的文件类型,请按要求重新上传");
                    modelMap.put("msg", msg);
                    return;
                }
            } else {
                msg.setCode("0");
                msg.setCtx("文件类型为空");
                modelMap.put("msg", msg);
                return;
            }
        } else {
            msg.setCode("0");
            msg.setCtx("没有找到相对应的文件");
            modelMap.put("msg", msg);
            return;
        }
    }


}
