package com.southWind.dao;

import com.southWind.pojo.User;
import com.southWind.utils.MybatisUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void getUserList() {
        //1获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一:getMapper
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //方式二:不推荐使用
            List<User> userList = sqlSession.selectList("com.southWind.dao.UserDao.getUserList");
            //  List<User> userList = userDao.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);


        sqlSession.close();
    }

    @Test
    public void insertUser() {
        User user=new User(4,"南风4","123456");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.InsertUser(user);
        if(i!=0){
            System.out.println("新增成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.updateUser(new User(4, "南风4", "123"));
        if(i!=0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void delUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.delUser(4);
        if(i!=0){
            System.out.println("删除ok");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserLike("%南风%");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}