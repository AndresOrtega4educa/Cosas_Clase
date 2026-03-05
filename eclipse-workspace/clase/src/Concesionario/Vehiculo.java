package Concesionario;

public abstract class Vehiculo {

	protected String matricula;
	protected int anyoFabricacion;
	protected String nombre;

	public Vehiculo(String matricula, int anyoFabricacion, String nombre) {
		this.matricula = matricula;
		this.anyoFabricacion = anyoFabricacion;
		this.nombre = nombre;
	}

	public String getInfo() {
		return this.matricula + "-" + this.anyoFabricacion + "-" + this.nombre;
	}

}
