package sesion01;

public class EjemploString {

    public static void main(String[] args) {
        String nombre = "Giancarlo"; // apunta a un referencia en memoria
        String nombre2 = new String("GiANCarlo"); // apunta a otra referencia en memoria

        System.out.println(nombre);
        System.out.println(nombre2);

        if (5> 3 && 3<4) {
            System.out.println("has aplicado el operador && (AND)");
        }

        if (2> 3 || 3<4) {
            System.out.println("has aplicado el operador || (OR)");
        }

        if (!(2>3)) {
            System.out.println("Aqui estoy negando");
        }

        if (nombre.equalsIgnoreCase(nombre2)) {
            System.out.println("Son tocayos");
        }
    }
}
