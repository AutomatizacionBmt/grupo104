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
        int enteros1[] = new int[3];
        enteros1[0] = 3;
        enteros1[1]=4;
        enteros1[2] = 5;

        int enteros[] = {3,4,5};
        imprimirEnteros(enteros1);
        imprimirEnteros(enteros);

        System.out.println("¿Cuantas calificaciones usted desea ingresar?");
        int numeroElementos = scanner.nextInt();
        calificaciones = new int[numeroElementos];

        getCalificaciones();

        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Mayor Calificacion: " + obtenerMayorCalificacion());
        System.out.println("Menor Calificacion: " + obtenerMenorCalificacion());

    }

    private static void imprimirEnteros(int enteros[]) {
        for(int entero : enteros) {
            System.out.print(entero + " | ");
        }
        System.out.println();
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
