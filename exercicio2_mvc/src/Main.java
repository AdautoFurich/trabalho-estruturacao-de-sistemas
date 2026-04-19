import controller.BibliotecaController;
import model.Aluno;
import model.Emprestimo;
import model.Livro;
import view.BibliotecaView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();

        Livro livro = controller.cadastrarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1);
        Aluno aluno = controller.cadastrarAluno("João Pedro", "2º Ano B");
        Emprestimo emprestimo = controller.registrarEmprestimo(livro, aluno, LocalDate.of(2026, 4, 18));

        view.mostrarMensagem("=== EXERCÍCIO 2 - VERSÃO MVC ===");
        view.mostrarMensagem("Empréstimo realizado:");
        view.mostrarLista(java.util.List.of(emprestimo));
        view.mostrarMensagem("\nEmpréstimos em aberto:");
        view.mostrarLista(controller.listarEmprestimosAbertos());
        view.mostrarMensagem("\nAlunos com livros em aberto:");
        view.mostrarLista(controller.listarAlunosComPendencia());
    }
}
