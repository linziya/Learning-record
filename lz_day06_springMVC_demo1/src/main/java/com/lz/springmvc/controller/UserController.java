package com.lz.springmvc.controller;

import com.lz.springmvc.bean.Account;
import com.lz.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @RequestMapping(path = "/sayHello")
    public String sayHello(Model model){
        User user = new User();
        user.setId(1);
        user.setUsername("林");
        user.setPassword("123");

        //存入域对象中
        model.addAttribute("user",user);
        return "auccess";
    }


    @RequestMapping(path = "/demo2")
    public void demo2(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(1);
        user.setUsername("林");
        user.setPassword("123");


        //转发   使用servlet 时 不会到视图解析器中跳转目录。需要手动写目录
//        request.getRequestDispatcher("/WEB-INF/pages/auccess.jsp").forward(request,response);
         //重定向
//        response.sendRedirect(request.getContextPath()+"pages/auccess.jsp");

        //处理中文乱码问题
        response.setCharacterEncoding("UTF-8");
        response.setContentType("test/html;charset=utf-8");
        //响应
        response.getWriter().print("林子测试");
        return;
    }

    @RequestMapping("/demo3")
    public ModelAndView demo03(){

        User user = new User();

        ModelAndView view = new ModelAndView();
        user.setId(1);
        user.setUsername("林");
        user.setPassword("123");

        //把对象存到view对象中，该对象会存入request中
        view.addObject("user",user);

        //跳转到什么页面
        view.setViewName("auccess");

        return view;
    }



    @RequestMapping("/demo4")
    public String demo04(){
        //转发
//        return "forward:/WEB-INF/pages/auccess.jsp";
        System.out.println("成功！");
        return "redirect:/index.jsp";
    }

    /**
     * 异步请求响应
     */
    @RequestMapping("/demo5")
    public void demo5(@RequestBody String body ){
        System.out.println(body);

    }

    /**
     *
     *  ResponseBody   把对象转换为json 用于传给前端
     * @param user
     * @return
     */
    @RequestMapping("/demo6")
    public @ResponseBody User demo6(@RequestBody User user ){
        System.out.println(user);

        user.setUsername("月");
        user.setId(2);

        //响应
        return user;
    }


}
