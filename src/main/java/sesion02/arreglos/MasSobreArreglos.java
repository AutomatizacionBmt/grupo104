package sesion02.arreglos;

import java.util.Random;

public class MasSobreArreglos {

    public static void main(String[] args) {
        int[][] enteros = new int[2][3];

        Random random = new Random();

        // Llenar la matriz
        for(int i = 0 ; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                enteros[i][j] = random.nextInt(10) + 1;
                System.out.print(enteros[i][j] + " | ");
            }
            System.out.println();
        }

        // imprimir los valores de la matriz
        /*for(int i = 0 ; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(enteros[i][j] + " | ");
            }
            System.out.println();
        }*/

    }
}
