package model;

public class ItemPedido {
    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
