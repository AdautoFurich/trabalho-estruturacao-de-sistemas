import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete();

        Produto xBurger = lanchonete.cadastrarProduto("X-Burger", "Hambúrguer com queijo", 18.0);
        Produto refrigerante = lanchonete.cadastrarProduto("Refrigerante", "Lata 350ml", 6.0);

        Pedido pedido = lanchonete.criarPedido(LocalDate.of(2026, 4, 18));
        pedido.adicionarItem(new ItemPedido(xBurger, 2));
        pedido.adicionarItem(new ItemPedido(refrigerante, 2));
        pedido.finalizar();

        System.out.println("=== EXERCÍCIO 3 - VERSÃO BÁSICA ===");
        System.out.println("Pedido finalizado:");
        System.out.println(pedido);
        System.out.println("\nPedidos do dia:");
        lanchonete.consultarPedidosPorDia(LocalDate.of(2026, 4, 18)).forEach(System.out::println);
        System.out.println("\nFaturamento do dia: R$ " + String.format(java.util.Locale.US, "%.2f", lanchonete.calcularFaturamento(LocalDate.of(2026, 4, 18))));
    }
}
