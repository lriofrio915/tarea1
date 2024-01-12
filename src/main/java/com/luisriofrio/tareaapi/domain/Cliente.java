package com.luisriofrio.tareaapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cliente")

public class Cliente extends Persona {

    @Column(name = "clave")
    @NotEmpty(message = "Clave es requerida")
    private String clave;
    @Size(min = 4, message = "Clave debe contener al menos 4.")

    @Column(name = "estado")
    @NotNull(message = "Estado es requerido")
    private Boolean estado;

    // @OneToMany(mappedBy = "cliente")
    // private List<Cuenta> cuentas;

}
