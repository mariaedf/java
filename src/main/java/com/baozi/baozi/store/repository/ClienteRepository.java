package com.baozi.baozi.store.repository;

import com.baozi.baozi.store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
