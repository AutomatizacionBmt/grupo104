package sesion03.polimorfismo;

public class OracleDataBase extends Database {

    @Override
    public void conectar() {
        System.out.println("Nos hemos conectado a Oracle Server");
    }
}
