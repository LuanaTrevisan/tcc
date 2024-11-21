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

@Table(name = "registroPonto")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RegistroPonto {

    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "funcionarioId")
    private Funcionario funcionario;
    private Date data;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private LocalTime horasTrabalhadas;
    private String  observacao;

}
