package com.example.demo.repository;

import com.example.demo.entity.DogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<DogEntity, Integer> {

    DogEntity findByName(String name);
}
