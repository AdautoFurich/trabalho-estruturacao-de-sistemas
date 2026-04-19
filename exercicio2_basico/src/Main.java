import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = biblioteca.cadastrarLivro("Dom Casmurro", "Machado de Assis", 2);
        Aluno aluno = biblioteca.cadastrarAluno("Ana Beatriz", "3º Ano A");

        Emprestimo emprestimo = biblioteca.registrarEmprestimo(livro, aluno, LocalDate.of(2026, 4, 18));

        System.out.println("=== EXERCÍCIO 2 - VERSÃO BÁSICA ===");
        System.out.println("Empréstimo registrado:");
        System.out.println(emprestimo);

        System.out.println("\nLivros emprestados no momento:");
        biblioteca.consultarEmprestimosEmAberto().forEach(System.out::println);

        System.out.println("\nAlunos com livros em aberto:");
        biblioteca.consultarAlunosComLivrosEmAberto().forEach(System.out::println);
    }
}
