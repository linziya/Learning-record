package com.lz.springAop.service.impl;

import com.lz.springAop.mapper.UserMapper;
import com.lz.springAop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser() {
        System.out.println("service无参 无返回值：成功");
//        int i =  1/0;
    }

    public void updateUser(String name) {
        System.out.println("service 有参：成功");
    }

    public int deleteUser() {
        System.out.println("service 有返回值：成功");
        return  0;
    }
}
