package com.example.caculator.controller;

import com.example.caculator.model.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @Autowired
    ICaculatorService caculatorService;
    @GetMapping("/")
    public ModelAndView caculatorForm(){
        ModelAndView modelAndView = new ModelAndView("caculator");
        modelAndView.addObject("operator",caculatorService.operator());
        return modelAndView;
    }
    @GetMapping("/result")
    public ModelAndView result(@RequestParam ("first_number") double first_number,@RequestParam("operator") String operator, @RequestParam("second_number") double second_number){
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("result",caculatorService.caculator(first_number,operator,second_number));
        return modelAndView;
    }
}
