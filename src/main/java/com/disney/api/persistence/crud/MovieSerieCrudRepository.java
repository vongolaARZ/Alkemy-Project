package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.Category;
import com.disney.api.persistence.entity.MovieSerie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieSerieCrudRepository extends JpaRepository<MovieSerie,Long> {

    MovieSerie findByTitle(String title);
    List<MovieSerie> findByCategory(Category category);
    List<MovieSerie> findByTitleOrderByTitleAsc();
    List<MovieSerie> findByDateorderByDateDesc();
    MovieSerie save(MovieSerie movieSerie);






}
