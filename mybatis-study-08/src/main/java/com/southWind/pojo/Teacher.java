package com.southWind.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/7
 **/
@AllArgsConstructor
@Data
@Builder
public class Teacher {
    private int id;
    private String name;

    public Teacher() {
    }

    private List<Student> students;
}
