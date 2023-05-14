package com.example.chuyen_doi_tien_te;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConversionController {
    @PostMapping("/conversion")
    public ModelAndView conversion(@RequestParam double usd){
        ModelAndView modelAndView = new ModelAndView("conversion");
        usd = usd * 237000;
        modelAndView.addObject("vnd", usd);
        return modelAndView;
    }
}
