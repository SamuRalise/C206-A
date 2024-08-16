package lab.aula02;

import java.util.Scanner;

public class exercicio1 {
    public static int calcularFatorial(int n){
        int fat = 1;
        if(n > 1){
            fat = n * calcularFatorial(n-1);
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fat;
        }
        return fat;
    }
    public static void mostraPares(int n){
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = entrada.nextInt();

        System.out.println("Seu fatorial é: " + calcularFatorial(n));
        System.out.println("Numeros pares de 0 ate " + n + ": ");
        mostraPares(n);

    }
}
