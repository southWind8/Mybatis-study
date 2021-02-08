package com.southWind.dao;

import com.southWind.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/7
 **/

public interface UserMapper {
    /**
     * 获取全部用户
     * @return
     */
    @Select("select * from user")
    List<User> getUsers();

    /**
     * 返回id
     * @param id
     * @param id
     * @return
     */
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);

    /**
     * 增加
     * @param user
     * @return
     */
    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    int delUser(int id);

}
