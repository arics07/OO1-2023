package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super.depositar(0);
	}
	
	public CajaDeAhorro(double monto) {
		super.depositar(monto*0.98);
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= 1.02*monto) {
			return true;
		}
		return false;
	}

	@Override
	public void depositar(double monto) {
		super.depositar(monto*0.98);
	}
	
	@Override
	public void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto*1.02);
	}
	
}
