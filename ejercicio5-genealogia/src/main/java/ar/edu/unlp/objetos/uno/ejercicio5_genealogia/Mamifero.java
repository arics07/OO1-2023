package ar.edu.unlp.objetos.uno.ejercicio5_genealogia;

import java.util.Date;

public class Mamifero {

	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre) {
		this.identificador = nombre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.madre != null)
			return this.madre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.padre != null)
			return this.padre.getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null)
			return this.madre.getMadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.padre != null)
			return this.padre.getMadre();
		else
			return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		
		// Comprobar si el mamifero actual es igual al mamifero que busco
		if (this != null && (this.getMadre() == unMamifero || this.getPadre() == unMamifero))  {
	        return true;
	    }

	    // Comprobar si la madre es ancestro
	    if (madre != null && madre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }
	    
	    // Comprobar si el padre es ancestro
	    if (padre != null && padre.tieneComoAncestroA(unMamifero)) {
	        return true;
	    }

	    // Si no se encontró como ancestro en ninguna rama, retornar falso
	    return false;
	}

}
