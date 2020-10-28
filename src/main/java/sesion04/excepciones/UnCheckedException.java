package sesion04.excepciones;

public class UnCheckedException {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();

        double resultado = matematica.dividirUnCheckedException(5, 0);
        System.out.println("El resultado es: " + resultado);
    }
}
