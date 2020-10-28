package sesion04.colecciones;

import java.util.Map;
import java.util.function.BiConsumer;

/*
A unos estudiantes se les dió un examen sorpresa, y colectivamente no lo hicieron tan bien. Como resultado, el Profesor
decidió darles un examen de recuperación para permitirles mejorar sus puntajes.
Teniendo en cuenta dos Maps de puntajes de las pruebas, actualice las calificaciones de los estudiantes solo si
obtuvieron mejores resultados en el examen de recuperación.

Imprime las calificaciones finales.

 */
public class Examen {

    public static void main(String[] args) {

        Examen exa = new Examen();

        Map<String, Double> primerExamenMap = Calificacion.obtenerResultadosPrimeraCalificacion();
        Map<String, Double> examenRecuperacionMap = Calificacion.obtenerResultadosSegundaCalificacion();

        //try {
            String[] nombres = {"Giancarlo", "Elvis"} ;
            System.out.println("Nombre 3: " + nombres[3]);
        /*} catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Por si acaso el indice esta fuera de lo permitido");
        }*/

        for (Map.Entry<String, Double> calificacion : examenRecuperacionMap.entrySet()) {
            Double notaPrimerExamen = primerExamenMap.get(calificacion.getKey());
            Double notaExamenRecuperacion = calificacion.getValue();

            if (notaExamenRecuperacion > notaPrimerExamen) {
                primerExamenMap.put(calificacion.getKey(), notaExamenRecuperacion);
            }
        }

        System.out.println("Calificaciones finales 1era forma: ");
        primerExamenMap.forEach((key, value) -> System.out.println("Estudiante: " + key + "; Calificacion: " + value));

        System.out.println("Calificaciones finales 2da forma: ");
        // BiConsumer<String, Double> biConsumer = exa::imprimirNotas;//Metodos referencia
        //BiConsumer<String, Double> biConsumer = Examen::imprimirNotas;//Metodos referencia
        BiConsumer<String, Double> biConsumer = (key, value) ->  {
            System.out.println("HOLA");
            System.out.println("Estudiante: " + key + "; Calificacion: " + value);
        };
        primerExamenMap.forEach(biConsumer);

    }

    private void imprimirNotas(String key, Double value) {
        System.out.println("Estudiante: " + key + "; Calificacion: " + value);
    }
}
