package sesion03.interfaces;

public class Libro implements Producto {

    private double precio;
    private String nombre;
    private String color;

    private String autor;
    private int paginas;
    private String isbn;

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append("precio=").append(precio);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", paginas=").append(paginas);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
