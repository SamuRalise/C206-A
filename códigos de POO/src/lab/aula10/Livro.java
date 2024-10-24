package lab.aula10;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, double preco) throws ExcecaoLivroInvalido {
        if (titulo.isEmpty()) {
            throw new ExcecaoLivroInvalido("O título do livro não pode ser vazio.");
        }
        if (preco < 0) {
            throw new ExcecaoLivroInvalido("O preço do livro não pode ser negativo.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Sobrescrevendo toString para exibição dos detalhes do livro
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}