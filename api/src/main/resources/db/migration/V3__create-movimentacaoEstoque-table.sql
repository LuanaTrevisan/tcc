CREATE TABLE movimentacao_estoque (
    id SERIAL PRIMARY KEY,
    produtoId INTEGER NOT NULL,
    FOREIGN KEY (produtoId) REFERENCES produto(id) ON DELETE CASCADE,
    tipoMovimentacao VARCHAR(20) NOT NULL,
    quantidade INTEGER NOT NULL,
    dataMovimentacao DATE NOT NULL,
    observacao TEXT NOT NULL
);