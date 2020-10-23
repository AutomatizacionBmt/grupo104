package sesion03.interfaces.crud;

public interface AccesoDatos {

    int MAX_REGISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
