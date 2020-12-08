package com.lz.springAffairs.service;

import com.lz.springAffairs.bean.User;

public interface UserSevice  {
    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    User findtById(Integer id);

    /**
     * 转账
     * @param sourceName    转成账户名称
     * @param targetName    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName,String targetName,int money);

}
