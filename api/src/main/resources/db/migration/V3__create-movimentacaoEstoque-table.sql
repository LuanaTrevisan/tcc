CREATE TABLE movimentacao_estoque (
    id SERIAL PRIMARY KEY,
    produto_id INTEGER NOT NULL,
    FOREIGN KEY (produto_id) REFERENCES produto(id) ON DELETE CASCADE,
    tipo_movimentacao VARCHAR(20) NOT NULL,
    quantidade INTEGER NOT NULL,
    data_movimentacao DATE NOT NULL,
    observacao TEXT NOT NULL
);