package lab.aula06;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco() {
        return nome + " R$ " + String.format("%.2f", preco);
    }
}
