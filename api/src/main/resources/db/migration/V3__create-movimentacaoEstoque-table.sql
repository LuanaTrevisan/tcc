CREATE TABLE movimentacaoEstoque (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    produtoId UUID,
    FOREIGN KEY (produtoId) REFERENCES produto(id) ON DELETE CASCADE,
    tipoMovimentacao VARCHAR(20) NOT NULL,
    quantidade INTEGER NOT NULL,
    dataMovimentacao TIMESTAMP NOT NULL,
    observacao TEXT NOT NULL
);