package sesion04.colecciones;


import java.util.HashMap;
import java.util.Map;

public class Calificacion {

    public static Map<String, Double> obtenerResultadosPrimeraCalificacion() {
        Map<String, Double> primeraCalificacionMap = new HashMap<>();

        primeraCalificacionMap.put("Giancarlo", 8.0);
        primeraCalificacionMap.put("Alex", 9.0);
        primeraCalificacionMap.put("Carlos", 7.0);
        primeraCalificacionMap.put("Doris", 10.0);
        primeraCalificacionMap.put("Franco", 8.0);
        primeraCalificacionMap.put("Gustavo", 9.0);
        primeraCalificacionMap.put("Janidet", 11.0);
        primeraCalificacionMap.put("José", 15.0);
        primeraCalificacionMap.put("Julie", 12.0);
        primeraCalificacionMap.put("Katherine", 10.0);
        primeraCalificacionMap.put("Leonardo", 13.0);
        primeraCalificacionMap.put("Luis", 14.0);
        primeraCalificacionMap.put("Nacho", 10.0);
        primeraCalificacionMap.put("Omar", 9.0);
        primeraCalificacionMap.put("Stefanie", 11.0);

        return primeraCalificacionMap;
    }

    public static Map<String, Double> obtenerResultadosSegundaCalificacion() {
        Map<String, Double> segundaCalificacionMap = new HashMap<>();

        segundaCalificacionMap.put("Giancarlo", 18.0);
        segundaCalificacionMap.put("Alex", 19.0);
        segundaCalificacionMap.put("Carlos", 17.0);
        segundaCalificacionMap.put("Doris", 15.0);
        segundaCalificacionMap.put("Franco", 15.0);
        segundaCalificacionMap.put("Gustavo", 16.0);
        segundaCalificacionMap.put("Janidet", 17.0);
        segundaCalificacionMap.put("José", 9.0);
        segundaCalificacionMap.put("Julie", 13.0);
        segundaCalificacionMap.put("Katherine", 14.0);
        segundaCalificacionMap.put("Leonardo", 15.0);
        segundaCalificacionMap.put("Luis", 18.0);
        segundaCalificacionMap.put("Nacho", 17.0);
        segundaCalificacionMap.put("Omar", 16.0);
        segundaCalificacionMap.put("Stefanie", 20.0);

        return segundaCalificacionMap;
    }
}
