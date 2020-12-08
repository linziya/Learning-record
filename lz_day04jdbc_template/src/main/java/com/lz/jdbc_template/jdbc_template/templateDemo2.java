package com.lz.jdbc_template.jdbc_template;

import com.lz.jdbc_template.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class templateDemo2 {


    private static JdbcTemplate jdbcTemplate;

        private static void init(){
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
           jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        }

    public static void main(String[] args) {
        init();
//        userInsert();
//        userUpdate();
//        userdelete();
        findAll();

    }

    public static void userInsert(){
        jdbcTemplate.update("insert into user (id, username, password) values(?,?,?) ",10,"月儿","1234");

    }

    public static void userUpdate(){
            jdbcTemplate.update("update user set username = ?,password = ? where id = ?","月月","122",10);
    }

    public static void userdelete(){
            jdbcTemplate.update("delete from user  where id = ?",9);
    }

    public static void findAll(){
        List<User> users = jdbcTemplate.query("select * from user where id = ?", new UserRowMpper(), 1);
        for(User user : users){
            System.out.println(user);
        }
    }


}

class UserRowMpper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setAge(resultSet.getInt("age"));
        user.setSex(resultSet.getString("username"));
        user.setBirth(resultSet.getDate("birth"));
        return user;
    }
}
