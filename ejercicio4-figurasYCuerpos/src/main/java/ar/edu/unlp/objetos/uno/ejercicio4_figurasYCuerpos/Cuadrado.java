package ar.edu.unlp.objetos.uno.ejercicio4_figurasYCuerpos;

public class Cuadrado implements Figura2D {

	private double lado;

	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return (this.lado*4);
	}
	
	public double getArea() {
		return (this.lado*this.lado);
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}
