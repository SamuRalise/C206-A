package lab.aula03.exercicio01;

public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.matricula = 222;
        aluno.np1 = 50;
        aluno.np2 = 40;
        aluno.periodo = 4;
        aluno.nome = "João Silva";


        System.out.println(aluno);

        aluno.calculaMedia();
    }
}
