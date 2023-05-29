package com.example.quan_li_du_lieu_khach_hang.controller;

import com.example.quan_li_du_lieu_khach_hang.model.Customer;
import com.example.quan_li_du_lieu_khach_hang.model.service.ICustomerService;
import com.example.quan_li_du_lieu_khach_hang.model.service.impl.CustomerService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();

    @GetMapping("")
    public String index(Model model) {

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }
}
