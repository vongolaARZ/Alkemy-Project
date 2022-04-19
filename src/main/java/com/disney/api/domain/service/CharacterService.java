package com.disney.api.domain.service;


import com.disney.api.persistence.entity.MovieSerie;
import com.disney.api.persistence.entity.Character;
import com.disney.api.persistence.entity.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;


    public Character save(Character character){

       return characterRepository.save(character);

    }


    public void deleteById(Long idCharacter){

       characterRepository.deleteById(idCharacter);

    }


    public List<Character> findAll(){

        return characterRepository.findAll();

    }


    public Character findByName(String name) {

        return characterRepository.findByName(name);
    }


    public List<Character> findByAge(Integer age) {
        return characterRepository.findByAge(age);
    }


    public List<Character> findByMovieSerie(MovieSerie movieSerie) {
        return characterRepository.findByMovieSerie(movieSerie);
    }


}
