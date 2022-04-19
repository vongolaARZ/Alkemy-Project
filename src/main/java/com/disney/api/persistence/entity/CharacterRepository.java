package com.disney.api.persistence.entity;


import com.disney.api.persistence.crud.CharacterCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class CharacterRepository {



    @Autowired
    CharacterCrudRepository characterCrudRepository;





    public Character save(Character character){

      return characterCrudRepository.save(character);

    }


    public void deleteById(Long idCharacter){

         characterCrudRepository.deleteById(idCharacter);

    }


    public List<Character> findAll(){

        return characterCrudRepository.findAll();

    }


    public Character findByName(String name) {

      return characterCrudRepository.findByName(name);
    }


    public List<Character> findByAge(Integer age) {
        return characterCrudRepository.findByAge(age);
    }


    public List<Character> findByMovieSerie(MovieSerie movieSerie) {
        return characterCrudRepository.findByMovieSerie(movieSerie);
    }
}
