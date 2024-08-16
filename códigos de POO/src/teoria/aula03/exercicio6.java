package teoria.aula03;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x, n;

        x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe um numero de 1 a 10: ");
        n = entrada.nextInt();

        while(n != x){

            if(n > x){
                System.out.println("Seu numero é menor, tente novamente: ");
            }
            else{
                System.out.println("Seu numero é maior, tente novamente: ");
            }

            n = entrada.nextInt();
        };

        System.out.println("Acertou!!!");

        entrada.close();
    }
}
