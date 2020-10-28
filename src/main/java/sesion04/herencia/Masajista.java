package sesion04.herencia;

import java.time.LocalDate;

public class Masajista extends SeleccionFutbol {

    private Integer aniosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, LocalDate fechaNacimiento, Integer aniosExperiencia) {
        super(id, nombre, apellidos, fechaNacimiento);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("En la concentracion verifico que nadie se lesione");
    }

    @Override
    public void viajar() {
        System.out.println("Como soy masajista me envian en clase C");
    }

    public void darMasaje() {
        System.out.println("He venido a darte un masaje");
    }
}
