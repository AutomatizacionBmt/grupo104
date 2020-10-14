package sesion02.metodos;

/*
Escriba un programa de "verificación de crédito instantánea" que apruebe cualquier
persona que gane más de S/ 25,000 y tenga un score de créditicio de 700 o mejor. Rechaza a todos los demás.
 */

import java.util.Scanner;

public class VerificacionCreditoInstantaneo {

    private static double salarioRequerido = 25000;
    public static int scoreCrediticioRequerido = 700;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salario = obtenerSalario();
        int score = obtenerScoreCrediticio();

        boolean estaCalificado = esUsuarioCalificado(salario, score);

        System.out.println(estaCalificado ? "El usuario esta calificado" : "No esta calificado");

        notificaUsuario(estaCalificado);

    }

    public static double obtenerSalario() {
        System.out.println("Ingresa su salario:");
        return scanner.nextDouble();
    }

    public static int obtenerScoreCrediticio() {
        System.out.println("Ingresa su score crediticio:");
        return scanner.nextInt();
    }

    public static boolean esUsuarioCalificado(double salario, int score) {
        /* if (salario > salarioRequerido && score >= scoreCrediticioRequerido) {
            return true;
        } else {
            return false;
        }*/
        return salario > salarioRequerido && score >= scoreCrediticioRequerido;
    }

    public static void notificaUsuario(boolean estaCalificado) {
        System.out.println(estaCalificado
                ? "Felicidades!, has aprobado para el credito"
                : "LO sentimos!, para otra oportunidad");
    }
}
