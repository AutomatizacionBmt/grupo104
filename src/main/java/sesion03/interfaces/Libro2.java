package sesion03.interfaces;

public class Libro2 implements Producto {
    @Override
    public double getPrecio() {
        return 20;
    }

    @Override
    public void setPrecio(double precio) {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void ejecutarSaludo() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro2{");
        sb.append("precio=").append(getPrecio());
        sb.append('}');
        return sb.toString();
    }
}
