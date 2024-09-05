package teoria.aula04.kart;

public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
    }

    public void pular(){
        System.out.println("Kart pulou");
    }
    public void soltarTurbo(){
        System.out.println("Acionou o turbo!!");
    }
    public void fazerDrift(){
        System.out.println("drift!!!");
    }
}
