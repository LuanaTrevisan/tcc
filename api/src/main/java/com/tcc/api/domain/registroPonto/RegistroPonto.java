package com.tcc.api.domain.registroPonto;

import com.tcc.api.domain.funcionario.Funcionario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

@Table(name = "registro_ponto")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RegistroPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usado para mapeamento de SERIAL
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "funcionarioid")
    private Funcionario funcionario;

    @Column(name = "data")
    private Date data;

    @Column(name = "horaentrada")
    private LocalTime horaEntrada;

    @Column(name = "horasaida")
    private LocalTime horaSaida;

    @Column(name = "horastrabalhadas")
    private LocalTime horasTrabalhadas;

    @Column(name = "observacao")
    private String observacao;


}
