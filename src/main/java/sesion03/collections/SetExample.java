package sesion03.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        // calculatedTime();
        setDemo();
    }

    private static void setDemo() {
        Set<String> frutas = new HashSet<>();
        frutas.add("manzana");// add -> agrega un elemento a la coleccion
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");

        System.out.println(frutas.size());//devuelve el tamaño de la coleccion
        System.out.println(frutas);
    }

    private static void calculatedTime() {
        int cantidad = 1000000;
        final Set hashSet = new HashSet(cantidad);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < cantidad; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Tiempo en HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < cantidad; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Tiempo en TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(cantidad);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < cantidad; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Tiempo en LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }
}
