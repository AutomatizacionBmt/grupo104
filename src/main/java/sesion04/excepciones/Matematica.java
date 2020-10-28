package sesion04.excepciones;

public class Matematica {

    public double dividir(double a, double b) throws Exception {
        if ( b == 0) {
            throw new Exception("El argumento b no puede ser 0");//Creando instancia de una excepcion
        }
        return a/b;
    }

    public double dividirUnCheckedException(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("El argumento b no puede ser 0");
        }
        return a/b;
    }
}
