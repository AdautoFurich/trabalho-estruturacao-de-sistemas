package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int sequencia = 1;
    private final int id;
    private final LocalDate data;
    private final List<ItemPedido> itens = new ArrayList<>();
    private boolean finalizado;

    public Pedido(LocalDate data) {
        this.id = sequencia++;
        this.data = data;
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
            throw new IllegalStateException("Pedido precisa ter ao menos um item.");
        }
        finalizado = true;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " | Data: " + data + " | Total: R$ " + String.format(java.util.Locale.US, "%.2f", calcularTotal()) + " | Finalizado: " + finalizado;
    }
}
