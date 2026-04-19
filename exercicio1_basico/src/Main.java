import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaQuadra sistema = new SistemaQuadra();

        Cliente cliente = sistema.cadastrarCliente("Carlos Silva", "(44) 99999-1111");
        HorarioQuadra h1 = sistema.cadastrarHorario(new HorarioQuadra(LocalDate.of(2026, 4, 20), LocalTime.of(18, 0), LocalTime.of(19, 0), 120.0));
        HorarioQuadra h2 = sistema.cadastrarHorario(new HorarioQuadra(LocalDate.of(2026, 4, 20), LocalTime.of(19, 0), LocalTime.of(20, 0), 120.0));

        Aluguel aluguel = sistema.registrarAluguel(cliente, LocalDate.of(2026, 4, 20), List.of(h1, h2));

        System.out.println("=== EXERCÍCIO 1 - VERSÃO BÁSICA ===");
        System.out.println("Aluguel realizado com sucesso:");
        System.out.println(aluguel);
        System.out.println("\nConsulta de aluguéis do dia 2026-04-20:");
        sistema.consultarPorData(LocalDate.of(2026, 4, 20)).forEach(System.out::println);
    }
}
