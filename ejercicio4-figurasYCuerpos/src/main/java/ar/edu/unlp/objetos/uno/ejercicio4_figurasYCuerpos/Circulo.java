package ar.edu.unlp.objetos.uno.ejercicio4_figurasYCuerpos;

public class Circulo implements Figura2D {

	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio*2;
	}
	
	public void setDiametro(double diametro) {
		this.radio = diametro/2;
	}
	
	public double getPerimetro() {
		return (2*Math.PI*this.radio);
	}
	
	public double getArea() {
		return (Math.PI*this.radio*this.radio);
	}
	
	
}
