package controller;

import model.Aluno;
import model.Emprestimo;
import model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BibliotecaController {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Aluno> alunos = new ArrayList<>();
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public Livro cadastrarLivro(String titulo, String autor, int quantidade) {
        Livro livro = new Livro(titulo, autor, quantidade);
        livros.add(livro);
        return livro;
    }

    public Aluno cadastrarAluno(String nome, String turma) {
        Aluno aluno = new Aluno(nome, turma);
        alunos.add(aluno);
        return aluno;
    }

    public Emprestimo registrarEmprestimo(Livro livro, Aluno aluno, LocalDate data) {
        Emprestimo emprestimo = new Emprestimo(livro, aluno, data);
        emprestimos.add(emprestimo);
        return emprestimo;
    }

    public List<Emprestimo> listarEmprestimosAbertos() {
        return emprestimos.stream().filter(Emprestimo::isAberto).collect(Collectors.toList());
    }

    public List<Aluno> listarAlunosComPendencia() {
        return emprestimos.stream()
                .filter(Emprestimo::isAberto)
                .map(Emprestimo::getAluno)
                .distinct()
                .collect(Collectors.toList());
    }
}
