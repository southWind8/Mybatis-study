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
     * 根据ID查询用户
     * @param id
     * @return
     */
    User getUserById(int id);



}
