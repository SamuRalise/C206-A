package teoria.aula04.zumbi;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Zumbi zumbi = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi.vida = 100;
        zumbi2.vida = 100;
        System.out.print("Dano do zumbi 1 no zumbi 2: ");
        int dano = entrada.nextInt();
        zumbi.transfereVida(zumbi2, dano);

        System.out.println("Zumbi 1: ");
        zumbi.mostraVida();
        System.out.println("Zumbi 2: ");
        zumbi2.mostraVida();

    }

}
