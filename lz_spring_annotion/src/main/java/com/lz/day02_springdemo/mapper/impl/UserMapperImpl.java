package com.lz.day02_springdemo.mapper.impl;

import com.lz.day02_springdemo.bean.User;
import com.lz.day02_springdemo.mapper.UserMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component(value = "userMapper")

@Repository(value = "userMapper")
public class UserMapperImpl {

    @Select("select * from user")
    public List<User> userMapperSave() {
        System.out.println("查询成功！");
        return null;
    }
}
