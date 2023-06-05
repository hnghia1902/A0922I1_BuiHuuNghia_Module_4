package com.example.ung_dung_nghe_nhac_don_gian.controller;


import com.example.ung_dung_nghe_nhac_don_gian.model.Song;
import com.example.ung_dung_nghe_nhac_don_gian.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    ISongService songService;
    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("song", new Song());
        return "createSong";
    }
    @PostMapping("save")
    public String save(@ModelAttribute("Song")Song song){
        songService.save(song);
        return "redirect:/song/create";
    }
    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("Songs",songService.findAll());
        return "listSong";
    }
}
