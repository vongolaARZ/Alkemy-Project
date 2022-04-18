package com.disney.api.persistence.entity;

import com.disney.api.persistence.crud.PeliculaSerieCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeliculaSerieRepository {


    @Autowired
    private PeliculaSerieCrudRepository peliculaSerieCrudRepository;

    public void save(PeliculaSerie peliculaSerie){

        peliculaSerieCrudRepository.save(peliculaSerie);

    }

    public void delete(Long idPeliculaSerie){

        peliculaSerieCrudRepository.deleteById(idPeliculaSerie);
    }

    public PeliculaSerie findByTitulo(String titulo){

        return peliculaSerieCrudRepository.findByTitulo(titulo);

    }

    public List<PeliculaSerie> findByGenero(String genero){

        return peliculaSerieCrudRepository.findByGenero(genero);

    }



}
