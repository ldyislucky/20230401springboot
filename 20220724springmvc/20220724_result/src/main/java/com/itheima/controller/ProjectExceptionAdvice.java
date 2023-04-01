package com.itheima.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : ldy
 * @version : 1.0
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)//拦截设定的异常
    public Result doException(Exception e){
        return new Result();
    }
}
