package ar.edu.unlp.objetos.uno.ejercicio4_figurasYCuerpos;

public class Cuerpo3D {

	private double altura;
	private Figura2D caraBasal;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return (this.altura*this.caraBasal.getArea());
	}
	
	public double getSuperficieExterior() {
		return (2*this.caraBasal.getArea()+this.altura*this.caraBasal.getPerimetro());
	}
}
