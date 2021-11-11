package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Juego implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String tipo;
	
	public Juego(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "nombre:"+this.nombre+
				"\ntipo:"+this.tipo;
	}

}
