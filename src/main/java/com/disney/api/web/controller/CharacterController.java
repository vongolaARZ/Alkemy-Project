package com.disney.api.web.controller;


import com.disney.api.domain.dto.CharacterDto;
import com.disney.api.domain.service.CharacterService;
import com.disney.api.persistence.entity.Character;

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
    private CharacterService characterService;




    @PostMapping("/save")
    public ResponseEntity<Character> save(@RequestBody Character character){

        return new ResponseEntity<>(characterService.save(character),HttpStatus.CREATED);

    }

    @GetMapping("/")
    public ResponseEntity<List<CharacterDto>> findAll(){

        return new ResponseEntity<>(characterService.finAll(),HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){

        characterService.deleteById(id);


    }

    @GetMapping("/age/{age}")
    public ResponseEntity<List<CharacterDto>> findByAge(@PathVariable("age") Integer age){

        return new ResponseEntity<>(characterService.findByAge(age),HttpStatus.OK);

    }


    @GetMapping("/name/{name}")
    public ResponseEntity<CharacterDto> findByName(@PathVariable("name") String name){

        return new ResponseEntity<>(characterService.findByName(name),HttpStatus.OK);


    }




    @GetMapping("/{movieSerie}")
    ResponseEntity<List<CharacterDto>> findByMovieSerie(@PathVariable("idMovieSerie")Long idMovieSerie){

        return new ResponseEntity<>(characterService.findByIdMovieSerie(idMovieSerie),HttpStatus.OK);
    }





















}
