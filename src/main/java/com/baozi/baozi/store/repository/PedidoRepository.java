package com.baozi.baozi.store.repository;

import com.baozi.baozi.store.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
