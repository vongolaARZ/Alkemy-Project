package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryCrudRepository extends JpaRepository<Category,Long> {

    Optional<Category> findById(Long id);
    Category save(Category category);




}
