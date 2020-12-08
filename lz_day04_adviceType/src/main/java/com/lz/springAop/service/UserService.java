package com.lz.springAop.service;

public interface UserService {

    /**
     * 保存
     */
    void saveUser();

    /**
     * 修改
     * @param name
     */
    void updateUser(String name);

    /**
     * s删除
     */
    int deleteUser();
}
