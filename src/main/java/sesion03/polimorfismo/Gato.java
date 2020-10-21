package sesion03.polimorfismo;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void gemido() {
        System.out.println("Hola me llamo " + nombre + " y hago miau");
    }

    public void rasguniar() {
        System.out.println("Yo soy un " + this.getClass().getSimpleName() + " y me gusta rasguniar");
    }
}
