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

        Producto producto2 = new Libro2();
        producto2.setPrecio(80);

        System.out.println(producto2);

        System.out.println(libro);
    }
}
