package view;

import java.util.List;

public class BibliotecaView {
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarLista(List<?> itens) {
        itens.forEach(System.out::println);
    }
}
