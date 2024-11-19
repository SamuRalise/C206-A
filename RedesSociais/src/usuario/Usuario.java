package usuario;

import redesocial.RedeSocial;
import excecoes.CheckedException;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new HashSet<>();
    }

    public void adicionarRedeSocial(RedeSocial rede) {
        redesSociais.add(rede);
    }

    public void usarRedes() throws CheckedException {
        if (redesSociais.isEmpty()) {
            throw new CheckedException("O usuário não possui redes sociais cadastradas!");
        }
        else{
            for (RedeSocial rede : redesSociais) {
                rede.postarFoto();
                rede.postarVideo();
                rede.postarComentario();
            }
        }


    }
}
