package Boletín_13;

abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad = 0;
	protected String ciclo;
	protected String grupo;
	protected boolean esMayor;

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellido = apellidos;
	}
	public String getNombre() {
		return this.apellido + ", " + this.nombre;
	}
}
