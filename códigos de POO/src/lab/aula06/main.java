package lab.aula06;

public class main {
    public static void main(String[] args) {
        Produto[] produto = new Produto[10];
        Notebook note = new Notebook("acer", 1000, 500, "grande kkkk", "razer");
        Camiseta camiseta = new Camiseta("De rock", 100, "preta", "M");

        produto[0] = note;
        produto[1] = camiseta;

        for (int i = 0; i < produto.length; i++) {
            if (produto[i] != null) {
                produto[i].etiquetaPreco();
            }
        }



    }
}
