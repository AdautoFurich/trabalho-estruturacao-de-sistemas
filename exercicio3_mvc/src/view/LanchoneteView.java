package view;

import java.util.List;

public class LanchoneteView {
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarLista(List<?> lista) {
        lista.forEach(System.out::println);
    }
}
