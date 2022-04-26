package com.disney.api.persistence.entity;


import com.disney.api.persistence.crud.CharacterCrudRepository;
import com.disney.api.persistence.crud.MovieSerieCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public class CharacterRepository {



    @Autowired
    CharacterCrudRepository characterCrudRepository;
    @Autowired
    MovieSerieCrudRepository movieSerieCrudRepository;




    public Character save(Character character){

      return characterCrudRepository.save(character);
    }



    public void deleteById(Long idCharacter){

        characterCrudRepository.deleteById(idCharacter);
    }


    public List<Character> finAll(){
        return characterCrudRepository.findAll();
    }


    public List<Character> findByAge(Integer age) {

        return characterCrudRepository.findByAge(age);
    }


    public List<Character> getByIdMovieSerie(Long idMovieSerie) {

        MovieSerie movieSeries= movieSerieCrudRepository.findById(idMovieSerie).orElse( new MovieSerie());

        return movieSeries.getCharacters();
    }


    public Character findByName(String name) {

        return characterCrudRepository.findByName(name);
    }






}
