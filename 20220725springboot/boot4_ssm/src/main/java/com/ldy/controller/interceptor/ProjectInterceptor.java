package com.ldy.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : ldy
 * @version : 1.0
 *
 * 拦截器类  在控制前或后执行
 *
 * 注解@component是spring中的一个注解，它的作用就是实现bean的注入。
 * 在Java的web开发中，提供3个@Component注解衍生注解（功能与@component一样）分别是：
 * 1、@Controller 控制器（注入服务） 用于标注控制层，相当于struts中的action层。
 * 2、@Service 服务（注入dao） 用于标注服务层，主要用来进行业务的逻辑处理
 * 3、@Repository（实现dao访问） 用于标注数据访问层，也可以说用于标注数据访问组件，即DAO组件
 *
 * 也可以在使用springconfig类实现webmvcconfig接口配置本类中的方法
 */
@Component//设置为bean
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;//如果设置为false则可以跳过原始操作以及剩余两种方法
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
