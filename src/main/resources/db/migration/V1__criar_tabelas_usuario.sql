CREATE TABLE usuario (
                         id BIGSERIAL PRIMARY KEY,
                         primeiro_nome VARCHAR(255) NOT NULL,
                         ultimo_nome VARCHAR(255) NOT NULL,
                         cpf VARCHAR (50) NOT NULL UNIQUE,
                         data_nascimento DATE NOT NULL,
                         telefone VARCHAR(50) NOT NULL UNIQUE,
                         numero_passaporte VARCHAR (50),
                         email VARCHAR(255) NOT NULL UNIQUE,
                         senha VARCHAR(255) NOT NULL,
                         ativo BOOLEAN NOT NULL DEFAULT TRUE,

                         cep VARCHAR(8) NOT NULL,
                         logradouro VARCHAR(150) NOT NULL ,
                         numero VARCHAR(20),
                         bairro VARCHAR(100) NOT NULL,
                         cidade VARCHAR(100) NOT NULL,
                         estado VARCHAR(2) NOT NULL,
                         complemento VARCHAR(150)

);
