import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float matricula = 1993;
        Scanner sc = new Scanner(System.in);
        Scanner CPF = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Computador[] computador = new Computador[10];
        MemoriaUSB memoriaUSB = new MemoriaUSB();

        computador[0] = new Computador();
        memoriaUSB.nome = "Pen-drive de";
        memoriaUSB.capacidade = 16;
        computador[0].marca = "Positivo";
        computador[0].preco = matricula;
        computador[0].addMemoriaUSB(memoriaUSB);
        computador[0].sistemaOp.nome = "Linux Ubunto";
        computador[0].sistemaOp.tipo = 32;
        computador[0].hardwareBa[0].nome = "Pentium Core i3";
        computador[0].hardwareBa[0].capacidade = 2200;
        computador[0].hardwareBa[1].nome = "Memoria RAM";
        computador[0].hardwareBa[1].capacidade = 8;
        computador[0].hardwareBa[2].nome = "HD";
        computador[0].hardwareBa[2].capacidade = 500;

        computador[1] = new Computador();
        memoriaUSB.nome = "Pen-drive de";
        memoriaUSB.capacidade = 32;
        computador[1].marca = "Acer";
        computador[1].preco = matricula + 1234;
        computador[1].addMemoriaUSB(memoriaUSB);
        computador[1].sistemaOp.nome = "Windows 8";
        computador[1].sistemaOp.tipo = 64;
        computador[1].hardwareBa[0].nome = "Pentium Core i5";
        computador[1].hardwareBa[0].capacidade = 3370;
        computador[1].hardwareBa[1].nome = "Memoria RAM";
        computador[1].hardwareBa[1].capacidade = 16;
        computador[1].hardwareBa[2].nome = "HD";
        computador[1].hardwareBa[2].capacidade = 1000;

        computador[2] = new Computador();
        memoriaUSB.nome = "Pen-drive de";
        memoriaUSB.capacidade = 1000;
        computador[2].marca = "Vaio";
        computador[2].preco = matricula + 5678;
        computador[2].addMemoriaUSB(memoriaUSB);
        computador[2].sistemaOp.nome = "Windows 10";
        computador[2].sistemaOp.tipo = 64;
        computador[2].hardwareBa[0].nome = "Pentium Core i7";
        computador[2].hardwareBa[0].capacidade = 4500;
        computador[2].hardwareBa[1].nome = "Memoria RAM";
        computador[2].hardwareBa[1].capacidade = 32;
        computador[2].hardwareBa[2].nome = "HD";
        computador[2].hardwareBa[2].capacidade = 2000;

        int x;

        System.out.println("Seu nome: ");
        cliente.nome = sc.next();
        System.out.println("Seu CPF: ");
        cliente.cpf = CPF.nextLong();

        System.out.println("Olá, seja bem vindo! Vou te mostrar as nossas promoções:");
        for(int i = 0; i < computador.length; i++) {
            if (computador[i] != null) {
                System.out.println("Promoção " + (i + 1) + ":");
                computador[i].mostraPCConfigs();
            }
        }

        System.out.print("Qual delas você vai escolher? ");
        x = sc.nextInt();
        int i = 0;
        while(x != 0) {
            switch(x) {
                case 1:
                    cliente.computadores[i] = new Computador();
                    cliente.computadores[i] = computador[0];
                    System.out.print("Boa escolha!! Se deseja escolher outra, digite o numero da promoção, se não digite 0 para finalizar! ");
                    x = sc.nextInt();
                    break;
                case 2:
                    cliente.computadores[i] = new Computador();
                    cliente.computadores[i] = computador[1];
                    System.out.print("Boa escolha!! Se deseja escolher outra, digite o numero da promoção, se não digite 0 para finalizar! ");
                    x = sc.nextInt();
                    break;
                case 3:
                    cliente.computadores[i] = new Computador();
                    cliente.computadores[i] = computador[2];
                    System.out.print("Boa escolha!! Se deseja escolher outra, digite o numero da promoção, se não digite 0 para finalizar! ");
                    x = sc.nextInt();
                    break;
                case 0:
                    System.out.println("Muito obrigado! Volte sempre!");
                    break;
                default:
                    break;
            }
            i++;
        }
        System.out.println("Informações da compra:");
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Total da compra: " + cliente.calculaTotalCompra() + " R$");
        System.out.println("Lista de computadores comprados: ");
        for(int j = 0; j < 3; j++) {
            if (cliente.computadores[j] != null) {
                cliente.computadores[j].mostraPCConfigs();
            }
        }
    }
}