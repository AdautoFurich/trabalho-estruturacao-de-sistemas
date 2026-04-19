package model;

public class Cliente {
    private static int sequencia = 1;
    private final int id;
    private final String nome;
    private final String telefone;

    public Cliente(String nome, String telefone) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }
        this.id = sequencia++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
