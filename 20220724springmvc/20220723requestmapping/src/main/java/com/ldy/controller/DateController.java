package com.ldy.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author : ldy
 * @version : 1.0
 */
@Controller
@RequestMapping("/date")
public class DateController {
    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date,
                      @DateTimeFormat(pattern = "yyyy-MM-dd")Date date1,
                       @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")Date date2
                       ){

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);

        return "date";
    }
}
