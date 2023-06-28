package com.example.tao_ung_dung_blog.controller;

import com.example.tao_ung_dung_blog.model.Blog;
import com.example.tao_ung_dung_blog.serivce.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/saveBlog")
    public String saveBlog(@ModelAttribute("blog")Blog blog){
        service.saveBlog(blog);
        return "listBlog";
    }
    @GetMapping("/listBlog")
    public ModelAndView listBlog(){
        ModelAndView listBlog;
        return new ModelAndView("listBlog","list",service.findAll());
    }
    @GetMapping("/blog{id}")
    public ModelAndView blog(@PathVariable("id")int id){
        ModelAndView blog;
        return new ModelAndView("blog","blog_object",service.findById(id));
    }
    @GetMapping("/blogUpdateForm{id}")
    public ModelAndView blogUpdateForm(@PathVariable("id")int id){
        return new ModelAndView("blogUpdate","blog_object",service.findById(id));
    }
    @GetMapping("/blogUpdate")
    public ModelAndView updateBlog(@ModelAttribute("blog_object")Blog blog){
        service.updateBlog(blog);

        return new ModelAndView("redirect:/blog/listBlog");

    }
    @GetMapping("/delete{id}")
    public ModelAndView deleteBlog(@PathVariable("id")int id){
        service.deleteBlog(id);
        return new ModelAndView("redirect:/blog/listBlog");
    }


}
