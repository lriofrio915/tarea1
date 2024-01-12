package com.luisriofrio.tareaapi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
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

    @Column(name = "fecha")
    @NotNull(message = "Fecha es requerida")
    private LocalDate fecha;

    @Column(name = "tipo ")
    @NotNull(message = "Tipo es requerido")
    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    @Column(name = "monto")
    @NotNull(message = "Monto es requerido")
    private BigDecimal monto;

    @Column(name = "balance")
    @NotNull(message = "Balance es requerido")
    private BigDecimal balance;

    @NotNull(message = "Cuenta es requerido")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cuenta cuenta;

    public enum TipoMovimiento {
        DEBITO, CREDITO
    }
}
