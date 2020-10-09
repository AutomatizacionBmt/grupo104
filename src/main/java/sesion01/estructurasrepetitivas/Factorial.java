package sesion01.estructurasrepetitivas;

import java.util.Random;
import java.util.Scanner;

public class Factorial {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // 5! = 5 x 4 x3 x2 x1;
        // 6! = 6 x 5 x 4 x 2 x1;

        System.out.println("Ingresar numero");
        int numero = scanner.nextInt();
        long factorial = 1;

        int count = 1;

        while (count <= numero) {
            factorial = factorial * count;
            count++;
        }
        System.out.println(factorial);

        // for(incializacion; condicion; actualizacion) {
        // bloque de sentencias
        //}

        factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial usando for es: " + factorial);
    }
}
