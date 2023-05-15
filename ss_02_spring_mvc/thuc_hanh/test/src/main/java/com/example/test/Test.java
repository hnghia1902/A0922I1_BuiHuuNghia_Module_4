package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Test {
    @RequestMapping(value = "/test{id}")
    public ModelAndView test(@PathVariable double id){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("id",id);
        return modelAndView;
    }

}
