import controller.LanchoneteController;
import model.ItemPedido;
import model.Pedido;
import model.Produto;
import view.LanchoneteView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LanchoneteController controller = new LanchoneteController();
        LanchoneteView view = new LanchoneteView();

        Produto cachorroQuente = controller.cadastrarProduto("Cachorro-Quente", "Pão, salsicha e molhos", 14.0);
        Produto suco = controller.cadastrarProduto("Suco Natural", "Copo 300ml", 7.0);

        Pedido pedido = controller.criarPedido(LocalDate.of(2026, 4, 18));
        pedido.adicionarItem(new ItemPedido(cachorroQuente, 1));
        pedido.adicionarItem(new ItemPedido(suco, 2));
        pedido.finalizar();

        view.mostrarMensagem("=== EXERCÍCIO 3 - VERSÃO MVC ===");
        view.mostrarMensagem("Pedido realizado:");
        view.mostrarLista(java.util.List.of(pedido));
        view.mostrarMensagem("\nPedidos do dia:");
        view.mostrarLista(controller.listarPedidosPorDia(LocalDate.of(2026, 4, 18)));
        view.mostrarMensagem("\nFaturamento do dia: R$ " + String.format(java.util.Locale.US, "%.2f", controller.calcularFaturamento(LocalDate.of(2026, 4, 18))));
    }
}
