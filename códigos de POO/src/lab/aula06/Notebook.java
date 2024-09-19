package lab.aula06;

public class Notebook extends Produto{
    private double armanezamento;
    private String gpu;
    private String prcessador;

    public Notebook(String nome, double preco,double armanezamento, String gpu, String prcessador) {
        super(nome, preco);
        this.armanezamento = armanezamento;
        this.gpu = gpu;
        this.prcessador = prcessador;
    }
}
