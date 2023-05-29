package com.example.form_to_khai_y_te.Controller;

import com.example.form_to_khai_y_te.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormKhaiBaoController {
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("form", new Form());
        return "to_khai_y_te";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("form")Form form){
        formList.add(form);
        return "redirect:list";
    }
    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("list",formList);
        return "listForm";
    }

    private static List<Form> formList;
    static {
        formList = new ArrayList<>();
    }


}
