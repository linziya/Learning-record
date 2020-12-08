package com.lz.springAop.service.impl;

import com.lz.springAop.service.UserService;

public class UserServiceImpl implements UserService {
    public void saveUser() {
        System.out.println("service无参 无返回值：成功");
    }

    public void updateUser(String name) {
        System.out.println("service 有参：成功");
    }

    public int deleteUser() {
        System.out.println("service 有返回值：成功");
        return  0;
    }
}
