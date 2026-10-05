CREATE TABLE usuario(
    id_usuario SERIAL PRIMARY KEY,
    nome TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    senha TEXT NOT NULL, 
    valor_medio DECIMAL(10, 2)
);

CREATE TABLE nota(
    id_nota SERIAL PRIMARY KEY,
    iden_usuario INT NOT NULL REFERENCES usuario(id_usuario) ON DELETE CASCADE,
    valor DECIMAL NOT NULL,
    data_mes DATE NOT NULL,
    tipo_despesa TEXT,
    eh_necessario BOOLEAN,
    descricao TEXT
);

CREATE TABLE comentario_mensal(
    id_resumo SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL REFERENCES usuario(id_usuario) ON DELETE CASCADE,
    mes TEXT NOT NULL,
    comentario TEXT,
    CONSTRAINT uniq_com_mes UNIQUE (id_usuario, mes)
);