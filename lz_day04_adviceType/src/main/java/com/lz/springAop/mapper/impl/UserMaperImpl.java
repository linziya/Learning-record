package com.lz.springAop.mapper.impl;

import com.lz.springAop.mapper.UserMapper;

public class UserMaperImpl implements UserMapper {
    public void saveUser() {
        System.out.println("成功");
    }

    public void updateUser(String name) {
        System.out.println("成功");
    }

    public void deleteUser() {
        System.out.println("成功");
    }
}
