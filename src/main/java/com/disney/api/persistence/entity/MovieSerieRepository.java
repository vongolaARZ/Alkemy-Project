package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.CategoryCrudRepository;
import com.disney.api.persistence.crud.MovieSerieCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class MovieSerieRepository {


    @Autowired
    private MovieSerieCrudRepository movieSerieCrudRepository;
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;




    public MovieSerie save(MovieSerie movieSerie){

       return movieSerieCrudRepository.save(movieSerie);

    }

    public void delete(MovieSerie movieSerie){

        movieSerieCrudRepository.delete(movieSerie);
    }

    public MovieSerie findByTitle(String title){

        return movieSerieCrudRepository.findByTitle(title);

    }

    public List<MovieSerie> getByCategoryId(Long categoryId){

        Category category1 = categoryCrudRepository.getById(categoryId);


        return category1.getMovieSeries();

    }

    public List<MovieSerie> findAll(){

        return movieSerieCrudRepository.findAll();

    }








}
