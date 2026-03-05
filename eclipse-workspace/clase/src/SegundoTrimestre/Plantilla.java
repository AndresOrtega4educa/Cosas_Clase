package SegundoTrimestre;

public class Plantilla {
	protected String nombre = "";
	protected String apellido = "";

	public Plantilla(String nom, String ape) {
		this.nombre = nom;
		this.apellido = ape;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

}

class Profesor extends Plantilla {
	public Profesor(String nom, String ape) {
		super(nom, ape);
	}
	public String getNombreCompleto() {
		return "Señor Don " + super.getNombreCompleto();
	}
}

class Alumno extends Plantilla {
	public Alumno(String nom, String ape) {
		super(nom, ape);
	}
}


	
