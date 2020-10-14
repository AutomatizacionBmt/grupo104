package sesion02.clases;

import java.util.Scanner;

public class CalculaArea {

    private static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {

        CalculaArea calculaArea = new CalculaArea();

        Rectangulo cocina = calculaArea.getRectangulo("cocina");
        Rectangulo banio = calculaArea.getRectangulo("banio");

    }

    public Rectangulo getRectangulo(String descripcion) {
        System.out.println("Ingrese el largo de " + descripcion);
        double largo = consola.nextDouble();

        System.out.println("Ingrese el ancho de " + descripcion);
        double ancho = consola.nextDouble();

        return new Rectangulo(largo, ancho);
    }

    public double calcularAreaTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularArea() + banio.calcularArea();
    }


}
