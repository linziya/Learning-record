package com.lz.jdbc_template.jdbc_template;

import com.lz.jdbc_template.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class templateDemo1 {


    private static JdbcTemplate jdbcTemplate;

        private static void init(){
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
           jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        }

    public static void main(String[] args) {
        init();
        jdbcTemplate.execute("insert into user (id, username, password) values(9,'月','123') " );
    }

}
