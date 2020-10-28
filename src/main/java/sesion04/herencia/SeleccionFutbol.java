package sesion04.herencia;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public abstract class SeleccionFutbol {

    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;

    public SeleccionFutbol(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();//Obtengo la fecha Actual
        long dias = DAYS.between(fechaNacimiento, fechaActual);

        return (int) dias/365;
    }

    public abstract void concentrarse();
    public abstract void viajar();
}
