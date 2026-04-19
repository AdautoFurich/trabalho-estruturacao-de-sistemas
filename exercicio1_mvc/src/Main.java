import controller.QuadraController;
import model.Aluguel;
import model.Cliente;
import model.HorarioQuadra;
import view.QuadraView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuadraController controller = new QuadraController();
        QuadraView view = new QuadraView();

        Cliente cliente = controller.cadastrarCliente("Marcos Lima", "(44) 98888-2222");
        HorarioQuadra h1 = controller.cadastrarHorario(new HorarioQuadra(LocalDate.of(2026, 4, 21), LocalTime.of(20, 0), LocalTime.of(21, 0), 150.0));
        HorarioQuadra h2 = controller.cadastrarHorario(new HorarioQuadra(LocalDate.of(2026, 4, 21), LocalTime.of(21, 0), LocalTime.of(22, 0), 150.0));

        Aluguel aluguel = controller.registrarAluguel(cliente, LocalDate.of(2026, 4, 21), List.of(h1, h2));

        view.exibirMensagem("=== EXERCÍCIO 1 - VERSÃO MVC ===");
        view.exibirMensagem("Aluguel registrado:");
        view.exibirAluguel(aluguel);
        view.exibirMensagem("\nConsulta por data:");
        view.exibirLista(controller.consultarAlugueisPorData(LocalDate.of(2026, 4, 21)));
    }
}
