package com.disney.api.domain.service;


import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import com.disney.api.persistence.entity.MovieSerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieSerieService {

    @Autowired
    private MovieSerieRepository movieSerieRepository;


    public List<MovieSerie> findAll(){

        return movieSerieRepository.findAll();

    }

    public MovieSerie findByTitle(String title){

        return movieSerieRepository.findByTitle(title);
    }

    public List<MovieSerie> findByCategory(Category category){

        return movieSerieRepository.findByCategory(category);
    }

    public List<MovieSerie> orderByTitleAsc(){

        return movieSerieRepository.orderByTitleAsc();
    }


    public List<MovieSerie> orderByDateDesc(){

        return movieSerieRepository.orderByDateDesc();
    }


    public MovieSerie save(MovieSerie movieSerie){

      return  movieSerieRepository.save(movieSerie);

    }

    public void delete(MovieSerie movieSerie){

        movieSerieRepository.delete(movieSerie);
    }








}
