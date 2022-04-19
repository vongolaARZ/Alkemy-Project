package com.disney.api.controller;


import com.disney.api.persistence.entity.Character;
import com.disney.api.persistence.entity.CharacterRepository;
import com.disney.api.persistence.entity.MovieSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;


    @GetMapping("/all")
    public ResponseEntity<List<Character>> findAll(){

        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);

    }


    @GetMapping("/{name}")
    public ResponseEntity<Character> findByName(@PathVariable("name") String name){

        return new ResponseEntity<>(characterRepository.findByName(name),HttpStatus.OK);


    }


    @GetMapping("/{age}")
    public ResponseEntity<List<Character>> findByAge(@PathVariable("age") Integer age){

        return new ResponseEntity<>(characterRepository.findByAge(age),HttpStatus.OK);

    }

    @GetMapping("/{movieSerie}")
    ResponseEntity<List<Character>> findByMovieSerie(@PathVariable("movieSerie")MovieSerie movieSerie){

        return new ResponseEntity<>(characterRepository.findByMovieSerie(movieSerie),HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Character> save(@RequestBody Character character){

        return new ResponseEntity<>(characterRepository.save(character),HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){

       characterRepository.deleteById(id);


    }


















}
