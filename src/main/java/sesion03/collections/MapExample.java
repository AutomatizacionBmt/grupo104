package sesion03.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> frutaCalorias = new HashMap<>();
        frutaCalorias.put("manzana", 95);
        frutaCalorias.put("limon", 20);
        frutaCalorias.put("platano", 105);
        frutaCalorias.put("naranaja", 45);
        frutaCalorias.put("limon", 17);

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias.get("limon"));
    }
}
