package sesion02.metodos;

import java.util.Scanner;

public class EjemploMetodo {

    private static Scanner scanner = new Scanner(System.in);
    private static int numero1;// Una variable es un espacio de memoria que almacena un valor
    private static int numero2;

    public static void imprimirSaludo(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static void imprimirSuma() {
        System.out.println("La suma es: " + (numero1 + numero2));
    }

    public static void imprimirProducto() {
        System.out.println("El producto es: " + (numero1 * numero2));
    }

    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();

        imprimirSaludo(nombre);

        System.out.println("Ingrese numero 1");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese numero 2");
        numero2 = scanner.nextInt();

        imprimirSuma();
        imprimirProducto();

    }


}
