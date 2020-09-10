SELECT * FROM usuarios;

/*
+------------+------------------+---------------+---------+
| id_usuario | nome             | data_admissao | salario |
+------------+------------------+---------------+---------+
|          1 | Emílio Fenandes  | 2010-09-01    | 3500.00 |
|          2 | Francisco Gomes  | 2009-07-11    | 4800.00 |
|          3 | Daniel Estrada   | 2010-09-01    | 3500.00 |
|          4 | Célio Drummond   | 2009-07-11    | 6145.00 |
|          5 | Abelardo Barbosa | 2010-09-01    | 2100.00 |
|          6 | Bernardo Costa   | 2011-05-05    | 5575.00 |
+------------+------------------+---------------+---------+
*/

-- 1) Faça uma consulta que mostre os anos de admissão e seus respectivos montantes de salários.
SELECT YEAR(data_admissao) as 'Ano de admissão', SUM(salario) as 'Montante salário'
FROM usuarios
GROUP BY data_admissao 
ORDER BY data_admissao ASC;

/*
+-----------------+------------------+
| Ano de admissão | Montante salário |
+-----------------+------------------+
|            2009 |         10945.00 |
|            2010 |          9100.00 |
|            2011 |          5575.00 |
+-----------------+------------------+
*/

-- 2) Faça uma consulta que recupere os meses que possuem mais de 2 usuários admitidos. Mostre os meses e suas respectivas quantidades de usuários.
SELECT MONTH(data_admissao) as 'Mês', COUNT(*) as 'Qtde usuários admitidos'
FROM usuarios
GROUP BY data_admissao 
HAVING COUNT(*) > 2;

/*
+------+-------------------------+
| Mês  | Qtde usuários admitidos |
+------+-------------------------+
|    9 |                       3 |
+------+-------------------------+
*/

-- 3) Faça uma consulta que recupere a média salarial dos usuários que começam com a letra "F".
SELECT AVG(salario) as 'Média salarial'
FROM usuarios
WHERE nome LIKE 'F%';

/*
+----------------+
| Média salarial |
+----------------+
|    4800.000000 |
+----------------+
*/

-- 4) Faça uma consulta que mostre todos os usuários com seus respectivos salários que são maiores que a média salarial. 
SELECT nome, salario
FROM usuarios
WHERE salario > 
    (SELECT AVG(salario) 
     FROM usuarios);

/*
+-----------------+---------+
| nome            | salario |
+-----------------+---------+
| Francisco Gomes | 4800.00 |
| Célio Drummond  | 6145.00 |
| Bernardo Costa  | 5575.00 |
+-----------------+---------+
*/

-- 5) Faça uma consulta que recupere o mês que possui a maior soma de salários. Mostre o mês e seu respectivo salário acumulado.
SELECT MONTH(data_admissao) as 'Mês com maior soma de salários', SUM(salario) as 'Total'
FROM usuarios
GROUP BY data_admissao
ORDER BY Total DESC
LIMIT 1;

/*
+--------------------------------+----------+
| Mês com maior soma de salários | Total    |
+--------------------------------+----------+
|                              7 | 10945.00 |
+--------------------------------+----------+
*/