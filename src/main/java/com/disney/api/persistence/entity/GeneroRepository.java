package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.GeneroCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GeneroRepository {

    @Autowired
    private GeneroCrudRepository generoCrudRepository;

    public void save (Genero genero){

        generoCrudRepository.save(genero);

    }



}
