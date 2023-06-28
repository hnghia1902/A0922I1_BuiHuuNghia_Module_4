package com.example.picture_day.service;


import com.example.picture_day.model.Picture;
import com.example.picture_day.repository.repository.PictureRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class PictureService {
    private final PictureRepository pictureRepository;

    public PictureService(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }

    public Optional<Picture> find(LocalDate localDate){
        return pictureRepository.findPictureByDisplayDate(localDate);
    }
}
