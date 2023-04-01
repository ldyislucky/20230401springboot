package com.ldy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("com.ldy.controller")//加载controller包中的bean
public class SpringMvcConfig {

}
