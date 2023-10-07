package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	
	 @Test
	 public void testPuedeExtraer() {
	     CuentaCorriente cuenta = new CuentaCorriente(5000);
	     cuenta.depositar(3000);
	     assertTrue(cuenta.extraer(8000));
	 }

	 @Test
	 public void testNoPuedeExtraer() {
	     CuentaCorriente cuenta = new CuentaCorriente(5000);
	     cuenta.depositar(3000);
	     assertFalse(cuenta.extraer(9000));
	 }

}
