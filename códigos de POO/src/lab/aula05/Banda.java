package lab.aula05;

public class Banda {
    private String nome;
    private Musica[] musica = new Musica[10];
    private int numeroDeIntegrantes;
    public void tocarMusica(int posicao){
        System.out.println("Nome: " + musica[posicao].getNome());
        System.out.println("Album: " + musica[posicao].getAlbum());
    }
    public void tocarShow(){
        for(int i = 0; i < musica.length; i++){
            if(musica[i] != null){
                System.out.println("Nome: " + musica[i].getNome());
                System.out.println("Album: " + musica[i].getAlbum());
            }
        }
    }
    public boolean adicionarMusica(Musica musica){
        for(int i = 0; i < this.musica.length; i++){
            if(this.musica[i] == null){
                this.musica[i] = musica;
                break;
            }
        }
        return true;
    }
    public boolean deletarMusica(Musica musica){
        for(int i = 0; i < this.musica.length; i++){
            if(this.musica[i].getNome().equals(musica.getNome())){
                this.musica[i] = null;
                break;
            }
        }
        return true;
    }
    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
