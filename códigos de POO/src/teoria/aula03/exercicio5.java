package teoria.aula03;

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe um numero de 1 a 10: ");
        int n = entrada.nextInt();
        while(n != x){
            System.out.println("Tente novamente: ");
            n = entrada.nextInt();

        };

        System.out.println("Acertou!!!");

        entrada.close();
    }
}
