package com.ldy.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author : ldy
 * @version : 1.0
 *
 */
//定义一个Servlet容器启动配置类，在里面加载spring的配置   记得将web-inf中的xml删除
public class ServletContainerslnitConfig extends AbstractDispatcherServletInitializer {

    @Override
    //加载springmvc配置容器
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext acwac = new AnnotationConfigWebApplicationContext();
        acwac.register(SpringMvcConfig.class);
        return acwac;
    }

    @Override
    //设置哪些请求归springmvc处理
    protected String[] getServletMappings() {
        return new String[]{"/"};//设置所有请求归springmvc处理
    }

    @Override
    //加载spring配置容器 此处有springmvc了  所以可以忽略此配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
