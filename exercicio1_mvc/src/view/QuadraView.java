package view;

import model.Aluguel;

import java.util.List;

public class QuadraView {
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirAluguel(Aluguel aluguel) {
        System.out.println(aluguel);
    }

    public void exibirLista(List<Aluguel> alugueis) {
        alugueis.forEach(System.out::println);
    }
}
