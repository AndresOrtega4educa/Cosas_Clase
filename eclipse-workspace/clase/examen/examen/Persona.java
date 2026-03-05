package examen;

abstract public class Persona {

	protected String nombre;
	protected String codigo;
	protected double salario;

	public Persona(String nombre, String codigo, double salario) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.salario = salario;
	}
}
