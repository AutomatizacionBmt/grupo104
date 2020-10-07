package sesion01;

import org.junit.Assert;
import org.junit.Test;

public class CalificadorPrestamoTest {

    @Test
    public void calificadorPrestamoCuandoCalificaParaElPrestamoTest() {
        boolean resultadoActual = CalificadorPrestamo.estaCalificadoAlPrestamo(3000, 2);
        Assert.assertTrue(resultadoActual);
    }

    @Test
    public void calificadorPrestamoCuandoNoCalificaParaElPrestamoTest() {
        boolean resultadoActual = CalificadorPrestamo.estaCalificadoAlPrestamo(1500, 2);
        Assert.assertFalse(resultadoActual);
    }
}
