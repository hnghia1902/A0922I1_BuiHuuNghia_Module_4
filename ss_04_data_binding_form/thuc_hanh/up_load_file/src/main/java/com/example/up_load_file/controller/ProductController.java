package com.example.up_load_file.controller;

import com.example.up_load_file.model.Product;
import com.example.up_load_file.service.IProductService;
import com.example.up_load_file.service.impl.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")

public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String index(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "/index";
    }
}
