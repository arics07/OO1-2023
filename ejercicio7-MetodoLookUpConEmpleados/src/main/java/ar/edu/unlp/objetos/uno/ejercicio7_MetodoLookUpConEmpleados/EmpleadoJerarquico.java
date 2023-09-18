package ar.edu.unlp.objetos.uno.ejercicio7_MetodoLookUpConEmpleados;

public class EmpleadoJerarquico extends Empleado {
	
	public EmpleadoJerarquico(String nombre) {
		this.nombre = nombre;
	}
	
	public EmpleadoJerarquico() {
		
	}

	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	
	
}
