package Boletín_13;

public class Alumno extends Persona {

	private int edad;
	private boolean mayordeEdad = false;

	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido);
		this.edad = edad;
		if (edad >= 18)
			this.mayordeEdad = true;
	}

	
	}

