package model;

public class Livro {
    private static int sequencia = 1;
    private final int id;
    private final String titulo;
    private final String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título do livro não pode ser vazio.");
        }
        if (quantidadeDisponivel < 0) {
            throw new IllegalArgumentException("Quantidade do livro não pode ser negativa.");
        }
        this.id = sequencia++;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void emprestar() {
        if (quantidadeDisponivel <= 0) {
            throw new IllegalStateException("Livro sem quantidade disponível.");
        }
        quantidadeDisponivel--;
    }

    public void devolver() {
        quantidadeDisponivel++;
    }
}
