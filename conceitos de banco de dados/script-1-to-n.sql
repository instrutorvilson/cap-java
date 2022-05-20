-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE contato (
idcontato INTEGER PRIMARY KEY,
nome VARCHAR(50),
email VARCHAR(100)
)

CREATE TABLE compromisso (
idcompromisso INTEGER PRIMARY KEY,
local VARCHAR(100),
data DATE,
hora TIME,
idcontato INTEGER,
FOREIGN KEY(idcontato) REFERENCES contato (idcontato)
)

