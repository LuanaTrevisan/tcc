CREATE TABLE login(

    usuario VARCHAR(11) PRIMARY KEY,
    FOREIGN KEY (usuario) REFERENCES funcionario(cpf) ON DELETE CASCADE,
    senha VARCHAR(100) NOT NULL

);