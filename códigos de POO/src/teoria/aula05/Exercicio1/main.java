package teoria.aula05.Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean campominado[][] = new boolean[2][2];

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int x = rand.nextInt(2);
        int y = rand.nextInt(2);
        int coluna, linha;

        campominado[x][y] = true;

        for (int i = 0; i < campominado.length * 2; i++) {
            System.out.println("Digite uma linha: ");
            linha = entrada.nextInt();
            System.out.println("Digite uma coluna: ");
            coluna = entrada.nextInt();
            if(campominado[linha][coluna]){
                System.out.println("Explodiuuu!!!!!");
            }
            else{
                System.out.println("Tente novamente: ");
            }

        }

    }
}
