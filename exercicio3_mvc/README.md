# Exercício 3 - Controle de Pedidos em uma Lanchonete (Versão MVC)

## Objetivo
Este projeto foi criado a partir da análise do enunciado e contém:
- tabelas sugeridas para planejamento do banco de dados;
- regras de negócio identificadas;
- simulação simples na classe `Main`.

## Tabelas identificadas

1. **produtos**
   - id_produto
   - nome
   - descricao
   - preco

2. **pedidos**
   - id_pedido
   - data_pedido
   - valor_total
   - status

3. **itens_pedido**
   - id_item
   - id_pedido
   - id_produto
   - quantidade
   - preco_unitario
   - subtotal


## Regras de negócio identificadas

1. Produto não pode ser cadastrado com nome vazio.
2. Produto não pode ser cadastrado com preço negativo.
3. Um pedido pode conter vários produtos.
4. O valor total do pedido deve ser calculado automaticamente pela soma dos itens.
5. Um pedido só pode ser finalizado se tiver pelo menos um produto adicionado.
6. O sistema deve permitir consultar pedidos por dia.
7. O sistema deve permitir consultar o faturamento de um período.


## Como executar
Compile os arquivos Java da pasta `src` e execute a classe `Main`.
