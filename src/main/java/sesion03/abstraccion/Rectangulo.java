package sesion03.abstraccion;//Object

public class Rectangulo extends FiguraGeometrica {

    private double ancho;
    private double largo;

    public Rectangulo(String tipoFigura, double ancho, double largo) {
        super(tipoFigura);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }

    @Override
    public double calcularArea() {
        //System.out.println("El area del " + this.getClass().getSimpleName() + " es " + (ancho * largo));
        return ancho * largo;
    }
}
