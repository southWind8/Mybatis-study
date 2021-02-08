package com.southWind.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @ClassName IDutils
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/8
 **/
@SuppressWarnings("all")//镇压警告
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }




}
