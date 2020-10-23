package sesion03.interfaces.crud;

public class MySqlDataBase implements AccesoDatos, Logger {
    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }

    @Override
    public void info() {
        System.out.println("**************** MYSQL INFO *****************");
    }

    @Override
    public void error() {
        System.out.println("**************** MYSQL ERROR *****************");
    }
}
