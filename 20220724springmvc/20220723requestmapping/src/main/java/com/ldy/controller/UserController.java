package com.ldy.controller;

import com.ldy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : ldy
 * @version : 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("save.....");
        return "{'user','user save'}";
    }
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return "去你的";
    }
    @RequestMapping("/test2")//解决名称不一致问题  类型一致但是名称不一致会成为空值
    @ResponseBody
    public String test2(@RequestParam("name") String username, int age){
        System.out.println(username);
        System.out.println(age);
        return "去你的";
    }

    @RequestMapping("/pojo")//直接将数据塞到user实例中
    @ResponseBody
    public String pojo(User user){
        System.out.println(user);
        return "去你的";
    }
    @RequestMapping("/pojo1")//套娃  pojo增加了address引用数据类型
    @ResponseBody
    public String pojo1(User user){
        System.out.println(user);
        return "去你的";
    }

}
