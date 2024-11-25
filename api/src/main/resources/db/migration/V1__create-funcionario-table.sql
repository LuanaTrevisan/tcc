CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE funcionario(
    id SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    cargo TEXT NOT NULL,
    data_admissao DATE NOT NULL
    );