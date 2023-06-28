package com.example.picture_day.repository.repository;


import com.example.picture_day.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    void updateLike(Integer c);
}
