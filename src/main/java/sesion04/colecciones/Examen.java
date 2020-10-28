package sesion04.colecciones;

import java.util.Map;

/*
A unos estudiantes se les dió un examen sorpresa, y colectivamente no lo hicieron tan bien. Como resultado, el Profesor
decidió darles un examen de recuperación para permitirles mejorar sus puntajes.
Teniendo en cuenta dos Maps de puntajes de las pruebas, actualice las calificaciones de los estudiantes solo si
obtuvieron mejores resultados en el examen de recuperación.

Imprime las calificaciones finales.

 */
public class Examen {

    public static void main(String[] args) {
        Map<String, Double> primerExamenMap = Calificacion.obtenerResultadosPrimeraCalificacion();
        Map<String, Double> examenRecuperacionMap = Calificacion.obtenerResultadosSegundaCalificacion();

        for (Map.Entry<String, Double> calificacion : examenRecuperacionMap.entrySet()) {
            Double notaPrimerExamen = primerExamenMap.get(calificacion.getKey());
            Double notaExamenRecuperacion = calificacion.getValue();

            if (notaExamenRecuperacion > notaPrimerExamen) {
                primerExamenMap.put(calificacion.getKey(), notaExamenRecuperacion);
            }
        }

        System.out.println("Calificaciones finales: ");
        primerExamenMap.forEach((key, value) -> System.out.println("Estudiante: " + key + "; Calificacion: " + value));
    }
}
