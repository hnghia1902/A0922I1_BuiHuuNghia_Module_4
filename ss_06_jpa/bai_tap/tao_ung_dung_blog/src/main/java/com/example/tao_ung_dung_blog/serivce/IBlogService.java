package com.example.tao_ung_dung_blog.serivce;

import com.example.tao_ung_dung_blog.model.Blog;

import java.util.List;

public interface IBlogService {
    void saveBlog(Blog blog);
    List<Blog> findAll();
    Blog findById(int id);
    void updateBlog(Blog blog);
    void deleteBlog(int id);
}
