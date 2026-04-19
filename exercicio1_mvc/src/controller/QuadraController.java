package controller;

import model.Aluguel;
import model.Cliente;
import model.HorarioQuadra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuadraController {
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<HorarioQuadra> horarios = new ArrayList<>();
    private final List<Aluguel> alugueis = new ArrayList<>();

    public Cliente cadastrarCliente(String nome, String telefone) {
        Cliente cliente = new Cliente(nome, telefone);
        clientes.add(cliente);
        return cliente;
    }

    public HorarioQuadra cadastrarHorario(HorarioQuadra horario) {
        horarios.add(horario);
        return horario;
    }

    public Aluguel registrarAluguel(Cliente cliente, LocalDate data, List<HorarioQuadra> horariosSelecionados) {
        Aluguel aluguel = new Aluguel(cliente, data);
        for (HorarioQuadra horario : horariosSelecionados) {
            aluguel.adicionarHorario(horario);
        }
        alugueis.add(aluguel);
        return aluguel;
    }

    public List<Aluguel> consultarAlugueisPorData(LocalDate data) {
        return alugueis.stream()
                .filter(a -> a.getData().equals(data))
                .collect(Collectors.toList());
    }
}
