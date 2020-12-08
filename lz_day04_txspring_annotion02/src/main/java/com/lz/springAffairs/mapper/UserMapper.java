package com.lz.springAffairs.mapper;

import com.lz.springAffairs.bean.User;

public interface UserMapper {
    User findById(Integer id);
    User findByName(String name);
    void updateUser(User user);
}
