package sesion01;


import java.util.Scanner;

/*
* Para calificar para un préstamo, una persona debe ganar al menos S/3,000 y haber trabajado en su
* trabajo actual durante al menos 2 años.
 * */
public class CalificadorPrestamo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double  montoMinimo = 3000;
        int periodoTrabajoMinimo = 2;

        System.out.println("Ingrese el sueldo del trabajador");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese el periodo de trabajo actual");
        int periodoTrabajoActual = scanner.nextInt();

        boolean estaCalificado = (sueldo >= montoMinimo && periodoTrabajoActual >= periodoTrabajoMinimo);

        if (estaCalificado) {
            System.out.println("Felicidades! has aplicado al préstamo");
        } else {
            System.out.println("Lo Siento!, usted no ha aplicado al prestamo, se requiere un salario " +
                    "minimo de " + montoMinimo + " y un periodo de trabajo minimo de " + periodoTrabajoMinimo + " años") ;
        }


    }
}
