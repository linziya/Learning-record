package com.lz.springmvc.controller;

import com.lz.springmvc.bean.Account;
import com.lz.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "/sayHello")
    public String sayHello(){
        System.out.println("hello mvc");
        return "auccess";
    }

    @RequestMapping("/testMapper")
    public String testMapper(){
        System.out.println("测试多目录成功");
        return "requestMapper";
    }
    @RequestMapping("/userdemo1")
    public String userdemo1(String userName){
        System.out.println("成功"+userName);
        return "requestMapper";
    }

    /**
     * 数据封装到javabean
     * @param user
     * @return
     */
    @RequestMapping("/userdemo2")
    public String userdemo2(User user){

        System.out.println(user.toString());
        return "requestMapper";
    }

    @RequestMapping("userdemo3")
    public String userdemo3(User user){
        System.out.println(user.toString());
        return "requestMapper";
    }

    /**
     * 集合类型封装
     * @param user
     * @return
     */
    @RequestMapping("userdemo4")
    public String userdemo4(User user){
        System.out.println(user.toString());
        return "requestMapper";
    }

    /**
     * 自定义类型封装
     * @param account
     * @return
     */
    @RequestMapping("accountdemo5")
    public String accountdemo5(Account account){
        System.out.println(account.toString());
        return "requestMapper";
    }
}
