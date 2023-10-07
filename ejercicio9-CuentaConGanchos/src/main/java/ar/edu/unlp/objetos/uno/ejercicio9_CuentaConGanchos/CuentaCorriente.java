package ar.edu.unlp.objetos.uno.ejercicio9_CuentaConGanchos;

public class CuentaCorriente extends Cuenta{

	private double limiteDeDescubierto;
	
	public CuentaCorriente() {
		this.limiteDeDescubierto = 0;
	}
	
	public CuentaCorriente(double limite) {
		this.limiteDeDescubierto = limite;
	}
	
	public double getLimiteDeDescubierto() {
		return limiteDeDescubierto;
	}


	public void setLimiteDeDescubierto(double limiteDeDescubierto) {
		this.limiteDeDescubierto = limiteDeDescubierto;
	}


	@Override
	protected boolean puedeExtraer(double monto) {
		if (super.getSaldo() + this.getLimiteDeDescubierto() >= monto) {
			return true;
		}
		return false;
	}

	
	
}
