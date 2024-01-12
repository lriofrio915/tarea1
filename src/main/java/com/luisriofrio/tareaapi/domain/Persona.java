package com.luisriofrio.tareaapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "Identificación", nullable = false)
    private String identificacion;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Dirección")
    private String direccion;

    @Column(name = "Teléfono")
    private String telefono;

    @Column(name = "Edad")
    private Integer edad;
}
