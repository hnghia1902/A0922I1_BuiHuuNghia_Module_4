package com.example.upload.service;

import com.example.upload.entity.Music;
import com.example.upload.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MusicService implements IMusicService{
    @Autowired
    MusicRepository musicRepository;


    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Iterable<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music getOne(Long id) {
        return musicRepository.findById(id).get();
    }

    @Override
    public ResponseEntity<?> downloadFile(Long id) {
        Optional<Music> opSong = musicRepository.findById(id);
            HttpHeaders headers = new HttpHeaders();
        byte[] byteArrayFile = null;

        if (opSong.isPresent()) {
            headers.set("Content-type", "audio/mp3");
            headers.set("Content-Disposition", "attachment; filename=\"" + opSong.get().getName() + "\"");
            byteArrayFile = opSong.get().getContent();
        }

        // to view in browser change attachment to inline

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(byteArrayFile);

//        String fileName = "";
//        if (opSong.isPresent()) {
//            path = opSong.get().getPath();
//            resource = CommonUtil.loadFileAsResource(path);
//            fileName = opSong.get().getName();
//        }
//
//        return ResponseEntity.ok()
//                .contentType(CommonUtil.getMediaTypeForFileName(servletContext,fileName))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
//                .body(resource);
//    }

    }
}
