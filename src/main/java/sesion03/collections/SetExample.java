package sesion03.collections;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        // calculatedTime();
        setDemo();
    }

    private static void setDemo() {
        Set<String> frutas = new HashSet<>();

        System.out.println("Esta vacio? " + frutas.isEmpty());

        frutas.add("manzana");// add -> agrega un elemento a la coleccion
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");

        System.out.println(frutas.size());//devuelve el tamaño de la coleccion

        frutas.remove("naranja");

        System.out.println(frutas);

        System.out.println("Esta vacio? " + frutas.isEmpty());

        if(frutas.contains("limon")) {
            System.out.println("Si esta el elemento limon en la coleccion");
        }

        // Usando un iterador
        System.out.println("**************** Iterator ***************");
        Iterator iterator = frutas.iterator();
        while(iterator.hasNext()) {
            System.out.println("Elemento: " + iterator.next());
        }

        // Usando forEach
        System.out.println("**************** ForEach ***************");
        for(String fruta : frutas) {
            System.out.println("Elemento: " + fruta);
        }

        //Usando ForEach Java 8
        System.out.println("**************** ForEach de Java 8 ***************");
        frutas
                .stream()
                //.filter(p -> p.equals("pera"))
                .map(p -> p.length())// Transformar, entra un string y lo transformo en un int
                .forEach(fruta -> System.out.println("Elemento: " + fruta));

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
