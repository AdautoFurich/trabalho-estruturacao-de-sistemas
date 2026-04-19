# Exercício 2 - Controle de Biblioteca Escolar (Versão Básica)

## Objetivo
Este projeto foi criado a partir da análise do enunciado e contém:
- tabelas sugeridas para planejamento do banco de dados;
- regras de negócio identificadas;
- simulação simples na classe `Main`.

## Tabelas identificadas

1. **livros**
   - id_livro
   - titulo
   - autor
   - quantidade_disponivel

2. **alunos**
   - id_aluno
   - nome
   - turma

3. **emprestimos**
   - id_emprestimo
   - id_livro
   - id_aluno
   - data_emprestimo
   - data_devolucao
   - status


## Regras de negócio identificadas

1. Livro não pode ser cadastrado com título vazio.
2. Livro não pode ser cadastrado com quantidade negativa.
3. Só é permitido emprestar livro com quantidade disponível maior que zero.
4. Ao registrar um empréstimo, a quantidade disponível do livro deve diminuir automaticamente.
5. Ao registrar a devolução, a quantidade disponível do livro deve aumentar automaticamente.
6. O sistema deve permitir consultar os livros emprestados no momento.
7. O sistema deve permitir consultar os alunos com empréstimos em aberto.
8. Um empréstimo devolvido não pode ser devolvido novamente.


## Como executar
Compile os arquivos Java da pasta `src` e execute a classe `Main`.
