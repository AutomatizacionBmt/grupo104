package sesion04.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejarExcepciones {

    public static void main(String[] args) {
        numerosManejarExcepcion();
    }

    public static void numerosManejarExcepcion() {
        File file = new File("numeros.txt");

        // Scanner fileReader = null;

        /*try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException exception) {
            System.out.println("Entraste al catch");
            exception.printStackTrace();
        } finally {
            System.out.println("Entraste a la clausula finally");
            fileReader.close();
        }*/
        try(Scanner fileReader = new Scanner(file)) {
            while(fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException exception) {
            System.out.println("Entraste al catch");
            exception.printStackTrace();
        }
    }
}
