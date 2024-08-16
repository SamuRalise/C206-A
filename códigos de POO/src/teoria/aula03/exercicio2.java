package teoria.aula03;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de lanches consumidos na primeira hora: ");
        int n1 = entrada.nextInt();
        System.out.print("Numero de lanches consumidos na segunda  hora: ");
        int n2 = entrada.nextInt();
        System.out.print("Numero de lanches consumidos na terceira hora: ");
        int n3= entrada.nextInt();

        int total = n1+n2+n3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + (total / 3));

        entrada.close();
    }
}
