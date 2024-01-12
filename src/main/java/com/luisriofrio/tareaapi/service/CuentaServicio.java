package com.luisriofrio.tareaapi.service;

import java.util.List;

import com.luisriofrio.tareaapi.domain.Cuenta;

public interface CuentaServicio {
    List<Cuenta> obtenerTodos();

    Cuenta guardar(Cuenta cuenta);

    Cuenta editar(Cuenta cuenta);

    Cuenta obtenerPorId(Long id);
}
