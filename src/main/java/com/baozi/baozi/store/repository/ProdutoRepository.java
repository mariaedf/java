package com.baozi.baozi.store.repository;

import com.baozi.baozi.store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
