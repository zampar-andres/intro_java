package entidad;

import java.util.*;

/**
 * 
 * @author Andres Zampar
 *
 */
public class Alumno {

	private String name; // atributo para el nombre
       
	private List<Integer> notas; // creamos la lista de notas
	
	public Alumno() {
		this.notas = new ArrayList<Integer>(); // creamos la memoria de la lista de notas
	}

	public Alumno(String name, List<Integer> notas) {
		this.name = name;
		this.notas = notas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "[ Alumno ] \nNombre = " + name + " \nNotas = " + notas;
	}

	
}