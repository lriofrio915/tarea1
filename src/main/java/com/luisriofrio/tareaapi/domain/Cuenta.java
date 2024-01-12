package com.luisriofrio.tareaapi.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "Número")
    private String numero;

    @Column(name = "Tipo_de_Cuenta")
    @Enumerated(EnumType.STRING)
    private TipoCuenta tipo;

    @Column(name = "Balance_Inicial")
    private BigDecimal balanceInicial;

    @Column(name = "Saldo")
    private BigDecimal saldo;

    @Column(name = "Estado")
    private Boolean estado;

    private enum TipoCuenta {
        AHORRO, CORRIENTE
    }
}
