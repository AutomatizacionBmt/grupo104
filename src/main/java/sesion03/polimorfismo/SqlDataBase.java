package sesion03.polimorfismo;

public class SqlDataBase extends Database {

    @Override
    public void conectar() {
        System.out.println("Nos hemos conectado a SQl Server");
    }
}
