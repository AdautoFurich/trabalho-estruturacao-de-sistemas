package model;

public class Aluno {
    private static int sequencia = 1;
    private final int id;
    private final String nome;
    private final String turma;

    public Aluno(String nome, String turma) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio.");
        }
        this.id = sequencia++;
        this.nome = nome;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno #" + id + " | " + nome + " | Turma: " + turma;
    }
}
