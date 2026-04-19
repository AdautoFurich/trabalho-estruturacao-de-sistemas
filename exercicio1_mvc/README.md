# Exercício 1 - Controle de Aluguel de Quadra Esportiva (Versão MVC)

## Objetivo
Este projeto foi criado a partir da análise do enunciado e contém:
- tabelas sugeridas para planejamento do banco de dados;
- regras de negócio identificadas;
- simulação simples na classe `Main`.

## Tabelas identificadas

1. **clientes**
   - id_cliente
   - nome
   - telefone

2. **horarios_quadra**
   - id_horario
   - data
   - hora_inicio
   - hora_fim
   - valor
   - disponivel

3. **aluguéis**
   - id_aluguel
   - id_cliente
   - data_aluguel
   - valor_total

4. **itens_aluguel**
   - id_item
   - id_aluguel
   - id_horario
   - valor_horario


## Regras de negócio identificadas

1. Cliente não pode ser cadastrado com nome vazio.
2. Horário não pode ser cadastrado com valor negativo.
3. Um horário já ocupado não pode ser reservado novamente.
4. Um aluguel deve estar vinculado a um cliente.
5. Um aluguel pode conter um ou mais horários no mesmo dia.
6. O valor total do aluguel deve ser calculado automaticamente pela soma dos horários reservados.
7. O sistema deve permitir consultar todos os aluguéis de uma data.


## Como executar
Compile os arquivos Java da pasta `src` e execute a classe `Main`.
