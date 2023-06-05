package com.example.ung_dung_quan_li_san_pham.controller;

import com.example.ung_dung_quan_li_san_pham.model.Product;
import com.example.ung_dung_quan_li_san_pham.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("listProduct","list",productService.findAll());
        return modelAndView;
    }

    @GetMapping ("/createForm")
    public String save(Model model){
        model.addAttribute("product", new Product());
        return "createForm";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("product")Product product){
        productService.create(product);
            return "redirect: /products";
    }
    @GetMapping("/updateForm/{id}")
    public String updateForm(Model model,
                             @PathVariable("id")int id){
        model.addAttribute("product", productService.findById(id));
        return "updateForm";
    }
    @PostMapping("/update")
    public String updateProduct(@ModelAttribute("product")Product product){
        productService.update(product);
        return "redirect:products";
    }

}
