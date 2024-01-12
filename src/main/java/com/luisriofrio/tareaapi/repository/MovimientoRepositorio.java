package com.luisriofrio.tareaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisriofrio.tareaapi.domain.Movimiento;

@Repository
public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {

}
