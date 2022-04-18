package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonajeCrudRepository extends JpaRepository<Personaje, Long> {

    Personaje findByNombre(String nombre);
    List<Personaje> findByEdad(Integer edad);
    List<Personaje> findByPeliculaSerie(String nombre);





}
