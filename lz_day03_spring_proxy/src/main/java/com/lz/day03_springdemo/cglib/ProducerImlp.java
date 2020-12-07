package com.lz.day03_springdemo.cglib;

public class ProducerImlp  {
    public void saleProducer(float money) {
        System.out.println("销售产品，得到了"+money);
    }

    public void afterProducet(float money) {
        System.out.println("售后服务，或得了"+money);
    }
}
