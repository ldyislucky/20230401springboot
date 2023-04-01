package com.ldy.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author : ldy
 * @version : 1.0
 */
@Configuration
@ComponentScan("com.ldy")//扫描包中的bean
@Import({JdbcConfig.class, MybatiesConfig.class})
@PropertySource("db1.properties")
@EnableAspectJAutoProxy//注解aop开发
@EnableTransactionManagement//开启注解事务驱动
public class SpringConfig {
}
