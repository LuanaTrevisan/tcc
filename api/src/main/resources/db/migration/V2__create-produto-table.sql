CREATE TABLE produto (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT NOT NULL,
    quantidade INTEGER NOT NULL,
    precoUnitario NUMERIC(10,2) NOT NULL
);