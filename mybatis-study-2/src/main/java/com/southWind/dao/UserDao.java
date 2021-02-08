package com.southWind.dao;

import com.southWind.pojo.User;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/6
 **/

public interface UserDao {
    /**
     * 获得User对象
     * @return
     */
    List<User> getUserList();

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 插入一个用户
     * @param user
     * @return
     */
    int InsertUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delUser(int id);


}
