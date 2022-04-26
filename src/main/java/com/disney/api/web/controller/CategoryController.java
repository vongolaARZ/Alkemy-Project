package com.disney.api.web.controller;

import com.disney.api.domain.service.CategoryService;
import com.disney.api.persistence.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    CategoryService categoryService;

    @PostMapping ("/save")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }

    @GetMapping("/id/{id}")
    public Optional<Category> findById( @PathVariable("id") Long id){
        return categoryService.findById(id);
    }
}
