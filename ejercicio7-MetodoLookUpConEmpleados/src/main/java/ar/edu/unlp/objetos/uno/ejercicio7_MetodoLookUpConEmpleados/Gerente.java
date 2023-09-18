package ar.edu.unlp.objetos.uno.ejercicio7_MetodoLookUpConEmpleados;

public class Gerente extends EmpleadoJerarquico{

	public Gerente(String nombre) {
		this.nombre = nombre;
	}
	
	public Gerente() {
		
	}
	
	public double montoBasico() {
		return 57000;
	}
	
	public double aportes() {
		return this.montoBasico()*0.05d;
	}
}
