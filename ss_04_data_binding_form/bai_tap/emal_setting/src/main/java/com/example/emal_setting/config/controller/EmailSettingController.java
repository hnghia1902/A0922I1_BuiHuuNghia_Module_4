package com.example.emal_setting.config.controller;

import com.example.emal_setting.config.model.Setting;
import com.example.emal_setting.config.repository.ILanguagesRepository;
import com.example.emal_setting.config.repository.IPageSizeRepository;
import com.example.emal_setting.config.repository.ISettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailSettingController {
    @Autowired
    ILanguagesRepository languagesRepository;
    @Autowired
    IPageSizeRepository pageSizeRepository;
    @Autowired
    ISettingRepository settingRepository;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("list", settingRepository.findAll());
        return"setting";
    }
    @GetMapping("/edit")
    public String editForm(@RequestParam("id")int id, Model model){
        model.addAttribute("setting_data",settingRepository.findBySignarute(id));
        model.addAttribute("languages_data",languagesRepository.findAll());
        model.addAttribute("pageSize_data",pageSizeRepository.findAll());
        model.addAttribute("setting", new Setting());
        return "editForm";
    }
    @PostMapping("/Update")
    public String update(@ModelAttribute("setting")Setting setting){
        setting.setLanguages(languagesRepository.findById(setting.getLanguages().getLanguages_id()));
        setting.setPageSize(pageSizeRepository.findById(setting.getPageSize().getPageSize_id()));
        settingRepository.update(setting);
        return "redirect: list";
    }


}
