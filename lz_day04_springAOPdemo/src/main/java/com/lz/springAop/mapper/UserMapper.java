package com.lz.springAop.mapper;

public interface UserMapper {
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
    void deleteUser();
}
