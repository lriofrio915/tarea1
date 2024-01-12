package com.luisriofrio.tareaapi.domain;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cuenta")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numero")
    @NotEmpty(message = "Clave es requerida")
    private String numero;

    @Column(name = "tipo")
    @NotNull(message = "TipoCuenta es requerido")
    @Enumerated(EnumType.STRING)
    private TipoCuenta tipo;

    @Column(name = "balance_inicial")
    @NotNull(message = "BalanceInicial es requerido")
    private BigDecimal balanceInicial;

    @Column(name = "saldo")
    @NotNull(message = "Saldo es requerido")
    private BigDecimal saldo;

    @Column(name = "estado")
    @NotNull(message = "Estado es requerido")
    private Boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "cuenta")
    private List<Movimiento> movimientos;

    private enum TipoCuenta {
        AHORRO, CORRIENTE
    }
}
