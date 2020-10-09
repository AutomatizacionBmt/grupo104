package sesion01.estructurasrepetitivas;

import java.util.Scanner;

public class EstructurasRepetitivas {

    public static void main(String[] args) {
        /*
        Inicialización
        Condición
        Bloque de sentencias
        Actualización
         */

        System.out.println("********* WHILE **********");
        int numeros = 10;

        int count = 11;
        while (count <= numeros) {
            System.out.println(count);
            count = count + 1;
        }

        /*
        inicialización;
        do
        {
            bloque-de-sentencias;
              actualizacion;
        } while (condición) ;
         */

        System.out.println("********* DO WHILE **********");

        int countDoWhile = 11;
        do {
            System.out.println(countDoWhile);
            countDoWhile++; // countDoWhile = countDoWhile + 1;
        } while(countDoWhile <= numeros);

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese opcion: ");
            System.out.println("0. salir");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
                case 1:
                    System.out.println("La Suma es: " + (5+5));
                    break;
                case 2:
                    System.out.println("La diferencia es: " + (5-5));
                    break;
                default:
                    System.out.println("opcion invalidad");
            }
        } while(opcion != 0);
    }
}
