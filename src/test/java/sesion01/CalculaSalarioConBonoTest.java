package sesion01;

import org.junit.Assert;
import org.junit.Test;
import sesion01.condicionales.CalculaSalarioConBono;

public class CalculaSalarioConBonoTest {

    @Test
    public void calcularSueldoTotalCuandoRecibeBonoTest() {
        Double sueldoActual = CalculaSalarioConBono.calcularSueldoTotal(11);
        Double sueldoEsperado = 1250.0;
        Assert.assertEquals(sueldoEsperado, sueldoActual);

    }

    @Test
    public void calcularSueldoTotalCuandoNoRecibeBonoTest() {
        Double sueldoActual = CalculaSalarioConBono.calcularSueldoTotal(5);
        Double sueldoEsperado = 1000.0;
        Assert.assertEquals("Sueldo Incorrecto",sueldoEsperado, sueldoActual);

    }

}
