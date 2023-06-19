package com.example.tao_ung_dung_blog.serivce.impl;

import com.example.tao_ung_dung_blog.model.Blog;
import com.example.tao_ung_dung_blog.repository.IBlogRepository;
import com.example.tao_ung_dung_blog.serivce.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository blogRepository;
    @Override
    public void saveBlog(Blog blog) {
        blogRepository.saveBlog(blog);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogRepository.updateBlog(blog);

    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteBlog(id);
    }
}
