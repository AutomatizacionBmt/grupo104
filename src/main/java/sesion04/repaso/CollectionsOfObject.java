package sesion04.repaso;

import sesion02.clases.Usuario;

import java.util.HashSet;
import java.util.Set;

public class CollectionsOfObject {
    public static void main(String[] args) {
        Set<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("44444444", "Giancarlo", "Yarleque", 30));
        usuarios.add(new Usuario("12345678", "Elvis", "Juarez", 28));
        usuarios.add(new Usuario("87654321", "Jose", "Hurtado", 35));
        usuarios.add(new Usuario("32165487", "Karen", "Cruz", 25));
        usuarios.add(new Usuario("44444444", "Stefanie", "Yarleque", 29));

        System.out.println(usuarios.size());

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
