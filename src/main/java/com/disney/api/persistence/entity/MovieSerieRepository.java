package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.MovieSerieCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieSerieRepository {


    @Autowired
    private MovieSerieCrudRepository movieSerieCrudRepository;

    public void save(MovieSerie movieSerie){

        movieSerieCrudRepository.save(movieSerie);

    }

    public void delete(MovieSerie movieSerie){

        movieSerieCrudRepository.delete(movieSerie);
    }

    public MovieSerie findByTitulo(String title){

        return movieSerieCrudRepository.findByTitle(title);

    }

    public List<MovieSerie> findByCategory(Category category){

        return movieSerieCrudRepository.findByCategory(category);

    }

    public List<MovieSerie> findAll(){

        return movieSerieCrudRepository.findAll();

    }



}
