package sesion03.polimorfismo;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void gemido() {
        System.out.println("Quiquiriqui");
    }
}
