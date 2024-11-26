CREATE TABLE registro_ponto (
    id SERIAL PRIMARY KEY,
    funcionarioId INTEGER NOT NULL,
    FOREIGN KEY (funcionarioId) REFERENCES funcionario(id) ON DELETE CASCADE,
    data DATE NOT NULL,
    hora_entrada TIME NOT NULL,
    hora_saida TIME NOT NULL,
    horas_trabalhadas TIME NOT NULL,
    observacao TEXT NOT NULL
);