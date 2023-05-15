package com.example.sandwich_condiments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    private static List<String> giaVi = new ArrayList<>();
    static {
        giaVi.add("Lettuce");
        giaVi.add("Tomato");
        giaVi.add("Mustard");
        giaVi.add("Sprouts");
    }
    @GetMapping("/")
    public ModelAndView comdimentsForm(){
        ModelAndView modelAndView = new ModelAndView("condiments");
        modelAndView.addObject("giaVi",giaVi);
        return modelAndView;
    }
    @GetMapping("/save")
    public ModelAndView save(@RequestParam("condiment")String[] condiment){
        ModelAndView modelAndView = new ModelAndView("condiments_used");
        modelAndView.addObject("condiments",condiment);
        return modelAndView;
    }
}
