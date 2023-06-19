package com.example.upload.repository;

import com.example.upload.entity.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long> {

}
