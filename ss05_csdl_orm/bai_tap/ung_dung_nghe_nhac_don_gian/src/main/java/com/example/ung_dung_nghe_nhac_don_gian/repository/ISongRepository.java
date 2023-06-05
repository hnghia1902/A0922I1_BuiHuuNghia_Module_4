package com.example.ung_dung_nghe_nhac_don_gian.repository;

import com.example.ung_dung_nghe_nhac_don_gian.model.Song;

import java.util.List;

public interface ISongRepository {
    void save(Song song);
    List<Song> findAll();
}
