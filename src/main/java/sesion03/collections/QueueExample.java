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

        System.out.println(frutas.size());
        System.out.println(frutas);

        /*System.out.println("remove: " + frutas.remove());
        System.out.println(frutas);*/

        System.out.println("peek: " + frutas.peek());
        System.out.println(frutas);
    }
}
