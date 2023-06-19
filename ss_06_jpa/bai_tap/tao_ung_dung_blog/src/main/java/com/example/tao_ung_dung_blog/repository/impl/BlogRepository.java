package com.example.tao_ung_dung_blog.repository.impl;

import com.example.tao_ung_dung_blog.model.Blog;
import com.example.tao_ung_dung_blog.repository.IBlogRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class BlogRepository implements IBlogRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveBlog(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public List<Blog> findAll() {
        return entityManager.createQuery("select b from Blog b").getResultList();
    }

    @Override
    public Blog findById(int id) {
        return entityManager.find(Blog.class, id);
    }

    @Override
    public void updateBlog(Blog blog) {
        entityManager.merge(blog);
    }

    @Override
    public void deleteBlog(int id) {
        Blog blog = findById(id);
        entityManager.remove(blog);
    }
}
