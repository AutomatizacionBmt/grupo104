package sesion04.herencia;

import java.time.LocalDate;

public class Futbolista extends SeleccionFutbol {

    private String posicion;
    private Integer numeroCamiseta;

    public Futbolista(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, String posicion, Integer numeroCamiseta) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public void concentrarse() {
        System.out.println("He venido a concentrarme");
    }

    @Override
    public void viajar() {
        System.out.println("Soy un Futbolista y viajo en clase A");
    }

    public void jugarPartido() {
        System.out.println("Soy un Futbolista y me encanta Jugar");
    }

    public void entrenar() {
        System.out.println("He venido a entrenar");
    }
}
