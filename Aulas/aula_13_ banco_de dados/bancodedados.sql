-- criacao das tabelas (Level 1)

CREATE TABLE clientes(id_cliente VARCHAR(6) PRIMARY KEY, nome VARCHAR(50), email VARCHAR(50), telefone VARCHAR(50));


CREATE TABLE produtos(id_produto VARCHAR(6) PRIMARY KEY, nome  VARCHAR(50),preco float, categoria VARCHAR(50));


CREATE TABLE pedidos(id_pedido VARCHAR(6) PRIMARY KEY, data_pedido DATE, valor_total float, id_cliente VARCHAR(6) REFERENCES 
clientes(id_cliente));

CREATE TABLE detalhesDoPedido (
	id_detalhe VARCHAR(6) PRIMARY KEY,
	id_pedido VARCHAR(6) REFERENCES pedidos(id_pedido),
	id_produto VARCHAR(6) REFERENCES produtos(id_produto),
	quantidade INT
)



-- Selects ( Level 2 )

--Selecione todos os registros de uma tabela chamada "Clientes".

SELECT * 
FROM clientes

--Selecione apenas os nomes dos clientes da tabela "Clientes".

SELECT nome
FROM clientes

--Selecione todos os registros da tabela "Pedidos" onde o valor total seja superior a 100.

SELECT *
FROM pedidos
WHERE valor_total > 100


-- Selecione todos os produtos da tabela "Produtos" que tenham um preço menor que 50.

SELECT *
FROM produtos 
WHERE preco < 50


-- Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.

UPDATE CLIENTES
SET nome = 'Hemerson'
WHERE id_cliente = '111112'


-- Delete um registro da tabela "Produtos" com base em um critério específico, como o ID do produto.

DELETE FROM produtos 
WHERE id_produto = '123456'

-- Selecione todos os pedidos da tabela "Pedidos" que foram feitos por um cliente específico.

SELECT *
FROM pedidos
WHERE id_cliente = '111111'

-- Calcule a média dos preços dos produtos na tabela "Produtos".

SELECT AVG(preco)
FROM produtos

-- Crie uma nova tabela chamada "Funcionários" com colunas para nome, cargo e data de contratação, e insira alguns registros nela.

CREATE TABLE funcionarios(
	id_funcionario VARCHAR(6) PRIMARY KEY,
	nome VARCHAR(50),
	cargo VARCHAR(50),
	data_de_contratacao DATE
)

INSERT INTO funcionarios(id_funcionario,nome,cargo,data_de_contratacao) VALUES
(123456,'Rogerio','Eletricista', CURRENT_DATE),
(133333,'Arthur','Dev Backend', CURRENT_DATE),
(123446,'Adriel','Dev Backend', CURRENT_DATE),
(123476,'Maria','Cientista de Dados', CURRENT_DATE)

-- A little more complicated ( Level 3 )

-- Selecione todos os clientes que fizeram mais de 3 pedidos na tabela "Clientes" e "Pedidos".

SELECT clientes.nome
FROM pedidos
JOIN clientes
ON clientes.id_cliente = pedidos.id_cliente
GROUP BY clientes.nome 
HAVING COUNT(id_pedido) > 3


-- Crie uma consulta que retorne o nome do cliente e o valor total de todos os pedidos feitos por ele.

SELECT clientes.nome, SUM(valor_total) as valor_total_em_pedidos
FROM pedidos
JOIN clientes
ON clientes.id_cliente = pedidos.id_cliente
GROUP BY clientes.nome



-- Atualize os preços dos produtos na tabela "Produtos" com base em um aumento percentual específico.

UPDATE produtos
SET preco = preco + preco * 0.10


-- Crie uma consulta que retorne a lista de produtos mais vendidos com base na contagem de pedidos na tabela "Produtos" e "DetalhesDoPedido".

SELECT produtos.nome, SUM(quantidade) as total
FROM detalhesdopedido
JOIN produtos
ON detalhesdopedido.id_produto = produtos.id_produto
GROUP BY produtos.nome
ORDER BY total DESC


-- Crie uma consulta que calcule a média, a mediana e o desvio padrão dos preços dos produtos na tabela "Produtos".

SELECT AVG(preco) AS media
FROM produtos


-- Selecione todos os pedidos feitos em um período de tempo específico, usando a tabela "Pedidos" e um intervalo de datas.


-- Crie uma consulta que identifique os clientes que não fizeram nenhum pedido nos últimos 6 meses na tabela "Clientes" e "Pedidos".


-- Crie uma consulta que classifique os produtos na tabela "Produtos" com base em seu preço, em ordem decrescente.


-- Crie uma consulta que retorne o total de vendas por categoria de produto na tabela "Produtos" e "DetalhesDoPedido".
