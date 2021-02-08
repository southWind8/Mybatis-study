package com.southWind.dao;

import com.southWind.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogMapper
 * @Description TODO
 * @Author 86139
 * @Date 2021/2/8
 **/

public interface BlogMapper {
    /**
     * 插入
     * @param blog
     */
    void addBlog(Blog blog);

    /**
     * 查询
     * @return
     */
    List<Blog> selectBlog();

    /**
     * 查询博客
     * @param map
     * @return
     */
    List<Blog> queryBlog(Map map);

    /**
     * 查询页
     * @param map
     * @return
     */
    List<Blog> queryBlogChoose(Map map);

    /**
     * 更新博客
     * @param map
     * @return
     */
    int updateBlog(Map map);

    /**
     * 查询
     * @param map
     * @return
     */
    List<Blog> queryBlogForEach(Map map);
}
