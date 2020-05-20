package com.martinzhekov.recepieproject.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by martinzhekov on 20.05.20
 */


public interface ImageService {

    void saveImageFile(Long id, MultipartFile file);
}
