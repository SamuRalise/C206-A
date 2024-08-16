package teoria.aula03;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Número de alunos na diciplina: ");
        int n = entrada.nextInt();

        switch (n) {
            case 10:
            case 20:
                System.out.println("Sua sala será a I-16!");
            break;
            case 30:
                System.out.println("Sua sala será a I-22!");
            break;
            default:
                System.out.println("Não determinado!");
        }

        entrada.close();
    }
}
