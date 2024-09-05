package lab.aula04;

public class main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("los hermanos", 20);
        Livro livro2 = new Livro("lol", 40);
        Livro livro3 = new Livro("hero", 30);
        Livro livro4 = new Livro("batman", 25);

        Saga saga1 = new Saga(80);
        Saga saga2 = new Saga(50);
        Autor autor1 = new Autor();

        autor1.setNome("Carlos");

        saga1.adicionarLivro(livro1);
        saga1.adicionarLivro(livro2);
        saga2.adicionarLivro(livro3);
        saga2.adicionarLivro(livro4);

        autor1.adicionarSaga(saga1);
        autor1.adicionarSaga(saga2);

        System.out.println("Livros da primeira saga: ");
        saga1.listarLivros();
        System.out.println("Livros da segunda saga: ");
        saga2.listarLivros();
        System.out.println("Sagas escritas pelo " + autor1.getNome() + ": ");
        autor1.listarSagas();
    }
}
