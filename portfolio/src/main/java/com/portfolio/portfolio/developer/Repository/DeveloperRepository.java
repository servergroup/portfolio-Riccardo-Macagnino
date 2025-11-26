package com.portfolio.portfolio.developer.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.portfolio.portfolio.developer.Entity.EntityProject;

public interface DeveloperRepository extends CrudRepository<EntityProject, Integer> {

    @Query("SELECT MAX(d.id) FROM EntityProject d")
    Integer findMaxId();
}
