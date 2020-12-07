package com.lz.day03_springdemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {


    public static void main(String[] args) {

         final ProducerImlp producer = new ProducerImlp();

         producer.saleProducer(1000f);

        /**
         * 动态代理 用于不修改源码的基础上增强方法，可以随时创建、加载
         *
         * 分类 基于接口的动态代理
         *  提供者：官方（jdk） 类 proxy
         *  创建方式 通过proxy类中的newProxyInstance
         *  要求：最少实现一个接口。否则不能使用
         *  newProxyInstance中参数
         *      ClassLoader：类加载器 xxx.getClass().getClassLoader()
         *      Class[] 字节码数组  xxx.getClass().getInterfaces()
         *      InvocationHandler 写增强的代码
         *
         *      基于子类的动态代理
         *
         *
         *
         */
        Producer proxyproducer =
                (Producer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                    producer.getClass().getInterfaces(),
                    new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象的引用
             * @param method 当前执行方法（被代理方法）
             * @param args 需要的参数
             * @return 与被代理方法对象有相同的返回值
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //提供增强的代码
                Object returnValue = null;

                //1.获取方法执行的参数
                Float money = (Float)args[0];
                //2.判断当前方法是不是销售
                if("saleProducer".equals(method.getName())) {
                    // 注意 使用invoke时，，参数必现有final修饰
                    returnValue = method.invoke(producer, money*0.8f);
                }
                return returnValue;
            }
        });

        proxyproducer.saleProducer(10000f);

    }
}
