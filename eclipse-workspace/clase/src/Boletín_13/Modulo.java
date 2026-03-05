package Boletín_13;

public class Modulo {
	private String nombre;
	private int horasSemanales;
	private int curso;
	private boolean optativa;

	public Modulo(String nombre, int horasSemanales, int curso, boolean optativa) {

		this.nombre = nombre;
		this.horasSemanales = horasSemanales;
		this.curso = curso;
		this.optativa = optativa;

	}

	public int getCurso() {
		return this.curso;
	}

	public String getNombre() {
		return this.nombre;
	}
	

}
