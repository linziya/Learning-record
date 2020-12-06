package com.lz.day02_springdemo.mapper;

import com.lz.day02_springdemo.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository(value = "userMapper")
public interface UserMapper {

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
