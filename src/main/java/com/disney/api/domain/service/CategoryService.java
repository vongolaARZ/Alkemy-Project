package com.disney.api.domain.service;

import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    public Category save(Category category){

        return categoryRepository.save(category);
    }

    public Optional<Category> findById(Long categoryId){
        return categoryRepository.findById(categoryId);
    }
}
