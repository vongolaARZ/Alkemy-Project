package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public Category save (Category category){

        return  categoryCrudRepository.save(category);
    }

    public Optional<Category> findById (Long idCategory){

        return categoryCrudRepository.findById(idCategory);

    }





}
