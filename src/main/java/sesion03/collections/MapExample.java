package sesion03.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> frutaCalorias = new HashMap<>();

        System.out.println("Esta vacio? " + frutaCalorias.isEmpty());

        frutaCalorias.put("manzana", 95);
        frutaCalorias.put("limon", 20);
        frutaCalorias.put("platano", 105);
        frutaCalorias.put("naranaja", 45);
        frutaCalorias.put("pera", 45);
        frutaCalorias.put("limon", 17);
        frutaCalorias.put("limon", 10);

        // frutaCalorias.remove("limon");

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.get("platano"));

        if (frutaCalorias.containsKey("durazno")) {
            System.out.println("Si encontre el  key durazno");
        } else {
            System.out.println("No se encontro el  key durazno");
        }

        System.out.println("Usando forEach convencional de Java 7");
        for(Map.Entry<String, Integer> entry : frutaCalorias.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        System.out.println("Usando forEach de Java 8");
        frutaCalorias.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        });

        List<String> result = frutaCalorias
                        .entrySet()
                        .stream()
                        .filter(x -> x.getKey().length() > 5)//Filtrar un valor booleano
                        .map(x -> x.getKey())//transformar
                        .collect(Collectors.toList());

        System.out.println("resultado: " + result);

        Suma suma = () -> 3 + 4 ;

        System.out.println("Resultado suma: " + suma.sumar());


    }
}
