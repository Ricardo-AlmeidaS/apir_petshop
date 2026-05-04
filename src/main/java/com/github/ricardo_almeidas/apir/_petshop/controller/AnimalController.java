package com.github.ricardo_almeidas.apir._petshop.controller;

import com.github.ricardo_almeidas.apir._petshop.model.Animal;
import com.github.ricardo_almeidas.apir._petshop.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop")
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalRepository animalRepository;

    @PostMapping
    public ResponseEntity<Animal> cachorro(@RequestBody Animal animal) {
        return ResponseEntity.status(HttpStatus.OK).body(animalRepository.save(animal));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> findById(@PathVariable Long id) {
        return animalRepository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        return ResponseEntity.ok(animalRepository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> update(@PathVariable Long id,
                                          @RequestBody Animal animal) {

        Optional<Animal> optAnimal = animalRepository.findById(id);

        if (optAnimal.isPresent()) {
            animal.setId(id);
            Animal animalAlterado = animalRepository.save(animal);
            return ResponseEntity.ok(animalAlterado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        animalRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }
}
