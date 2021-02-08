package com.southWind.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.southWind.pojo.Student;
import com.southWind.pojo.Teacher;
import com.southWind.utils.MybatisUtils;
import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;


import java.util.List;
import org.apache.log4j.Logger;
import static org.junit.Assert.*;

public class StudentMapperTest {
    static Logger logger = Logger.getLogger(StudentMapper.class);

    @org.junit.Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);
        sqlSession.close();
    }

    @org.junit.Test
    public void getStudent2() {
    }
}