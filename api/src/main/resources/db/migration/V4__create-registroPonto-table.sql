CREATE TABLE registro_ponto (
    id SERIAL PRIMARY KEY,
    funcionarioId INTEGER NOT NULL,
    FOREIGN KEY (funcionarioId) REFERENCES funcionario(id) ON DELETE CASCADE,
    data DATE NOT NULL,
    horaEntrada TIME NOT NULL,
    horaSaida TIME NOT NULL,
    horasTrabalhadas TIME NOT NULL,
    observacao TEXT NOT NULL
);