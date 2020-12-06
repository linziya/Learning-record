package com.lz.day02_springdemo.service;

import com.lz.day02_springdemo.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserService {
    /**
     * c查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 新增数据
     * @param user
     */
    void userMapperSave(User user);

}
