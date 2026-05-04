package com.github.ricardo_almeidas.apir._petshop.repository;

import com.github.ricardo_almeidas.apir._petshop.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
