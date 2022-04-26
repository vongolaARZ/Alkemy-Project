package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.MovieSerie;
import com.disney.api.persistence.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterCrudRepository extends JpaRepository<Character, Long> {


    Character findByName(String name);
    List<Character> findByAge(Integer age);
    Character save(Character character);






}
