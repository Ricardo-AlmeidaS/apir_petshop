CREATE TABLE animais IF NOT EXISTS (
    id BIGINT NOT NULL,
    especie VARCHAR(255) NOT NULL,
    cor VARCHAR(100),
    som VARCHAR(255) NOT NULL,
    idade INT,
    PRIMARY KEY (id)
);