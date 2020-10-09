package sesion01.condicionales;

import java.util.Scanner;

public class ResultadoGradoMensaje {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el grado al que pertenece");
        String grado = scanner.next();

        String mensaje = "";

        switch (grado.toUpperCase()) {
            case "A" :
                mensaje = "¡Excelente Trabajo, su puntaje es mayor de 90";
                break;
            case "B":
                mensaje = "¡Gran Trabajo, su puntaje es menor a 90 y mayor a 80";
                break;
            case "C":
                mensaje = "¡Buen Trabajo!, su puntaje es menor a 80 y mayor a 70";
            case "D":
                mensaje = "¡Necesitas esforzarte un poco más, su puntaje es menor a 70";
                break;
            case "E":
                mensaje = "¡No puede ser!, su puntaje es menor a 60";
                break;
            default:
                mensaje = "grado incorrecto";
        }

        System.out.println(mensaje);
    }
}
