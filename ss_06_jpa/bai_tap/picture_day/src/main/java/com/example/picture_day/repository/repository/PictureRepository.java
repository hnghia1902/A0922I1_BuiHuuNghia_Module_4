package com.example.picture_day.repository.repository;


import com.example.picture_day.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PictureRepository extends JpaRepository<Picture, Integer> {
    Optional<Picture> findPictureByDisplayDate(LocalDate date);

    Optional<Picture> find(LocalDate toLocalDate);
}
