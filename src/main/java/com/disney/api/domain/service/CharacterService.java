package com.disney.api.domain.service;


import com.disney.api.domain.dto.CharacterDto;
import com.disney.api.persistence.entity.MovieSerie;
import com.disney.api.persistence.entity.Character;
import com.disney.api.persistence.entity.CharacterRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
@Builder
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;


    public Character save(Character character){

       return characterRepository.save(character);
    }


    public void deleteById(Long idCharacter){

        characterRepository.deleteById(idCharacter);

    }


    public List<CharacterDto> finAll(){

        List<Character> charactersEntity = characterRepository.finAll();

        return charactersEntity.stream().map(character ->
                {
                     return new CharacterDto(character.getImage(),character.getName());
                })
                .collect(Collectors.toList());

    }



    public List<CharacterDto> findByAge(Integer age) {

        List<Character> characterEntitity = characterRepository.findByAge(age);

        return characterEntitity.stream()
                .map(character -> {
                    return new CharacterDto(character.getImage(), character.getName());
                }).collect(Collectors.toList());
    }



    public CharacterDto findByName(String name) {
        Character characterEntity = characterRepository.findByName(name);

        return new CharacterDto(characterEntity.getImage(), characterEntity.getName());
    }



    public List<CharacterDto> findByIdMovieSerie(Long idMovieSerie) {

        List<Character> charactersEntity = characterRepository.getByIdMovieSerie(idMovieSerie);

        return charactersEntity.stream()
                .map(character -> {
                   return new CharacterDto(character.getImage(), character.getName());
                }).collect(Collectors.toList());
    }


}
