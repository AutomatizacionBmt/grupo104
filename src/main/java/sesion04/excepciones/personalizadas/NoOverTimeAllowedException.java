package sesion04.excepciones.personalizadas;

public class NoOverTimeAllowedException extends RuntimeException {

    private String message;

    public NoOverTimeAllowedException(String message) {
        super(message);
    }
}
