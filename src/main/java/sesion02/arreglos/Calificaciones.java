package sesion02.arreglos;

import java.util.Arrays;
import java.util.Scanner;

/*
Crear un programa que permita al usuario ingresar cualquier número de calificaciones y les
proporciona su puntaje promedio, así como los puntajes más altos y más bajos.
 */
public class Calificaciones {

    private static Scanner scanner = new Scanner(System.in);
    private static int calificaciones[];

    public static void main(String[] args) {
        System.out.println("¿Cuantas calificaciones usted desea ingresar?");
        int numeroElementos = scanner.nextInt();
        calificaciones = new int[numeroElementos];

        getCalificaciones();

        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Mayor Calificacion: " + obtenerMayorCalificacion());
        System.out.println("Menor Calificacion: " + obtenerMenorCalificacion());

    }

    public static void getCalificaciones() {
        for (int i = 0; i < calificaciones.length ; i++) {
            System.out.println("Ingresar calificacion #" + (i +1));
            calificaciones[i] = scanner.nextInt();
        }
    }

    public static int calcularSuma() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma = suma + calificacion;
        }
        return suma;
    }

    public static int calcularPromedio() {
        return calcularSuma() / calificaciones.length;
    }

    public static int obtenerMayorCalificacion() {
        int mayorCalificacion = calificaciones[0];
        for(int calificacion : calificaciones) {
            if (calificacion > mayorCalificacion) {
                mayorCalificacion = calificacion;
            }
        }
        return mayorCalificacion;
    }

    public static int obtenerMenorCalificacion() {
        Arrays.sort(calificaciones);
        int menorCalificacion = calificaciones[0];
        /*for(int calificacion : calificaciones) {
            if (calificacion < menorCalificacion) {
                menorCalificacion = calificacion;
            }
        }*/
        return menorCalificacion;
    }
}
