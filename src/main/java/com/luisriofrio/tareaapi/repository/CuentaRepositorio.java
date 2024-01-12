package com.luisriofrio.tareaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisriofrio.tareaapi.domain.Cuenta;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Long> {

}
