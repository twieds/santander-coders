-- Lista de Exercícios 

-- 1.	Visualizar os databases existentes:
SHOW DATABASES;

-- 2.	Criar um database chamado "sistema":
CREATE DATABASE sistema;

-- 3.	Visualizar novamente os databases existentes e definir como padrão o database "sistema":
SHOW DATABASES;
USE sistema;

-- 4.	Definir o mecanismo padrão como InnoDB (transacional). Este comando funciona somente no MySQL.
SET default_storage_engine= InnoDB;

-- 5.	Definir o mecanismo padrão para aceitar acentuação na inclusão de dados. Isso deve ser feito antes da entrada de dados. Os dados que já foram armazenados não mostrará acentuação.
SET NAMES utf8mb4;

-- 6.	Criar a tabela "departamento", conforme especificado no diagrama:
CREATE TABLE departamento (
  id_departamento INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  telefone CHAR(15) NULL,
  PRIMARY KEY (id_departamento)
 );

-- 7.	Visualizar a estrutura da tabela "departamento":
SHOW COLUMNS FROM departamento;

/*
+-----------------+--------------+------+-----+---------+----------------+
| Field           | Type         | Null | Key | Default | Extra          |
+-----------------+--------------+------+-----+---------+----------------+
| id_departamento | int          | NO   | PRI | NULL    | auto_increment |
| nome            | varchar(100) | NO   |     | NULL    |                |
| telefone        | char(15)     | YES  |     | NULL    |                |
+-----------------+--------------+------+-----+---------+----------------+
*/

-- 8.	Criar a tabela "funcionario", conforme especificado no diagrama (observe a chave estrangeira - Foreign Key):
CREATE TABLE funcionario (
    id_funcionario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    id_departamento INT NOT NULL,
    data_cadastro DATE NOT NULL,

    PRIMARY KEY (id_funcionario),
    FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento)
);

-- 9.	Deletar a tabela funcionário.
DROP TABLE funcionario;

-- 10.	Criar a tabela "funcionario", conforme especificado no diagrama (sem a chave estrangeira - Foreign Key):
CREATE TABLE funcionario (
    id_funcionario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    id_departamento INT NOT NULL,
    data_cadastro DATE NOT NULL,

    PRIMARY KEY (id_funcionario)
);

-- 11.	Alterar a tabela criada anteriormente para adicionar a chave estrangeira (para quando se esquece da chave estrangeira).
ALTER TABLE funcionario
ADD FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento);

-- 12.	Inserindo registros na tabela "departamento" (sem especificação dos campos):
INSERT INTO departamento VALUES (NULL, 'RH', '(11) 1234-6789');

-- 13.	Inserindo registro na tabela "departamento" (com especificação dos campos):
INSERT INTO departamento VALUES (NULL, 'RH', '(11) 1234-6789');

-- 14.	Inserir mais 5 registros na tabela “departamento”
INSERT INTO departamento (nome, telefone) VALUES ('Financeiro', '(11) 1234-1234');

-- 15.	Visualizar todos os dados da tabela "departamento":
SELECT * FROM departamento;

/*
+-----------------+---------------------+----------------+
| id_departamento | nome                | telefone       |
+-----------------+---------------------+----------------+
|               3 | RH                  | (11) 1234-6789 |
|               4 | Financeiro          | (11) 1234-1234 |
|               5 | Contábil            | NULL           |
|               6 | Suporte de Software | NULL           |
|               7 | Vendas              | (11) 4321-1234 |
|               8 | Desenvolvimento     | NULL           |
+-----------------+---------------------+----------------+
*/

-- 16.	Visualizar todos os campos e todos os atributos da tabela "departamento" em ordem alfabética de nome:
SELECT * FROM departamento ORDER BY nome ASC;

/*
+-----------------+---------------------+----------------+
| id_departamento | nome                | telefone       |
+-----------------+---------------------+----------------+
|               5 | Contábil            | NULL           |
|               8 | Desenvolvimento     | NULL           |
|               4 | Financeiro          | (11) 1234-1234 |
|               3 | RH                  | (11) 1234-6789 |
|               6 | Suporte de Software | NULL           |
|               7 | Vendas              | (11) 4321-1234 |
+-----------------+---------------------+----------------+
*/

-- 17.	Visualizar os dados da tabela "departamento" em ordem decrescente de nome:
SELECT * FROM departamento ORDER BY nome DESC;

/*
+-----------------+---------------------+----------------+
| id_departamento | nome                | telefone       |
+-----------------+---------------------+----------------+
|               7 | Vendas              | (11) 4321-1234 |
|               6 | Suporte de Software | NULL           |
|               3 | RH                  | (11) 1234-6789 |
|               4 | Financeiro          | (11) 1234-1234 |
|               8 | Desenvolvimento     | NULL           |
|               5 | Contábil            | NULL           |
+-----------------+---------------------+----------------+
*/

-- 18.	Visualizar os dados dos departamentos para os quais não foram atribuídos telefones.
SELECT * FROM departamento WHERE telefone IS NULL;

/*
+-----------------+---------------------+----------+
| id_departamento | nome                | telefone |
+-----------------+---------------------+----------+
|               5 | Cont├íbil           | NULL     |
|               6 | Suporte de Software | NULL     |
|               8 | Desenvolvimento     | NULL     |
+-----------------+---------------------+----------+
*/

-- 19.	Visualizar os dados dos departamentos que tenham telefones.
SELECT * FROM departamento WHERE telefone IS NOT NULL;

/*
+-----------------+------------+----------------+
| id_departamento | nome       | telefone       |
+-----------------+------------+----------------+
|               3 | RH         | (11) 1234-6789 |
|               4 | Financeiro | (11) 1234-1234 |
|               7 | Vendas     | (11) 4321-1234 |
+-----------------+------------+----------------+
*/

-- 20.	Visualizar os dados dos departamentos cujo código seja igual a 3. Perceba que "id_departamento" é a chave primária. 
SELECT * FROM departamento WHERE id_departamento = 3;

/*
+-----------------+------+----------------+
| id_departamento | nome | telefone       |
+-----------------+------+----------------+
|               3 | RH   | (11) 1234-6789 |
+-----------------+------+----------------+
*/

-- 21.	Visualizar os dados dos departamentos cujo nome começa com a letra "D":
SELECT * FROM departamento WHERE nome LIKE 'D%';

/*
+-----------------+-----------------+----------+
| id_departamento | nome            | telefone |
+-----------------+-----------------+----------+
|               8 | Desenvolvimento | NULL     |
+-----------------+-----------------+----------+
*/

-- 22.	Visualizar os dados dos departamentos cujo nome termina com a palavra "Vendas": 
SELECT * FROM departamento WHERE nome LIKE '%Vendas';
/*
+-----------------+--------+----------------+
| id_departamento | nome   | telefone       |
+-----------------+--------+----------------+
|               7 | Vendas | (11) 4321-1234 |
+-----------------+--------+----------------+
*/

-- 23.	Visualizar os dados dos departamentos cujo nome contenha a palavra "de":
SELECT * FROM departamento WHERE nome LIKE '% de %';

/*
+-----------------+---------------------+----------+
| id_departamento | nome                | telefone |
+-----------------+---------------------+----------+
|               6 | Suporte de Software | NULL     |
+-----------------+---------------------+----------+
*/

-- 24.	Visualizar os dados dos departamentos cujo nome NÃO contenha a palavra "de": 
SELECT * FROM departamento WHERE nome NOT LIKE '% de %';

/*
+-----------------+-----------------+----------------+
| id_departamento | nome            | telefone       |
+-----------------+-----------------+----------------+
|               3 | RH              | (11) 1234-6789 |
|               4 | Financeiro      | (11) 1234-1234 |
|               5 | Contábil        | NULL           |
|               7 | Vendas          | (11) 4321-1234 |
|               8 | Desenvolvimento | NULL           |
+-----------------+-----------------+----------------+
*/

-- 25.	Visualizar o telefone do departamento cujo código identificador seja igual a 3:
SELECT telefone FROM departamento WHERE id_departamento = 3;

/*
+----------------+
| telefone       |
+----------------+
| (11) 1234-6789 |
+----------------+
*/

-- 26.	Apagar departamento cujo código seja igual a 4:
DELETE FROM departamento WHERE id_departamento = 4;
SELECT * FROM departamento;

/*
+-----------------+---------------------+----------------+
| id_departamento | nome                | telefone       |
+-----------------+---------------------+----------------+
|               3 | RH                  | (11) 1234-6789 |
|               5 | Cont├íbil           | NULL           |
|               6 | Suporte de Software | NULL           |
|               7 | Vendas              | (11) 4321-1234 |
|               8 | Desenvolvimento     | NULL           |
+-----------------+---------------------+----------------+
*/

-- 27.	Digite o comando para fechar/desconectar do MySQL.
exit;

-- 28.	Digite o comando para verificar a versão e data atual.
SELECT VERSION(), CURRENT_DATE;

-- 29.	Digite o comando para verificar o usuário.
SELECT USER();

-- 30.	Digite o comando para cancelar outro comando que está no meio do processo de entrada no prompt.
;




