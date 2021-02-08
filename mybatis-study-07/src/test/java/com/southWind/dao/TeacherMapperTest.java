package com.southWind.dao;

import com.southWind.pojo.Teacher;
import com.southWind.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TeacherMapperTest {

    @Test
    public void getListTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> listTeacher = mapper.getListTeacher();
        for (Teacher teacher : listTeacher) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher.toString());
        sqlSession.close();
    }
}