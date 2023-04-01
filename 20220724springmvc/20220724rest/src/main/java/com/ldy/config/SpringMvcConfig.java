package com.ldy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("com.ldy.controller")
@EnableWebMvc
public class SpringMvcConfig {

}
