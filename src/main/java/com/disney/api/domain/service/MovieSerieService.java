package com.disney.api.domain.service;


import com.disney.api.domain.dto.CharacterDto;
import com.disney.api.domain.dto.MovieSerieDto;
import com.disney.api.persistence.crud.MovieSerieCrudRepository;
import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import com.disney.api.persistence.entity.MovieSerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieSerieService {

    @Autowired
    private MovieSerieRepository movieSerieRepository;








    public MovieSerie save(MovieSerie movieSerie){

        return  movieSerieRepository.save(movieSerie);

    }

    public void delete(MovieSerie movieSerie){

        movieSerieRepository.delete(movieSerie);
    }


    public List<MovieSerieDto> findAll(){

        List<MovieSerie> movieSeriesEnity = movieSerieRepository.findAll();

        return movieSeriesEnity.stream().map(movieSerie -> {
            return new MovieSerieDto(movieSerie.getImage(),movieSerie.getTitle(),movieSerie.getDateOfCreation());
        }).collect(Collectors.toList());

    }

    public MovieSerieDto findByTitle(String title){

        MovieSerie movieSerieEntity = movieSerieRepository.findByTitle(title);

        return new MovieSerieDto(movieSerieEntity.getImage(),movieSerieEntity.getTitle(),movieSerieEntity.getDateOfCreation());
    }

    public List<MovieSerie> findByCategoryId(Long categoryId){

        return movieSerieRepository.getByCategoryId(categoryId);
    }











}
