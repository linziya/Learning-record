package com.lz.day03_springdemo.cglib;


import net.sf.cglib.proxy.Enhancer;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {


    public static void main(String[] args) {

         final ProducerImlp producer = new ProducerImlp();

         producer.saleProducer(1000f);

        /**
         * 动态代理 用于不修改源码的基础上增强方法，可以随时创建、加载
         *
         * 分类 基于子类的动态代理
         *  提供者：第三方 类 Enhancer
         *  创建方式 通过Enhancer类中的create
         *  要求：被代理类不能是最终类
         *  newProxyInstance中参数
         *      Class：被代理对象的字节码 xxx.getClass()

         *      InvocationHandler 写增强的代码
         *
         *      基于子类的动态代理
         *
         */

        ProducerImlp proxy = (ProducerImlp) Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             *
             * @param o 引用对象-
             * @param method 当前执行方法
             * @param objects 传入参数
             * @param methodProxy 当前执行方法的代理对象
             * @return
             * @throws Throwable
             */

            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object returnValue = null;

                //1.获取方法执行的参数
                Float money = (Float)objects[0];
                //2.判断当前方法是不是销售
                if("saleProducer".equals(method.getName())) {
                    returnValue = method.invoke(producer, money*0.8f);
                }
                return returnValue;
            }
        });
        proxy.saleProducer(10000f);

    }
}
