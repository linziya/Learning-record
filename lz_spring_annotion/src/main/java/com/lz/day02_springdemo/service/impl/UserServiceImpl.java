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

/**
 * 注解
 *
 * 分类
 * 用于创建对象 相当于bean标签
 *      @Component  作用把当前类对象存入容器中
 *      value属性 相当于id 不写时默认当前类。且首字母改为小写
 *
 *      Controller 控制器
 *      Service 服务端
 *      Repository 数据库
 *
 *  注入数据 与property属性作用一致
 *      Autowired 按照类型自动注入 要求容器中存在一个bean对象与需要注入的类型匹配。如果存在多个对象时。那么通过变量名去匹配。
 *      都不能匹配成功是报错
 *      可以写在变量或方法上， 当使用这个注解时 set方法可以省略
 *      Qualifier 在按照类型注入的基础上按照方法注入 给类成员注入时不能单独使用。只能与Autowired联用
 *          value属性是用于指定注入bean的id
 *       Resource  按照bean的id注入。可以独立使用
 *           name 属性指定bean的id
 *       Value 给基本类型与String类型注入值
 *          value属性写值 也能使用spring的El表达式 ${}
 *          *怎么区分表达式是spring mybatis 前端的（主要看书写的位置）
 *
 *       集合类型只能使用xml配置的方式
 *
 *  改变作用范围  与scope属性作用一致
 *      scope 指定bean的取值范围
 *          常用的value值有 singleton  prototype(多列)
 *  生命周期  与init-method
 */
//@Component("userService")
    @Service(value = "userService")
public class UserServiceImpl implements UserService {

//    @Resource("userMapper")
    @Autowired()
    private UserMapper userMapper ;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void UserServiceSave() {
        List<User> users = userMapper.userMapperSave();
        for(User user : users){
            user.toString();
        }
        System.out.println("操作成功！");
    }
}
