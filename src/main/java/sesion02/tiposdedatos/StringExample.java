package sesion02.tiposdedatos;

public class StringExample {

    public static void main(String[] args) {
        String nombre = new String("Giancarlo"); // Apunta a un espacio de memoria....
        String nombre2 = "giancarlo"; // apuntando a otro espacio de memoria
        String nombre3 = "faff";

        if (nombre.equalsIgnoreCase(nombre2)) {
            System.out.println("Son tocayos");
        }

        if (nombre3.isEmpty()) {
            System.out.println("nombre3 esta vacio " + nombre3);
        }
    }
}
