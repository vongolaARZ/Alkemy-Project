package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.PeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeliculaSerieCrudRepository extends JpaRepository<PeliculaSerie,Long> {

    PeliculaSerie findByTitulo(String titulo);
    List<PeliculaSerie> findByGenero(String genero);






}
