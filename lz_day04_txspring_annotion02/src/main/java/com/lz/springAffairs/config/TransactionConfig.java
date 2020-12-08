package com.lz.springAffairs.config;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class TransactionConfig {
    /**
     * 创建事务管理器对象
     * @param dataSource
     * @return
     */
    public PlatformTransactionManager createTransactionManager(DataSource dataSource){
        return  new DataSourceTransactionManager(dataSource);
    }
}
