package teoria.aula03;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o valor da NPA:");
        float NPA = entrada.nextFloat();

        if (NPA >= 60) {
            System.out.println("Passou, NFA = " + NPA);
        }
        else{
            System.out.println("Reprovou, NFA = " + NPA + ", faça a NP3!");

            System.out.printf("Informe o valor da NP3:");
            float NP3 = entrada.nextFloat();

            if ((NPA + NP3) / 2 >= 50) {
                System.out.println("Passou, NFA = " + (NPA + NP3) / 2);
            }
            else{
                System.out.println("Reprovou, NFA = " + (NPA + NP3) / 2);
            }
        }

        entrada.nextLine();
    }
}
