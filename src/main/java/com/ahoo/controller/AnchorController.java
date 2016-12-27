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

        System.out.println("index");
        return "index";
    }

    @RequestMapping("product.do")
    public String getProduct() {

        System.out.println("product");
        return "product";
    }

    @RequestMapping("services.do")
    public String getServices() {

        System.out.println("services");
        return "services";
    }

    @RequestMapping("about.do")
    public String getAbout() {

        System.out.println("about");
        return "about";
    }


}
