package com.springmvc.controller;

import com.springmvc.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("请求成功");

        //抛出异常
        try {
//            int i = 1/0;
        } catch (Exception e) {
            throw  new SysException("出现错误！");
        }

        return "success";
    }
}
