package com.luisriofrio.tareaapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cliente")
public class Cliente extends Persona {

    @Column(name = "Clave")
    private String clave;

    @Column(name = "Estado")
    private Boolean estado;

}
