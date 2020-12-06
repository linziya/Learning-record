package com.lz.day02_springdemo.service.impl;

import com.lz.day02_springdemo.bean.User;
import com.lz.day02_springdemo.mapper.UserMapper;
import com.lz.day02_springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;


public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void userMapperSave(User user) {
        userMapper.userMapperSave(user);
    }
}
