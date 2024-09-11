import java.sql.SQLOutput;

public class Computador {
    String marca;
    float preco;
    MemoriaUSB musb;
    SistemaOperacional sistemaOp;
    HardwareBasico[] hardwareBa = new HardwareBasico[10];

    public Computador(){
        this.sistemaOp = new SistemaOperacional();
        hardwareBa[0] = new HardwareBasico();
        hardwareBa[1] = new HardwareBasico();
        hardwareBa[2] = new HardwareBasico();
    }


    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: " + this.preco);
        System.out.println("MemoriaUSB: " + this.musb.nome + " " + this.musb.capacidade + "Gb");
        System.out.println("SistemaOperacional: " + this.sistemaOp.nome + " (" + this.sistemaOp.tipo + " bits)");
        System.out.println("HardwareBasico:");
        for (int i = 0; i < this.hardwareBa.length; i++) {
            if(this.hardwareBa[i] != null){
                System.out.println(this.hardwareBa[i].nome + " " + this.hardwareBa[i].capacidade);
            }
        }
    }
    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }
}
