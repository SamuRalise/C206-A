package lab.aula05.ex1;

public class main {
    public static void main(String[] args) {
        Banda banda = new Banda("skills", 3);

        Musica m1 = new Musica();
        Musica m2 = new Musica();
        m1.setNome("sky");
        m1.setAlbum("primeiro");
        m2.setNome("blues");
        m2.setAlbum("primeiro");

        banda.adicionarMusica(m1);
        banda.adicionarMusica(m2);

        banda.tocarMusica(1);

        banda.tocarShow();

        banda.deletarMusica(m2);

        banda.tocarShow();


    }
}
