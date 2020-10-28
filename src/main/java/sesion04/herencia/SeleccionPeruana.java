package sesion04.herencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeleccionPeruana {

    private static List<SeleccionFutbol> seleccionados = new ArrayList<>();

    public static void main(String[] args) {
        SeleccionFutbol entrenador = new Entrenador(1, "Ricardo", "Garecca", LocalDate.of(1950, 9, 30), "FPF0001");
        SeleccionFutbol paoloGuerrero = new Futbolista(2, "Paolo", "Guerrero", LocalDate.of(1995, 6, 21), "Delantero", 9);
        SeleccionFutbol masajista = new Masajista(3, "Jose", "Hurtado", LocalDate.of(1978, 7, 31), 5);

        seleccionados.add(entrenador);
        seleccionados.add(paoloGuerrero);
        seleccionados.add(masajista);

        for(SeleccionFutbol seleccionFutbol : seleccionados) {
            imprimirCaracteristicas(seleccionFutbol);
        }

        // seleccionados.forEach(SeleccionPeruana::imprimirCaracteristicas);
    }

    private static void imprimirCaracteristicas(SeleccionFutbol seleccionFutbol) {
        System.out.println("*******************************");
        if (seleccionFutbol instanceof Entrenador) {
            System.out.println("Soy un entrenador y mis datos son: ");
            imprimirDatosComunes(seleccionFutbol);
            ((Entrenador) seleccionFutbol).dirigirPartido();
            ((Entrenador) seleccionFutbol).dirigirEntrenamiento();
        } else if(seleccionFutbol instanceof Futbolista) {
            System.out.println("Soy un futbolista y mis datos son: ");
            imprimirDatosComunes(seleccionFutbol);
            Futbolista futbolista = (Futbolista) seleccionFutbol;
            futbolista.jugarPartido();
            futbolista.entrenar();
            System.out.println("Mi numero de camiseta es: " + futbolista.getNumeroCamiseta());
        } else if(seleccionFutbol instanceof Masajista) {
            System.out.println("Soy un masajista y mis datos son: ");
            imprimirDatosComunes(seleccionFutbol);
            ((Masajista) seleccionFutbol).darMasaje();
        }
    }

    private static void imprimirDatosComunes(SeleccionFutbol seleccionFutbol) {
        System.out.println("Id: " + seleccionFutbol.getId() + " Nombre: " + seleccionFutbol.getNombre() + " Apellidos: " +
                seleccionFutbol.getApellidos() + " Fecha Nacimiento: " + seleccionFutbol.getFechaNacimiento() +
                " Edad: " + seleccionFutbol.calcularEdad());
        System.out.println("Concentración");
        seleccionFutbol.concentrarse();
        System.out.println("Viaje");
        seleccionFutbol.viajar();
    }
}
