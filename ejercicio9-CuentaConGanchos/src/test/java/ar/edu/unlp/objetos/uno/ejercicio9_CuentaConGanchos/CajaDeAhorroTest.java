package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	
	@Test
    public void testPuedeExtraer() {
        CajaDeAhorro cuenta = new CajaDeAhorro(1000);
        assertTrue(cuenta.extraer(980));
    }

    @Test
    public void testNoPuedeExtraer() {
        CajaDeAhorro cuenta = new CajaDeAhorro(1000);
        assertFalse(cuenta.extraer(1000));
    }

}
