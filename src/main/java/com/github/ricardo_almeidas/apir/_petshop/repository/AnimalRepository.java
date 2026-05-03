package com.github.ricardo_almeidas.apir._petshop.repository;

import com.github.ricardo_almeidas.apir._petshop.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
