package sesion04.excepciones;

public class UnCheckedException {

    public static void main(String[] args) {
        Matematica matematica = new Matematica();

        double resultado = matematica.dividirUnCheckedException(5, 10);
        System.out.println("El resultado es: " + resultado);

        String[] nombres = {"Giancarlo", "Elvis"};
        try {
            System.out.println("My name is: " + nombres[1]);//ArrayInde.....
            System.out.println(5/0); //ArithmeticE......
        } catch(ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            System.out.println("Ocurrió una excepcion " + exception.getMessage());
        }
    }
}
