package sesion03.collections;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> frutas = new LinkedList<>();
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");

        System.out.println(frutas.size());
    }
}
