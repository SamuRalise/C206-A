package lab.aula04;

public class Livro {
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo + " Paginas: " + this.paginas);
    }
}
