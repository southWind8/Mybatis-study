package com.southWind.dao;

import com.southWind.pojo.User;
import com.southWind.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @org.junit.Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
        //        select * from mybatis.user where id = #{id}
        //        select id,name,pwd as password from mybatis.user where id = #{id}
    }

    @Test
    public void getUserById() {

    }
}