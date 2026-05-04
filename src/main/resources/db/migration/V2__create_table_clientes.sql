CREATE TABLE clientes IF NOT EXISTS (
    id BIGINT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    nome_animal VARCHAR(255),
    endereco VARCHAR(255),
    logradouro VARCHAR(255),
    PRIMARY KEY (id)
);