package com.southWind.dao;

import com.southWind.pojo.User;
import com.southWind.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UserDaoTest {

    @org.junit.Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

    @org.junit.Test
    public void getUserById() {
    }

    @org.junit.Test
    public void insertUser() {
    }

    @org.junit.Test
    public void updateUser() {
    }

    @org.junit.Test
    public void delUser() {
    }
}