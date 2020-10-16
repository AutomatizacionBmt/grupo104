package sesion02.arreglos;

import sesion02.clases.Usuario;

public class Objetos {

    public static void main(String[] args) {
        /*Usuario[] usuarios = new Usuario[2];
        usuarios[0] = new Usuario("Giancarlo", "Yarlequé", 28);
        usuarios[1] = new Usuario("Elvis", "Juarez", 29);*/

        Usuario[] usuarios = {
                new Usuario("Giancarlo", "Yarlequé", 28),
                new Usuario("Elvis", "Juarez", 29)
        };

        for(Usuario miUsuario : usuarios) {
            System.out.println(miUsuario);
        }
    }
}
