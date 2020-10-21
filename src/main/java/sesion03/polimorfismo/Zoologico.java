package sesion03.polimorfismo;

import sesion03.abstraccion.Rectangulo;

public class Zoologico {

    public static void main(String[] args) {
        // Es cuando una superclase toma la forma de cualquiera de sus subclases
        Animal animal = new Gato("Michifu"); // polimorfismo

        gemir(animal);
        //((Gato) animal).rasguniar();// Casteando para poder acceder a los metodos propios de la clase Gato

        ((Gato) animal).rasguniar();

        Animal animal2 = new Perro("Firulais");

        gemir(animal2);

        //((Perro) animal2).buscar();// Casteando para poder acceder a los metodos propios de la clase Perro
    }

    public static void gemir(Animal animal) {
        if(animal instanceof Gato) {
            ((Gato) animal).rasguniar();
        } else if(animal instanceof Perro) {
            ((Perro) animal).buscar();
        }

        animal.gemido();
    }
}
