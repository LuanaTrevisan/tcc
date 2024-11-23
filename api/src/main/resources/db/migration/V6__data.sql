-- Inserção de Dados

-- Inserção de Funcionários
INSERT INTO funcionario (id, nome, cpf, cargo, dataAdmissao)
VALUES
(1, 'Administrador', '67890123456', 'Administrador do Sistema', '2018-01-01'),
(2, 'João Silva', '12345678901', 'Analista de TI', '2020-02-01'),
(3, 'Maria Oliveira', '23456789012', 'Assistente Administrativo', '2021-06-15'),
(4, 'Carlos Souza', '34567890123', 'Gerente de Vendas', '2019-03-20'),
(5, 'Ana Paula', '45678901234', 'Especialista em Marketing', '2022-05-10'),
(6, 'Bruno Almeida', '56789012345', 'Analista Financeiro', '2023-01-15');

-- Inserção de Produtos
INSERT INTO produto (id, nome, descricao, quantidade, precoUnitario)
VALUES
(1, 'Notebook Dell', 'Notebook com 16GB de RAM e 512GB de SSD', 10, 3500.00),
(2, 'Mouse Logitech', 'Mouse sem fio', 50, 100.00),
(3, 'Teclado Mecânico', 'Teclado RGB com switches Cherry', 30, 450.00),
(4, 'Monitor Samsung', 'Monitor Full HD 24 polegadas', 20, 800.00),
(5, 'Cadeira Gamer', 'Cadeira ergonômica com ajustes completos', 15, 1200.00),
(6, 'HD Externo Seagate', 'HD externo de 2TB', 25, 400.00);

-- Inserção de Movimentações de Estoque
INSERT INTO movimentacao_estoque (produtoId, tipoMovimentacao, quantidade, dataMovimentacao, observacao)
VALUES
(3, 'entrada', 30, '2024-03-05', 'Compra de teclados mecânicos'),
(5, 'entrada', 10, '2024-05-20', 'Compra de cadeiras gamers'),
(2, 'saida', 5, '2024-02-10', 'Venda de mouses'),
(6, 'saida', 8, '2024-06-01', 'Venda de HDs externos'),
(1, 'saida', 3, '2024-07-15', 'Venda de notebooks'),
(4, 'entrada', 5, '2024-10-25', 'Reposição de monitores'),
(6, 'entrada', 10, '2024-11-15', 'Compra de HDs externos adicionais'),
(2, 'entrada', 20, '2024-08-20', 'Reposição de mouses'),
(3, 'saida', 10, '2024-09-10', 'Venda de teclados mecânicos'),
(4, 'saida', 2, '2024-04-12', 'Venda de monitores'),
(5, 'saida', 4, '2024-11-05', 'Venda de cadeiras gamers'),
(6, 'entrada', 15, '2024-11-12', 'Reposição de HDs externos'),
(1, 'entrada', 8, '2024-11-16', 'Compra de notebooks'),
(3, 'saida', 5, '2024-11-17', 'Venda de teclados mecânicos'),
(4, 'entrada', 7, '2024-11-18', 'Compra de monitores'),
(2, 'saida', 4, '2024-11-19', 'Venda de mouses'),
(5, 'entrada', 10, '2024-11-20', 'Reposição de cadeiras gamers');

-- Inserção de Registros de Ponto
INSERT INTO registro_ponto (funcionarioid, data, horaentrada, horasaida, horastrabalhadas, observacao)
VALUES
(2, '2024-11-01', '08:00:00', '17:00:00', '08:00:00', 'Trabalho diário'),
(6, '2024-11-02', '09:00:00', '18:00:00', '08:00:00', 'Trabalho financeiro'),
(5, '2024-11-03', '08:15:00', '17:15:00', '08:00:00', 'Trabalho de marketing'),
(1, '2024-11-04', '00:00:00', '23:59:59', '23:59:00', 'Administrador em turno integral'),
(3, '2024-11-05', '08:30:00', '17:30:00', '08:00:00', 'Trabalho diário'),
(4, '2024-11-06', '07:00:00', '16:00:00', '08:00:00', 'Trabalho em vendas'),
(6, '2024-11-07', '08:00:00', '17:00:00', '08:00:00', 'Trabalho financeiro'),
(2, '2024-11-08', '09:00:00', '18:00:00', '08:00:00', 'Trabalho diário'),
(5, '2024-11-09', '08:30:00', '17:30:00', '08:00:00', 'Trabalho em marketing'),
(4, '2024-11-10', '07:30:00', '16:30:00', '08:00:00', 'Trabalho em vendas'),
(1, '2024-11-11', '00:00:00', '23:59:59', '23:59:00', 'Administrador em turno integral'),
(3, '2024-11-12', '08:00:00', '17:00:00', '08:00:00', 'Trabalho diário'),
(2, '2024-11-13', '08:00:00', '17:00:00', '08:00:00', 'Trabalho em TI'),
(4, '2024-11-14', '08:00:00', '17:00:00', '08:00:00', 'Gerente de vendas'),
(5, '2024-11-15', '08:15:00', '17:15:00', '08:00:00', 'Marketing');

-- Inserção de Dados na Tabela Login
INSERT INTO login (usuario, senha)
VALUES
('67890123456', 'admin@123'),  -- Administrador (usuário administrador)
('12345678901', 'senha123'),   -- João Silva
('23456789012', 'senha234'),   -- Maria Oliveira
('34567890123', 'senha345'),   -- Carlos Souza
('45678901234', 'senha456'),   -- Ana Paula
('56789012345', 'senha567');   -- Bruno Almeida
