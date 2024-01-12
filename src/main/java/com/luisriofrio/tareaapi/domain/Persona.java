package com.luisriofrio.tareaapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "identificacion", nullable = false)
    @NotEmpty(message = "Identificación es requerida")
    private String identificacion;

    @Column(name = "nombre")
    @NotEmpty(message = "Nombre es requerido")
    private String nombre;

    @Column(name = "genero")
    @NotEmpty(message = "Género es requerido")
    private String genero;

    @Column(name = "direccion")
    @NotEmpty(message = "Dirección es requerido")
    private String direccion;

    @Column(name = "telefono")
    @NotEmpty(message = "Teléfono es requerido")
    private String telefono;

    @Column(name = "edad")
    @NotNull(message = "Edad es requerida")
    private Integer edad;
}
