package com.disney.api.persistence.crud;

import com.disney.api.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryCrudRepository extends JpaRepository<Category,Long> {




}
