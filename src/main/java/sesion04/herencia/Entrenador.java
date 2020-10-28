package sesion04.herencia;

import java.time.LocalDate;

public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, String idFederacion) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Soy un entrenador y dirijo la concentracion");
    }

    @Override
    public void viajar() {
        System.out.println("Soy un entrenador y tambien viajo en clase A");
    }

    public void dirigirPartido() {
        System.out.println("Hoy toca dirigir a la seleccion, Vamos Perú!");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Hoy toca dirigir entrenamiento");
    }
}
