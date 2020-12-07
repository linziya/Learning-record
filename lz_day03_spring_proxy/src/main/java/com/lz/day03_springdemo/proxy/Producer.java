package com.lz.day03_springdemo.proxy;

public interface Producer {
    /**
     * 销售
     * @param money
     */
    void saleProducer(float money);

    /**
     * 售后
     * @param money
     */
    void afterProducet(float money);

}
