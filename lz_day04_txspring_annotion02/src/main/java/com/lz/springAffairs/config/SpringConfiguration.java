package com.lz.springAffairs.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * spring 配置类
 */
@Configuration
@ComponentScan
//引入其他配置类
@Import({JdbcConfig.class,TransactionConfig.class})
@PropertySource("jdbc.properties")
//开启事务注解支持
@EnableTransactionManagement
public class SpringConfiguration {

}
