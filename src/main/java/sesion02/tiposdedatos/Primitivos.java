package sesion02.tiposdedatos;

public class Primitivos {

    public static void main(String[] args) {
        byte b = 127; // 1, 2, 3, 4
        System.out.println("b = " + b);
        System.out.println("Valor Minimo: " + Byte.MIN_VALUE);
        System.out.println("Valor Maximo: " + Byte.MAX_VALUE);

        short miShort = 32767;
        System.out.println("miShort = " + miShort);
        System.out.println("Valor Minimo: " + Short.MIN_VALUE);
        System.out.println("Valor Maximo: " + Short.MAX_VALUE);

        int miInt = 32767;
        System.out.println("miInt = " + miInt);
        System.out.println("Valor Minimo: " + Integer.MIN_VALUE);
        System.out.println("Valor Maximo: " + Integer.MAX_VALUE);

        long miLong = 32767;
        System.out.println("miLong = " + miLong);
        System.out.println("Valor Minimo: " + Long.MIN_VALUE);
        System.out.println("Valor Maximo: " + Long.MAX_VALUE);

        float miFloat = 32767.54F;
        System.out.println("miLong = " + miFloat);
        System.out.println("Valor Minimo: " + Float.MIN_VALUE);
        System.out.println("Valor Maximo: " + Float.MAX_VALUE);

        double miDouble = 32767.54D;
        System.out.println("miDouble = " + miDouble);
        System.out.println("Valor Minimo: " + Double.MIN_VALUE);
        System.out.println("Valor Maximo: " + Double.MAX_VALUE);

        char miChar = 33; //'!','\u0021';
        System.out.println("miChar = " + miChar);

    }
}
