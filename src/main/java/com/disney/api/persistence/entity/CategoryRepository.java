package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public void save (Category category){

        categoryCrudRepository.save(category);

    }



}
