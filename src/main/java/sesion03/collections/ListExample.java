package sesion03.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
    listDemo();
    }

    private static void listDemo() {
        List<String> frutas = new ArrayList<>();

        List<String> frutas2 = new ArrayList<>();
        frutas2.add("Melocoton");

        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");

        frutas.addAll(3, frutas2);

        System.out.println("IndexOf: " +frutas.indexOf("limon"));
        System.out.println("IndexOf: " +frutas.lastIndexOf("limon"));

        System.out.println(frutas.size());
        System.out.println(frutas.get(0));//platano
        System.out.println(frutas);
    }
}
