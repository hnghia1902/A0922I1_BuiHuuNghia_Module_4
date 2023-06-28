package com.example.picture_day.service;


import com.example.picture_day.model.Comment;
import com.example.picture_day.repository.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void updateLike(int id){
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if(optionalComment.isPresent()){
            Comment comment = optionalComment.get();
            comment.setLiked(comment.getLiked()+1);
            commentRepository.save(comment);
        }
    }

    public void save(Comment comment){
        commentRepository.save(comment);
    }
}
