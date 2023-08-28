package com.apifehome.demo.service;

import com.apifehome.persistence.repository.ImagesRepository;

public class ImagesService {
    private final ImagesRepository imagesRepository;

    public ImagesService(ImagesRepository imagesRepository){
        this.imagesRepository = imagesRepository;
    }
}
