package ar.edu.unlp.objetos.uno.ejercicio7_MetodoLookUpConEmpleados;

public class Empleado {

	protected String nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico()+this.aportes();
	}
}
