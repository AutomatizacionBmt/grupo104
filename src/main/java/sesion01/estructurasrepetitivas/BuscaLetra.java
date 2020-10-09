package sesion01.estructurasrepetitivas;

import java.util.Scanner;

public class BuscaLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        String texto = scanner.next(); // Giancarlo -> 9

        //g i a n c a r l o
        //0 1 2 3 4 5 6 7 8
        // Alexander Gimenez (17)
        // 0........16
        boolean letraEncontrada = false;
        int posicionEncontrada = -1;

        for(int i = 0; i < texto.length(); i++) { // i va de 0 hasta 16
            char letraActual = texto.charAt(i); // obtener el caracter de la posicion i
            if (letraActual == 'A' || letraActual == 'a') {
                posicionEncontrada = i;
                letraEncontrada = true;
                break;
            }
        }

        if (letraEncontrada) {
            System.out.println("Este texto contiene la letra 'A' en la posicion " + (posicionEncontrada + 1));
        } else {
            System.out.println("Este texto no contiene la letra 'A'");
        }

    }
}
