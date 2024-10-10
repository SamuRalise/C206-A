package lab.aula08;

public class Corredor extends Atleta implements Equipamento {
    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando Equipamento de Corredor");
    }

    @Override
    public void treinar() {
        System.out.println("Treinando corrida");
    }
}
