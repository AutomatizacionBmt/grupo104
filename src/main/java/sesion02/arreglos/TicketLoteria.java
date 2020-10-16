package sesion02.arreglos;

import java.util.List;
import java.util.Random;
import java.util.Set;

/*
Crear una aplicación que genere un ticket de lotería  con 6 números aleatorios entre 1 – 69.
1 | 2 | 56 | 5 | 23 | 12 |
 */
public class TicketLoteria {

    public static void main(String[] args) {
        generaNumerosEImprime();

        loteria();
    }

    public static void loteria() {
        Random random = new Random();
        int[] tickets = new int[6];

        String ticket = "";

        for(int i = 0; i < 6; i++) {
            int dato = random.nextInt(69) + 1;
            tickets[i] = dato;
            if (i == (tickets.length-1)) {
                ticket = ticket + tickets[i];
            } else {
                ticket = ticket + tickets[i] + "|";
            }
        }

        System.out.println(ticket);

        // imprimirTickets(tickets);
    }

    public static void imprimirTickets(int[] tickets) {
        String ticket = "";
        for(int i = 0; i < tickets.length; i++) {
            if (i == (tickets.length-1)) {
                ticket = ticket + tickets[i];
            } else {
                ticket = ticket + tickets[i] + "|";
            }
        }
        System.out.println(ticket);
    }

    public static void generaNumerosEImprime() {
        int[] enteros = new int[6];
        enteros[0] = 10;
        enteros[1] = 11;
        enteros[2] = 12;
        enteros[3] = 13;
        enteros[4] = 14;
        enteros[5] = 15;

        System.out.println("El tercer elemento es: " + enteros[5]);
    }
}
