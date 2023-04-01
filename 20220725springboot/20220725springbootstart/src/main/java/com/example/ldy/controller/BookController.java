package com.example.ldy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ldy
 * @version : 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
  @GetMapping
  public String get1(){
    System.out.println("springboot");
    return "hello springboot";
  }
}
