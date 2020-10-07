package sesion01;

import org.junit.Assert;
import org.junit.Test;

public class CalculaSalarioBrutoTest {

    @Test
    public void obtenerSalarioTest() {
        Double salarioActual = CalculaSalarioBruto.obtenerSalario(8, 12);
        Double salarioEsperado = 96.0;

        Assert.assertEquals("Salario incorrecto", salarioEsperado, salarioActual);
    }

}
