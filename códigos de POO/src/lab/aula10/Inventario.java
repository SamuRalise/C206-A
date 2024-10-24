package lab.aula10;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Livro> livros;

    // Construtor
    public Inventario() {
        livros = new ArrayList<>();
    }

    // Método para adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para exibir livros
    public void exibirLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}

