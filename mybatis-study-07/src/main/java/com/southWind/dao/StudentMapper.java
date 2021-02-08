package com.southWind.dao;

import com.southWind.pojo.Student;

import java.util.List;

/**
 * @ClassName StudentMapper
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/7
 **/

public interface StudentMapper {
    //查询学生信息以及对应的老师的信息

    /**
     * 得到学校信息
     * @return
     */
    public List<Student> getStudent();

    /**
     * 得到学生信息
     * @return
     */
    public List<Student> getStudent2();

}
