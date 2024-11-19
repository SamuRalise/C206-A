import excecoes.CheckedException;
import redesocial.*;
import usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("Samuel", "samuel@gmail.com");

            Facebook facebook = new Facebook("123", 11);
            Instagram instagram = new Instagram("123", 23);

            usuario.adicionarRedeSocial(facebook);
            usuario.adicionarRedeSocial(instagram);

            usuario.usarRedes();
        } catch (CheckedException e) {
        System.out.println(e.getMessage());
    }

    }
}
