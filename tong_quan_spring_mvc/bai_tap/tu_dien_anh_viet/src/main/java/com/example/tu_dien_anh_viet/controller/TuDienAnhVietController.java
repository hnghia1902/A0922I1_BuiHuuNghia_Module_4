package com.example.tu_dien_anh_viet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
@Controller
public class TuDienAnhVietController {
private static HashMap<String, String> data;
static {
    data.put("Hello", "Xin Chào");
    data.put("Bye", "Tạm Biệt");
    data.put("Sun", "Mặt Trời");
}
@GetMapping("/translation")
    public ModelAndView traCuu(@RequestParam String traCuu){
        ModelAndView modelAndView = new ModelAndView("translation");
        String vn = data.get(traCuu);
        modelAndView.addObject("vn",vn);
        return modelAndView;
}

}
