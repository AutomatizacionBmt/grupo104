package sesion01.estructurasrepetitivas;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Escriba un programa que permita a un usuario ingresar dos números,
 * y luego sume los dos números. El usuario debería poder repetir esta acción hasta
 * que indiquen que han terminado.
 */
public class SumaNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar; // true or false

        do {
            System.out.println("Ingrese numero 1: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Ingrese numero 2: ");
            double numero2 = scanner.nextDouble();

            double suma = numero1 + numero2;

            System.out.println("La suma es: " + suma);

            System.out.println("¿Desea continuar? true or false");
            continuar = scanner.nextBoolean();

            if (!continuar) {
                System.out.println("Gracias por usar nuestra calculadora");
            }

        } while(continuar);

    }
}
