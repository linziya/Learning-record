package com.lz.day02_springannotion.service.impl;

import com.lz.day02_springannotion.bean.User;
import com.lz.day02_springannotion.mapper.UserMapper;
import com.lz.day02_springannotion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
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
