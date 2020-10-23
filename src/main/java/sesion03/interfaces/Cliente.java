package sesion03.interfaces;

public class Cliente {

    public static void main(String[] args) {
        Producto libro = new Libro();

        libro.setPrecio(10.99);
        libro.setNombre("Mi Planta de Naranja Lima");
        libro.setColor("Verde");

        ((Libro) libro).setAutor("Giancarlo");
        ((Libro) libro).setPaginas(50);
        ((Libro) libro).setIsbn("123456");

        libro.ejecutarSaludo();
        System.out.println("Codigo de barras: " + libro.getCodigoBarras());

        System.out.println(libro);
    }
}
