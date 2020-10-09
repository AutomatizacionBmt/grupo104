package sesion01.condicionales;

import java.util.Random;
import java.util.Scanner;

/*
Todos los vendedores reciben un pago de S/1000 por semana.
Los vendedores que superen las 10 ventas obtienen un bono adicional de S/250.
 */
public class CalculaSalarioConBono {

    static double sueldoFijo = 1000;
    static int cuota = 10;
    static double bono = 250;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Cuantas ventas hizo el empleado esta semana?");
        int numeroVentas = scanner.nextInt();

        double sueldoTotal = calcularSueldoTotal(numeroVentas);

        System.out.println("El pago del empleado es: " + sueldoTotal);

    }

    public static double calcularSueldoTotal(int numVentas) {
        if (numVentas>cuota){
            return sueldoFijo + bono;
        }else {
            return sueldoFijo;
        }
    }


}
