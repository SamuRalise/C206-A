package lab.aula06;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        return this.nome;
    }
}
