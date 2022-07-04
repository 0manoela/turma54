CREATE DATABASE db_rhgeneration;

USE db_rhgeneration;

CREATE TABLE tb_funcionarios(
ID INT AUTO_INCREMENT PRIMARY KEY,
NOME VARCHAR(255),
CPF VARCHAR(255),
ENDERECO VARCHAR(255),
FUNCAO VARCHAR(255),
SALARIO DECIMAL(9,2),
DATAINGRESSO DATE

);

INSERT INTO tb_funcionarios (NOME, CPF, ENDERECO, FUNCAO,SALARIO, DATAINGRESSO) VALUES ('VITÃO', '100.100.200.30','RUA PIT BULLNº 900', 'ESTAGIÁRIO', 1700.00, '2022-05-20');

SELECT * FROM tb_funcionarios WHERE SALARIO > 2000;
select * from tb_funcionarios where salario <2000;

update tb_funcionarios 
set salario = 2900.00
where id = 4;tb_funcionarios;