package com.luisriofrio.tareaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisriofrio.tareaapi.domain.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
