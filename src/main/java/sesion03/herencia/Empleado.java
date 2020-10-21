package sesion03.herencia;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;

    public Empleado(String nombre, int edad, String genero, String idEmpleado, String cargo) {
        super(nombre, edad, genero);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
