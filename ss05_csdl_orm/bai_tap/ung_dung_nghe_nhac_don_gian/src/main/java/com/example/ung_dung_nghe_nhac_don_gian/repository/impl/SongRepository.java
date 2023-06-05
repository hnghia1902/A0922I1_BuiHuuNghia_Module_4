package com.example.ung_dung_nghe_nhac_don_gian.repository.impl;

import com.example.ung_dung_nghe_nhac_don_gian.model.Song;
import com.example.ung_dung_nghe_nhac_don_gian.repository.ISongRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class SongRepository implements ISongRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void save(Song song) {
        entityManager.persist(song);
    }

    @Override
    public List<Song> findAll() {
        return entityManager.createQuery("select s from Song s").getResultList();
    }
}
