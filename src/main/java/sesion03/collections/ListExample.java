package sesion03.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
    listDemo();
    }

    private static void listDemo() {
        List<String> frutas = new ArrayList<>();

        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");

        System.out.println(frutas.size());
        System.out.println(frutas.get(0));//platano
    }
}
