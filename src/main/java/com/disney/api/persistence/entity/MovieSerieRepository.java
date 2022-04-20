package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.MovieSerieCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieSerieRepository {


    @Autowired
    private MovieSerieCrudRepository movieSerieCrudRepository;




    public MovieSerie save(MovieSerie movieSerie){

       return movieSerieCrudRepository.save(movieSerie);

    }

    public void delete(MovieSerie movieSerie){

        movieSerieCrudRepository.delete(movieSerie);
    }

    public MovieSerie findByTitle(String title){

        return movieSerieCrudRepository.findByTitle(title);

    }

    public List<MovieSerie> findByCategory(Category category){

        return movieSerieCrudRepository.findByCategory(category);

    }

    public List<MovieSerie> findAll(){

        return movieSerieCrudRepository.findAll();

    }


    public List<MovieSerie> orderByTitleAsc(){

        return movieSerieCrudRepository.findByTitleOrderByTitleAsc();
    }

    public List<MovieSerie> orderByDateDesc(){

        return movieSerieCrudRepository.findByDateorderByDateDesc();
    }



}
