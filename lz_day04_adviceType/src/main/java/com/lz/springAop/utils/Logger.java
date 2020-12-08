package com.lz.springAop.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志类 用于提供公共代码
 */
public class Logger {
    /**
     * 前置通知
     */
    public void beforPrintlog(){
        System.out.println("befor执行了");
    }
    /**
     * 后置通知
     */
    public void afterReturningPrintlog(){
        System.out.println("afterReturning执行了");
    }
    /**
     * 异常通知
     */
    public void afterThrowingPrintlog(){
        System.out.println("afterThrowing执行了");
    }
    /**
     * 最终通知
     */
    public void afterPrintlog(){
        System.out.println("after执行了");
    }

    /**
     * 环绕通知
     * 使用环绕通知时需要明确调用切入点方法，spring提供了一个接口   该接口中提供了一个 且这个接口可以作为环绕通知的参数
     * 传入通知方法内
     *
     * 注意。环绕通知的增强方法写在proceed前代表前置通知。后则后置  异常中为异常通知。finally中为最终通知
     *
     */
    public Object aroundPrintLog(ProceedingJoinPoint joinPoint) {
        Object rtValue = null;
        try {
            //获取方法执行的参数
            Object[] args = joinPoint.getArgs();
            System.out.println("环绕前置执行了");

            //明确调用切入点方法（业务层方法）
            rtValue = joinPoint.proceed();

            System.out.println("环绕后置执行了");

            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("环绕异常执行了");
            throw  new RuntimeException(throwable);
        }finally {
            System.out.println("最终执行了");
        }

    }
}
