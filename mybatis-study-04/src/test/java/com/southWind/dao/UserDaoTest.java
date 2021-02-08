package com.southWind.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.southWind.pojo.User;
import com.southWind.utils.MybatisUtils;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @org.junit.Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(3);
        System.out.println(userById);
        sqlSession.close();

    }
@Test
    public void testLog4j(){
        logger.info("info:进入了log4j方法");
        logger.debug("debug:进入了log4j以debug方式");
        logger.error("error:进入了log4j的error");
}
@Test
    public void getUserByLimit(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    UserDao mapper = sqlSession.getMapper(UserDao.class);
    HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
    stringIntegerHashMap.put("startIndex",0);
    stringIntegerHashMap.put("pageSize",4);
    List<User> userLimit = mapper.getUserLimit(stringIntegerHashMap);
    for (User user : userLimit) {
        System.out.println(user);

    }
    sqlSession.close();

}

}