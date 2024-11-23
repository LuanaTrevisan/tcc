CREATE TABLE produto (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    quantidade INTEGER NOT NULL,
    precoUnitario NUMERIC(10,2) NOT NULL
);