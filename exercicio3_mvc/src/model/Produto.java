package model;

public class Produto {
    private static int sequencia = 1;
    private final int id;
    private final String nome;
    private final String descricao;
    private final double preco;

    public Produto(String nome, String descricao, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do produto não pode ser vazio.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço do produto não pode ser negativo.");
        }
        this.id = sequencia++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto #" + id + " | " + nome + " | R$ " + String.format(java.util.Locale.US, "%.2f", preco);
    }
}
