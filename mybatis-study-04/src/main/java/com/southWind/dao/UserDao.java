package com.southWind.dao;

import com.southWind.pojo.User;

import java.util.List;
import java.util.Map;

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

    /**
     * 实现分页
     * @param map
     * @return
     */
    List<User> getUserLimit(Map<String,Integer> map);



}
