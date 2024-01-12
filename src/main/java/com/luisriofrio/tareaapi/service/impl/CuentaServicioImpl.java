package com.luisriofrio.tareaapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luisriofrio.tareaapi.domain.Cuenta;
import com.luisriofrio.tareaapi.repository.CuentaRepositorio;
import com.luisriofrio.tareaapi.service.CuentaServicio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CuentaServicioImpl implements CuentaServicio {

    private final CuentaRepositorio cuentaRepositorio;

    @Override
    public List<Cuenta> obtenerTodos() {
        return cuentaRepositorio.findAll();
    }

    @Override
    public Cuenta guardar(Cuenta cuenta) {
        return cuentaRepositorio.save(cuenta);
    }

    @Override
    public Cuenta editar(Cuenta cuenta) {
        return cuentaRepositorio.save(cuenta);
    }

    public Cuenta obtenerPorId(Long id) {
        return cuentaRepositorio.findById(id).orElse(null);
    }

}
