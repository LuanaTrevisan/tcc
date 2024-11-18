CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE funcionario(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    dataAdmissao TIMESTAMP NOT NULL,
    status BOOLEAN NOT NULL
    );