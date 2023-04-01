package com.ldy.controller;

import com.ldy.pojo.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ldy
 * @version : 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private Enterprise enterprise;
    @GetMapping
    public String get1(){
        System.out.println("国足好厉害");
        return "国足好厉害";
    }
    @PostMapping
    public String post(){
        System.out.println(enterprise);
        String s = enterprise.toString();
        return s;
    }
}
