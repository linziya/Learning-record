package com.lz.springAffairs.service.impl;

import com.lz.springAffairs.bean.User;
import com.lz.springAffairs.mapper.UserMapper;
import com.lz.springAffairs.service.UserSevice;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserServiceImpl implements UserSevice {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findtById(Integer id) {
        return userMapper.findById(id);
    }

    public void transfer(String sourceName, String targetName, int money) {
        System.out.println("transfer....");
        //2.1根据名称查询转出账户
        User source = userMapper.findByName(sourceName);
        //2.2根据名称查询转入账户
        User target = userMapper.findByName(targetName);
        //2.3转出账户减钱
        source.setAge(source.getAge()-money);
        //2.4转入账户加钱
        target.setAge(target.getAge()+money);
        //2.5更新转出账户
        userMapper.updateUser(source);

        int i=1/0;

        //2.6更新转入账户
        userMapper.updateUser(target);
    }
}
