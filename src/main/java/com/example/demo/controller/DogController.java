package com.example.demo.controller;

import com.example.demo.entity.DogEntity;
import com.example.demo.model.Dog;
import com.example.demo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/domain/v1/dog")
public class DogController {
    @Autowired
    DogRepository dogRepository;

    @GetMapping()
    public DogEntity getDog(@RequestParam Integer id) throws Exception {



        return dogRepository.findById(id).get();
    }

    @PostMapping
    public DogEntity createDog(@RequestBody Dog dog) {

        return dogRepository.save(new DogEntity()
                        .setName(dog.getName())
                        .setAge(dog.getAge()));
    }

    @PutMapping
    public DogEntity updateDog(@RequestBody Dog dog) {

        DogEntity dogEntity = dogRepository.findByName(dog.getName());
        dogEntity.setAge(dog.getAge());

        return dogRepository.save(dogEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteDog(@PathVariable Integer id) {

        dogRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
