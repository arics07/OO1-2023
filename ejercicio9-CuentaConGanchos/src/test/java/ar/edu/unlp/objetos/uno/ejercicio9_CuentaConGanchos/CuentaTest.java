package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CuentaTest {

	@Test
    public void testDepositar() {
        Cuenta cuenta = new CuentaCorriente(); // Usar CuentaCorriente o CajaDeAhorro según corresponda
        cuenta.depositar(100);
        assertEquals(100, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testExtraer() {
        Cuenta cuenta = new CuentaCorriente(); // Usar CuentaCorriente o CajaDeAhorro según corresponda
        cuenta.depositar(200);
        assertTrue(cuenta.extraer(150));
        assertEquals(50, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testTransferirACuenta() {
        Cuenta cuentaOrigen = new CuentaCorriente(); // Usar CuentaCorriente o CajaDeAhorro según corresponda
        cuentaOrigen.depositar(300);
        Cuenta cuentaDestino = new CuentaCorriente(); // Usar CuentaCorriente o CajaDeAhorro según corresponda
        assertTrue(cuentaOrigen.transferirACuenta(200, cuentaDestino));
        assertEquals(100, cuentaOrigen.getSaldo(), 0.001);
        assertEquals(200, cuentaDestino.getSaldo(), 0.001);
    }

}
