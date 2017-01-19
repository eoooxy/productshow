package com.ahoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/18 0018
 * Time: 20:50
 */

@Controller
public class AnchorController {


    @RequestMapping("index.do")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("productType.do")
    public String getProductType() {
        return "product_type";
    }

    @RequestMapping("services.do")
    public String getServices() {
        return "services";
    }

    @RequestMapping("about.do")
    public String getAbout() {
        return "about";
    }

    @RequestMapping("productOne.do")
    public String getProductOne() {
        return "product_one";
    }

    @RequestMapping("productTwo.do")
    public String getProductTwo() {
        return "product_two";
    }

    @RequestMapping("productThere.do")
    public String getProductThere() {
        return "product_there";
    }

    @RequestMapping("back/login.do")
    public String getBackLogin() {
        return "back/index";
    }

    @RequestMapping("back/index.do")
    public String getBackIndex() {
        return "back/index";
    }

}
