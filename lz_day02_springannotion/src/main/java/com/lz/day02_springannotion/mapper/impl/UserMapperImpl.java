package com.lz.day02_springannotion.mapper.impl;

import com.lz.day02_springannotion.bean.User;
import com.lz.day02_springannotion.mapper.UserMapper;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userMapper")
public class UserMapperImpl implements UserMapper {
    @Autowired
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
