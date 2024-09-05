package teoria.aula04.zumbi;

public class Zumbi {

    double vida;
    String nome;

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia) {

        if (quantia <= this.vida) {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else{
            return false;
        }

    }

    public void mostraVida() {
        System.out.println("Vida: " + this.vida);
    }

    public void atacar() {
        System.out.println("Atacando");
    }

}

