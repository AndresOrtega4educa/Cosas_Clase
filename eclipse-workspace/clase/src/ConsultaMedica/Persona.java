package ConsultaMedica;

import java.util.ArrayList;

abstract class Persona {

	protected String nombre;
	protected String apellido;
	
	protected CentroMedico centro;
	protected ArrayList<Consulta> consultas= new ArrayList();
	

	public Persona(String nombre, String apellido,CentroMedico centro) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.centro=centro;
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}
	abstract public void cambiaCentro(CentroMedico c);
	
	public CentroMedico getCentro() {
		return centro;
	}
}
