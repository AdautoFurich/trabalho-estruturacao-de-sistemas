import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private static int sequencia = 1;
    private final int id;
    private final Cliente cliente;
    private final LocalDate data;
    private final List<HorarioQuadra> horarios;

    public Aluguel(Cliente cliente, LocalDate data) {
        this.id = sequencia++;
        this.cliente = cliente;
        this.data = data;
        this.horarios = new ArrayList<>();
    }

    public void adicionarHorario(HorarioQuadra horario) {
        if (!horario.getData().equals(data)) {
            throw new IllegalArgumentException("Todos os horários do aluguel devem ser da mesma data.");
        }
        horario.reservar();
        horarios.add(horario);
    }

    public LocalDate getData() {
        return data;
    }

    public double calcularValorTotal() {
        return horarios.stream().mapToDouble(HorarioQuadra::getValor).sum();
    }

    @Override
    public String toString() {
        return "Aluguel{id=" + id + ", cliente='" + cliente.getNome() + "', data=" + data + ", horarios=" + horarios.size() + ", total=R$ " +
                String.format(java.util.Locale.US, "%.2f", calcularValorTotal()) + "}";
    }
}
