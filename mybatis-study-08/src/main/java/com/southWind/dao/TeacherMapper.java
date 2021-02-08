package com.southWind.dao;

import com.southWind.pojo.Teacher;

import java.util.List;

/**
 * @ClassName TeacherMapper
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/7
 **/

public interface TeacherMapper {

    /**
     * 查询老师
     * @return
     */
    Teacher getTeacher();

    /**
     * 获取老师
     * @return
     */
    List<Teacher> getListTeacher();

    /**
     * 获得指定老师的信息
     * @param id
     * @return
     */
    Teacher getTeacher(int id);
    /**
     * 获得指定老师的信息
     * @param id
     * @return
     */
    Teacher getTeacher2(int id);
}
