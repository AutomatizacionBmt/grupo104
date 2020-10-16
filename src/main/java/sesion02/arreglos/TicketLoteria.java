package sesion02.arreglos;

/*
Crear una aplicación que genere un ticket de lotería  con 6 números aleatorios entre 1 – 69.
1 | 2 | 56 | 5 | 23 | 12 |
 */
public class TicketLoteria {

    public static void main(String[] args) {
        generaNumerosEImprime();
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
