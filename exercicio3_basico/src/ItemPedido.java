public class ItemPedido {
    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " = R$ " + String.format(java.util.Locale.US, "%.2f", calcularSubtotal());
    }
}
