CREATE TABLE login(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL,
    senha VARCHAR(100) NOT NULL
    );