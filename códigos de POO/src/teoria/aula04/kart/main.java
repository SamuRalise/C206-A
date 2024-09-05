package teoria.aula04.kart;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Piloto p1 = new Piloto();
        Kart k1 = new Kart();
        k1.piloto = p1;

        System.out.print("Digite o nome do piloto: ");
        p1.nome = entrada.nextLine();
        System.out.print("Digite o nome do kart: ");
        k1.nome = entrada.nextLine();
        System.out.print("Digite a velocidade maxima do kart: ");
        k1.motor.velocidadeMaxima = entrada.nextInt();
        System.out.print("Digite as cilindradas do kart: ");

        p1.soltaSuperPoder();
        k1.soltarTurbo();
        k1.motor.mostraInfo();

    }
}
