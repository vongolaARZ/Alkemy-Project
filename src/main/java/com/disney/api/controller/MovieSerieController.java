package com.disney.api.controller;


import com.disney.api.domain.service.MovieSerieService;
import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieSerieController {

    @Autowired
    private MovieSerieService movieSerieService;


    @GetMapping("/name/{name}")
    public ResponseEntity<MovieSerie> findByTitle(@PathVariable String title){

        return new ResponseEntity<>(movieSerieService.findByTitle(title), HttpStatus.OK);
    }

    @GetMapping("/genero/{category}")
    public ResponseEntity<List<MovieSerie>> findByCategory(@PathVariable Category category){

        return new ResponseEntity<>(movieSerieService.findByCategory(category),HttpStatus.OK);
    }

    @GetMapping("/order")
    public ResponseEntity<List<MovieSerie>> orderDesc(){

        return new ResponseEntity<>(movieSerieService.orderByDateDesc(),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MovieSerie>> findAll(){

        return new ResponseEntity<>(movieSerieService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MovieSerie> save(@RequestBody MovieSerie movieSerie){

        return new ResponseEntity<>(movieSerieService.save(movieSerie),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{movieSerie}")
    public void delete(@PathVariable("movieSerie") MovieSerie movieSerie){

        movieSerieService.delete(movieSerie);
    }


}
