package sesion03.interfaces;

public interface Producto extends Producto2 {

    String NOMBRE_DEFAULT = "Producto default";

    double getPrecio();
    void setPrecio(double precio);

    String getNombre();
    void setNombre(String nombre);

    String getColor();
    void setColor(String color);

    default String getCodigoBarras() {
        return "Soy un codigo de barras";
    }

}
