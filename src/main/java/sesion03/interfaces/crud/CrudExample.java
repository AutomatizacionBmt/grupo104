package sesion03.interfaces.crud;

public class CrudExample {

    public static void main(String[] args) {
        AccesoDatos accesoDatos = new MySqlDataBase();//MySqlDataBase
        System.out.println("**************** MYSQL ****************");
        operacionesBasicasBaseDatos(accesoDatos);
        operacionesLogging((Logger) accesoDatos);
        System.out.println("**************** Oracle ****************");
        accesoDatos = new OracleDataBase();
        operacionesBasicasBaseDatos(accesoDatos);
        System.out.println("**************** MongoDb ****************");
        accesoDatos = new MongoDataBase();
        operacionesBasicasBaseDatos(accesoDatos);
    }

    private static void operacionesBasicasBaseDatos(AccesoDatos accesoDatos) {
        accesoDatos.insertar();
        accesoDatos.listar();
        accesoDatos.actualizar();
        accesoDatos.eliminar();
    }

    private static void operacionesLogging(Logger logger) {
        logger.info();
        logger.error();
    }
}
