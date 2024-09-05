package lab.aula04;

public class Autor {
    private String nome;
    private Saga[] saga = new Saga[10];

    public void listarSagas(){
        for(int i = 0; i < this.saga.length; i++){
            if(this.saga[i] != null){
                System.out.print(i + 1);
                this.saga[i].mostraInfo();
            }
        }
    }
    public void adicionarSaga(Saga saga){
        for(int i = 0; i < this.saga.length; i++){
            if(this.saga[i] == null){
                this.saga[i] = saga;
                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
