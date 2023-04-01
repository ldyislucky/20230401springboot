package com.ldy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : ldy
 * @version : 1.0
 */

/**
 * 1.定义controller
 * 1.1使用controller定义bean
 */
@Controller//将本类定义为bean
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save....");
        return "{'module':'springmvc'}";
    }
}
