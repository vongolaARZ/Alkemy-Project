package com.disney.api.web.controller;


import com.disney.api.domain.dto.MovieSerieDto;
import com.disney.api.domain.service.MovieSerieService;
import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieSerieController {

    @Autowired
    private MovieSerieService movieSerieService;





    @PostMapping("/save")
    public ResponseEntity<MovieSerie> save(@RequestBody MovieSerie movieSerie){

        return new ResponseEntity<>(movieSerieService.save(movieSerie),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{movieSerie}")
    public void delete(@PathVariable("movieSerie") MovieSerie movieSerie){

        movieSerieService.delete(movieSerie);
    }

    @GetMapping("")
    public ResponseEntity<List<MovieSerieDto>> findAll(){

        return new ResponseEntity<>(movieSerieService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<MovieSerieDto> findByTitle(@PathVariable String name){

        return new ResponseEntity<>(movieSerieService.findByTitle(name), HttpStatus.OK);
    }

    @GetMapping("/genero/{categoryId}")
    public ResponseEntity<List<MovieSerie>> findByCategoryId(@PathVariable Long categoryId){

        return new ResponseEntity<>(movieSerieService.findByCategoryId(categoryId),HttpStatus.OK);
    }














}
