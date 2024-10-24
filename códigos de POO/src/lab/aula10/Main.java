package lab.aula10;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Primeiro try-catch para um livro válido
        try {
            Livro livro1 = new Livro("titulo 1", "autor 1", 150.0);
            inventario.adicionarLivro(livro1);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println(e.getMessage());
        }

        // Segundo try-catch para um livro com erro (preço negativo)
        try {
            Livro livro2 = new Livro("lol", "vava", -50.0);
            inventario.adicionarLivro(livro2);
        } catch (ExcecaoLivroInvalido e) {
            System.out.println(e.getMessage());
        }

        // Exibindo os livros no inventário
        inventario.exibirLivros();
    }
}