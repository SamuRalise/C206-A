package teoria.aula05.Exercicio0;

public class main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();

        cantina.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.nome = "Coxinha";
        s2.nome = "Esfirra";
        s3.nome = "hamburguer";

        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        cantina.mostraInfo();
    }
}
