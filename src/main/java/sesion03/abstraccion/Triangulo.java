package sesion03.abstraccion;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(String tipoFigura, double base, double altura) {
        super(tipoFigura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un :" + this.getClass().getSimpleName());
    }

    @Override
    public double calcularArea() {
        // System.out.println("El area del " + this.getClass().getSimpleName() + " es " + (base * altura / 2));
        return (base * altura) / 2;
    }
}

