package com.lz.springAffairs.mapper.impl;

import com.lz.springAffairs.bean.User;
import com.lz.springAffairs.mapper.UserMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserMapperImpl extends JdbcDaoSupport implements UserMapper {
    public User findById(Integer id) {
        List<User> query = getJdbcTemplate().query("select * from user where id = ?", new BeanPropertyRowMapper<User>(User.class), id);
        return query.isEmpty()?null:query.get(0);
    }

    public User findByName(String name) {
        List<User> query = getJdbcTemplate().query("select * from user where username = ?", new BeanPropertyRowMapper<User>(User.class), name);
        if(query.isEmpty()){
            return  null;
        }
        if(query.size()>1){
            throw  new RuntimeException("结果不唯一");
        }
        return query.get(0);
    }

    public void updateUser(User user) {
        getJdbcTemplate().update("update user set username = ? , age=? where id=?",user.getUsername(),user.getAge(),user.getId());

    }
}
