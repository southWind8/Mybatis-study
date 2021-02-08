package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @ClassName student
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/7
 **/
@AllArgsConstructor
@Data
@Builder
public class Student {


    public Student() {
    }

    private int id;
private String name;
    private int tid;


//学生需要关联一个老师
    /**
     * 绑定
     */
}
