CREATE TABLE registroPonto (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    funcionarioId UUID,
    FOREIGN KEY (funcionarioId) REFERENCES funcionario(id) ON DELETE CASCADE,
    data TIMESTAMP NOT NULL,
    horaEntrada TIME NOT NULL,
    horaSaida TIME NOT NULL,
    horasTrabalhadas NUMERIC(5,2) NOT NULL,
    observacao TEXT NOT NULL
);