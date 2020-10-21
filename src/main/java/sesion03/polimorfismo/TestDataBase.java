package sesion03.polimorfismo;

public class TestDataBase {

    public static void main(String[] args) {
        Database database = new SqlDataBase();

        conectar(database);
    }

    private static void conectar(Database database) {
        database.conectar();
    }
}
