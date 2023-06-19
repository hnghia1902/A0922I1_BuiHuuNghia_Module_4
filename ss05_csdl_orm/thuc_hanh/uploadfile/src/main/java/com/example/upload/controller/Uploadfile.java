package com.example.upload.controller;

import com.example.upload.entity.Music;
import com.example.upload.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RequestMapping("/")
@Controller
public class Uploadfile {
    @Autowired
    IMusicService musicService;
    @GetMapping("/")
    public String musicForm(Model model){
        model.addAttribute("songs", musicService.findAll());
        return "/views/list";
    }
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
        try {
            Music music = new Music();
            music.setName(file.getOriginalFilename());
            music.setContent(file.getBytes());
            musicService.save(music);

            redirectAttributes.addFlashAttribute("message", "Upload successful!");

        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("error", "Upload failed!");
        }

        return "redirect:/";
    }

    @GetMapping("file/{id}")
    public ResponseEntity<?> playMp3(HttpServletRequest request, @PathVariable Long id) {
        return musicService.downloadFile(id);
    }

}
