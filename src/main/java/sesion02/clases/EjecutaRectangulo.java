package sesion02.clases;

public class EjecutaRectangulo {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(18, 15);

        System.out.println("Ancho1: " + rectangulo1.getAncho());
        System.out.println("Largo1: " + rectangulo1.getLargo());
        System.out.println("El area del rectangulo 1 es: " + rectangulo1.calcularArea());
        System.out.println("El perimetro del rectangulo 1 es: " + rectangulo1.calcularPerimetro());

        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setLargo(20);
        rectangulo2.setAncho(10);

        System.out.println("Ancho2: " + rectangulo2.getAncho());
        System.out.println("Largo2: " + rectangulo2.getLargo());
        System.out.println("El area del rectangulo 2 es: " + rectangulo2.calcularArea());
        System.out.println("El perimetro del rectangulo 2 es: " + rectangulo2.calcularPerimetro());
    }
}
