package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface MovieSerieCrudRepository extends JpaRepository<MovieSerie,Long> {


    MovieSerie save(MovieSerie movieSerie);
    MovieSerie findByTitle(String title);









}
