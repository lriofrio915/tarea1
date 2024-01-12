package com.luisriofrio.tareaapi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Entity(name = "movimiento")

public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "Fecha")
    private LocalDate fecha;

    @Column(name = "Tipo_de_Movimiento")
    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    @Column(name = "Monto")
    private BigDecimal monto;

    @Column(name = "Balance")
    private BigDecimal balance;

    public enum TipoMovimiento {
        DEBITO, CREDITO
    }
}
