package sesion03.interfaces.crud;

public class MongoDataBase implements AccesoDatos {
    @Override
    public void insertar() {
        System.out.println("Insertar desde MongoDb");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MongoDb");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MongoDb");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MongoDb");
    }
}
