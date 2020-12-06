package com.lz.day02_springdemo.mapper.impl;

import com.lz.day02_springdemo.bean.User;
import com.lz.day02_springdemo.mapper.UserMapper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.ibatis.annotations.Select;
import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public List<User> findAll() {
        try{
            return runner.query("select * from user ",new BeanListHandler<User>(User.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public void userMapperSave(User user) {
        try{
            runner.update("insert into user(id,username,password) values(?,?,?)",user.getId(),user.getPassword(),user.getUsername());
        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
