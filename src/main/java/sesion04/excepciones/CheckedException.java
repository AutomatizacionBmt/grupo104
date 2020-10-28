package sesion04.excepciones;

public class CheckedException {

    public static void main(String[] args) throws Exception {
        Matematica matematica = new Matematica();
        // primeraForma(matematica);
        segundaForma(matematica);
    }

    private static void primeraForma(Matematica matematica) {
        try {
            double resultado = matematica.dividir(5, 0);
            System.out.println("El resultado es: " + resultado);
        } catch(Exception exc) {
            System.out.println("Entraste en la excepcion");
            System.out.println(exc.getMessage());
        }
    }

    private static void segundaForma(Matematica matematica) throws Exception {
        double resultado = matematica.dividir(5, 0);
    }
}
