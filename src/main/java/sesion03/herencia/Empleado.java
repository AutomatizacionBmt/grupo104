package sesion03.herencia;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;

    public Empleado(String nombre, String idEmpleado, String cargo) {
        super(nombre);//inicializa valores
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public Empleado(String nombre, int edad, String genero, String idEmpleado, String cargo) {
        super(nombre, edad, genero);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    /*public String getNombre() {
        return "123 " + super.getNombre();
    }*/

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
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre='").append(this.getNombre()).append('\'');
        sb.append("edad='").append(getEdad()).append('\'');
        sb.append("genero='").append(getGenero()).append('\'');
        sb.append("idEmpleado='").append(idEmpleado).append('\'');
        sb.append(", cargo='").append(cargo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /*@Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }*/
}
