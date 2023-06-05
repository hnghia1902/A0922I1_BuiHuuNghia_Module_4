package com.example.ung_dung_nghe_nhac_don_gian.service.impl;

import com.example.ung_dung_nghe_nhac_don_gian.model.Song;
import com.example.ung_dung_nghe_nhac_don_gian.repository.ISongRepository;
import com.example.ung_dung_nghe_nhac_don_gian.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    ISongRepository songRepository;


    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }
}
