package lab.aula08;

public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando Equipamento de Ciclista");
    }

    @Override
    public void treinar() {
        System.out.println("Treinando Ciclismo");
    }
}
