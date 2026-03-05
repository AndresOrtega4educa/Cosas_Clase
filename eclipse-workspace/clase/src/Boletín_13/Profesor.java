package Boletín_13;

public class Profesor extends Persona {

	private String departamento = null;
	private Grupo tutoria = null;

	public Profesor(String nombre, String apellido, String departamento) {
		super(nombre, apellido);
		if (!departamento.equalsIgnoreCase("Informática") && !departamento.equalsIgnoreCase("Inglés")
				&& !departamento.equalsIgnoreCase("Empresa"))

			System.err.println("ERROR: Departamento no válido!");
		else
			this.departamento = departamento.toUpperCase();
	}

	public void setTutoria(Grupo grupo) {
		this.tutoria = grupo;
	}

	public String getNombre() {
		return this.apellido + ", " + this.nombre;
	}
}
