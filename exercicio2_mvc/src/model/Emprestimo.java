package model;

import java.time.LocalDate;

public class Emprestimo {
    private static int sequencia = 1;
    private final int id;
    private final Livro livro;
    private final Aluno aluno;
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean aberto;

    public Emprestimo(Livro livro, Aluno aluno, LocalDate dataEmprestimo) {
        this.id = sequencia++;
        this.livro = livro;
        this.aluno = aluno;
        this.dataEmprestimo = dataEmprestimo;
        this.aberto = true;
        livro.emprestar();
    }

    public boolean isAberto() {
        return aberto;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void registrarDevolucao(LocalDate dataDevolucao) {
        if (!aberto) {
            throw new IllegalStateException("Empréstimo já devolvido.");
        }
        this.dataDevolucao = dataDevolucao;
        this.aberto = false;
        livro.devolver();
    }

    @Override
    public String toString() {
        return "Emprestimo #" + id + " | Livro: " + livro.getTitulo() + " | Aluno: " + aluno.getNome() + " | Status: " + (aberto ? "ABERTO" : "DEVOLVIDO");
    }
}
