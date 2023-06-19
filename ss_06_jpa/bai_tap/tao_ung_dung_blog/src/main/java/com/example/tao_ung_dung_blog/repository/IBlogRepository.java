package com.example.tao_ung_dung_blog.repository;

import com.example.tao_ung_dung_blog.model.Blog;

import java.util.List;

public interface IBlogRepository {
    void saveBlog(Blog blog);
    List<Blog> findAll();
    Blog findById(int id);
    void updateBlog(Blog blog);
    void deleteBlog(int id);
}
