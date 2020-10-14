package sesion02.clases;

public class TestUsuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();// creación de un objeto de la clase Usuario,
        // este opbjeto tiene valores iniciales null, para el tipo de dato int es 0
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());
        usuario.setNombre("Giancarlo");
        usuario.setEdad(29);
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEdad());

        Usuario usuario2 = new Usuario();// creacion de otra instancia
        Usuario usuario3 = new Usuario("Elvis", "Yarleque", 29);

        System.out.println(usuario3.getNombre());



    }
}
