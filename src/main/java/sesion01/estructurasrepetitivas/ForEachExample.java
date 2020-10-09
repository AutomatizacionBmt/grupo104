package sesion01.estructurasrepetitivas;

public class ForEachExample {

    public static void main(String[] args) {

        String[] nombres = new String[3];
        nombres[0] = "Giancarlo";
        nombres[1] = "Elvis";
        nombres[2] = "Yarlequé";

        /* for(TipoDeDato nombreVariable : coleccion o arreglo) {

        }*/

        System.out.println("******* Con For normal ********");
        for(int i=0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        System.out.println("******* Con ForEach********");
        for(String variable : nombres) {
            System.out.println(variable);
        }
    }
}
