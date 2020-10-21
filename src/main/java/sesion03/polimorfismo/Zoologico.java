package sesion03.polimorfismo;

public class Zoologico {

    public static void main(String[] args) {
        // Es cuando una superclase toma la forma de cualquiera de sus subclases
        Animal animal = new Gato("Michifu"); // polimorfismo

        gemir(animal);
        ((Gato) animal).rasguniar();

        Animal animal2 = new Perro("Firulais");

        gemir(animal2);

        ((Perro) animal2).buscar();
    }

    public static void gemir(Animal animal) {
        animal.gemido();
    }
}
