package com.disney.api.persistence.entity;


import com.disney.api.persistence.crud.PersonajeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class PersonajeRepository {



    @Autowired
    PersonajeCrudRepository personajeCrudRepository;


    public void save(Personaje personaje){

        personajeCrudRepository.save(personaje);

    }

    public void deleteById(Long idPersonaje){

        personajeCrudRepository.deleteById(idPersonaje);

    }

    public List<Personaje> findAll(){

        return personajeCrudRepository.findAll();

    }

    public Personaje findByNombre(String nombre){

        return (Personaje) personajeCrudRepository.findByNombre(nombre);

}

    public List<Personaje> findByEdad (Integer edad){

        return personajeCrudRepository.findByEdad(edad);

}

    public List<Personaje> findByPeliculaSerie(String peliculaSerie){

        return personajeCrudRepository.findByPeliculaSerie(peliculaSerie);

}





}
