package sesion03.polimorfismo;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void gemido() {
        System.out.println("Hola me llamo " + nombre + " y hago guau guau");
    }

    public void buscar() {
        System.out.println("Buscar es divertido, si te pierdes te encuentro");
    }
}
