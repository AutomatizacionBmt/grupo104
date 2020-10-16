package sesion02.arreglos;

import java.util.Arrays;
import java.util.Random;

public class TicketLoteria2 {

    private static int numeroElementos = 6;
    private static int max = 20;

    public static void main(String[] args) {
        int[] tickets = generarNumeros();
        boolean encontrado = busquedaSecuencial(tickets, 6);
        boolean encontrado2 = busquedaBinaria(tickets, 6);
        imprimirTickets(tickets);

        System.out.println(encontrado ? "Si se encuentra el numero 6" : "No hemos encontrado el numero 6");
        System.out.println(encontrado2 ? "Si se encuentra el numero 6" : "No hemos encontrado el numero 6");

    }

    public static int[] generarNumeros() {

        int[] tickets = new int[numeroElementos];

        Random random = new Random();
        for(int i = 0; i < numeroElementos; i++){
            tickets[i] = random.nextInt(max) + 1; // 1 - 20
        }

        return tickets;
    }

    public static boolean busquedaSecuencial(int[] tickets, int datoABuscar) {
        for (int i = 0; i < tickets.length ; i++) {
            if (tickets[i] == datoABuscar) {
                return true;
            }
        }
        return false;
    }

    public static boolean busquedaBinaria(int[] tickets, int datoABuscar) {
        Arrays.sort(tickets);

        int index = Arrays.binarySearch(tickets, datoABuscar);

        return index >= 0;

        /*if (index >= 0 ) {
            return true;
        }

        return false;*/
    }

    public static void imprimirTickets(int[] tickets) {
        for (int i = 0; i < tickets.length ; i++) {
            System.out.print(tickets[i] + " | ");
        }
        System.out.println();
    }
}
