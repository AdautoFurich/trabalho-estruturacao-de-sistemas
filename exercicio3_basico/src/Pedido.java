import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int sequencia = 1;
    private final int id;
    private final LocalDate data;
    private final List<ItemPedido> itens;
    private boolean finalizado;

    public Pedido(LocalDate data) {
        this.id = sequencia++;
        this.data = data;
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public LocalDate getData() {
        return data;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularSubtotal).sum();
    }

    public void finalizar() {
        if (itens.isEmpty()) {
            throw new IllegalStateException("O pedido só pode ser finalizado se tiver pelo menos um produto.");
        }
        finalizado = true;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", data=" + data + ", total=R$ " + String.format(java.util.Locale.US, "%.2f", calcularTotal()) + ", finalizado=" + finalizado + "}";
    }
}
