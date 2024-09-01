package com.Transaccion.repository;

import com.Transaccion.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {

    Optional<Clientes> findByCustomerNameContainingIgnoreCase(String nombre);
}