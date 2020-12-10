package com.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 业务逻辑处理
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException sysException = null ;
        if(e instanceof SysException){
            sysException = (SysException) e;
        }else {
            sysException = new SysException("系统维护中");
        }
        ModelAndView view = new ModelAndView();
        view.addObject("errorMsg",sysException.getMessage());
        view.setViewName("error");

        return view;
    }
}
