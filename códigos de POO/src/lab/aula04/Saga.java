package lab.aula04;

public class Saga {
    private int nota;
    private Livro[] livros = new Livro[10];

    public Saga(int nota) {
        this.nota = nota;
    }

    public void listarLivros() {
        for (int i = 0; i < this.livros.length; i++) {
            if (this.livros[i] != null) {
                this.livros[i].mostrarInfo();
            }
        }
    }
    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < this.livros.length; i++) {
            if (this.livros[i] == null) {
                this.livros[i] = livro;
                break;
            }
        }
    }
    public void mostraInfo() {
        System.out.println(" saga: recebeu nota " + this.nota);
    }


}
