package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {

	@Override
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= 1.02*monto) {
			return true;
		}
		return false;
	}

	@Override
	public void depositar(double monto) {
		this.saldo += monto;	
		this.saldo -= 0.02*monto;
	}
	
	@Override
	public void extraerSinControlar(double monto) {
		this.saldo -= monto*1.02;
	}
	
}
