-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE contato (
idcontato serial PRIMARY KEY,
nome VARCHAR(50),
email VARCHAR(100)
)

CREATE TABLE compromisso (
idcompromisso serial PRIMARY KEY,
local VARCHAR(100),
data DATE,
hora TIME
)

CREATE TABLE contato_compromisso (
idcontato INTEGER,
idcompromisso INTEGER,
FOREIGN KEY(idcontato) REFERENCES contato (idcontato),
FOREIGN KEY(idcompromisso) REFERENCES compromisso (idcompromisso)
)

