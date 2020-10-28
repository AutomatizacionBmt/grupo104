package sesion04.excepciones.personalizadas;

public class HorarioPermitido {

    public static void main(String[] args) {
        int horas = 50;

        if (horas > 48) {
            throw new NoOverTimeAllowedException("Horas extras no estan permitidas");
        }

    }
}
