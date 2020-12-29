package com.example.demo.controller;

import com.example.demo.model.Dog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/domain/v1/dog")
public class DogController {
    @GetMapping
    public Dog getDog() throws Exception {

        throw new Exception("Something broke");

/*        return new Dog().setAge(1)
                .setName("Doggy McDoggerson");*/
    }

    @PostMapping
    public Dog createDog(@RequestBody Dog dog) {

        // service.saveDog(dog);
        return dog;
    }

    @PutMapping
    public Dog updateDog(@RequestBody Dog dog) {

        // service.updateDog(dog);
        return dog;
    }

    @DeleteMapping
    public ResponseEntity updateDog(@PathVariable UUID uuid) {

        // service.deleteDog(dog);
        return ResponseEntity.noContent().build();
    }
}
