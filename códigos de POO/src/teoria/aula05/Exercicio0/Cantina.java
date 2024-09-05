package teoria.aula05.Exercicio0;

public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[5];

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Cantina: " + this.nome + " \nSalgados: ");
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] != null) {
                System.out.println(salgados[i].nome);
            }
        }

    }
}
