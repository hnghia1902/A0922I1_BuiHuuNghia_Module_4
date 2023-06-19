package com.example.upload.service;

import com.example.upload.entity.Music;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface IMusicService {

    void save (Music music);
    Iterable<Music> findAll();

    Music getOne(Long id);

    ResponseEntity<?> downloadFile(Long id);
}
