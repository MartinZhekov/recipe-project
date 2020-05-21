package com.martinzhekov.recepieproject.services;

import com.martinzhekov.recepieproject.domain.Recipe;
import com.martinzhekov.recepieproject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by martinzhekov on 20.05.20
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService{

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    @Transactional
    public void saveImageFile(Long id, MultipartFile file) {
        log.debug("Received a file: " + file.getName());
        try {
            Recipe recipe =recipeRepository.findById(id).get();

            Byte[] bytes = new Byte[file.getBytes().length];

            int i = 0;

            for(byte b : file.getBytes()){
                bytes[i++] = b;
            }

            recipe.setImage(bytes);
            recipeRepository.save(recipe);
        }catch (IOException e) {
            //todo handle better
            log.error("Error occurred", e);
            e.printStackTrace();
        }
    }
}