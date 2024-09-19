package lab.aula06;

public class Notebook extends Produto{
    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco,double armanezamento, String gpu, String prcessador) {
        super(nome, preco);
        this.armazenamento = armanezamento;
        this.gpu = gpu;
        this.processador = prcessador;
    }
    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco() + " " + armazenamento + "GB " + gpu + " " + processador;
    }
}
