package com.example.tao_ung_dung_blog.controller;

import com.example.tao_ung_dung_blog.model.Blog;
import com.example.tao_ung_dung_blog.serivce.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/blog")
@Controller
public class BlogController {
    @Autowired
    IBlogService service;
    @GetMapping("/newBlog")
    public ModelAndView createForm(){
        ModelAndView modelAndView;
        return new ModelAndView("newBlog","blog",new Blog());
    }

}
