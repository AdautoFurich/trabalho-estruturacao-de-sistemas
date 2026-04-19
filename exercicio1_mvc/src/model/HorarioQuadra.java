package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class HorarioQuadra {
    private static int sequencia = 1;
    private final int id;
    private final LocalDate data;
    private final LocalTime horaInicio;
    private final LocalTime horaFim;
    private final double valor;
    private boolean reservado;

    public HorarioQuadra(LocalDate data, LocalTime horaInicio, LocalTime horaFim, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do horário não pode ser negativo.");
        }
        this.id = sequencia++;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        if (reservado) {
            throw new IllegalStateException("Horário já reservado.");
        }
        reservado = true;
    }

    @Override
    public String toString() {
        return data + " " + horaInicio + "-" + horaFim + " | R$ " + String.format(java.util.Locale.US, "%.2f", valor);
    }
}
