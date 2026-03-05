package examen;

public class Programador extends Persona {

	private boolean java;
	private boolean python;

	public Programador(String nombre, String codigo, double salario, boolean java, boolean python) {
		super(nombre, codigo, salario);
		this.java = java;
		this.python = python;
	}

	public void crearEmpleado() {
		if (java == true && python == false) {
			System.out.println(nombre + ". " + "Código " + codigo + ". " + "Lenguajes de programación: Java. "
					+ "Salario Base: " + salario + "€");
		} else if (java == true && python == true) {
			System.out.println(nombre + ". " + "Código " + codigo + ". " + "Lenguajes de programación: Java y Python. "
					+ "Salario Base: " + salario + "€");
		} else if (java == false && python == true) {
			System.out.println(nombre + ". " + "Código " + codigo + ". " + "Lenguajes de programación: Python. "
					+ "Salario Base: " + salario + "€");
		} else if (java == false && python == false) {
			System.out.println(nombre + ". " + "Código " + codigo + ". " + "Lenguajes de programación: Ninguno. "
					+ "Salario Base: " + salario + "€");
		}
	}

	public void calcularSalarios() {

		if (java == true && python == false) {
			System.out.println("El salario total de " + nombre + " (" + codigo + ") es de " + (salario + 200));
		} else if (java == true && python == true) {
			System.out.println("El salario total de " + nombre + " (" + codigo + ") es de " + (salario + 400));
		} else if (java == false && python == true) {
			System.out.println("El salario total de " + nombre + " (" + codigo + ") es de " + (salario + 200));
		} else if (java == false && python == false) {
			System.out.println("El salario total de " + nombre + " (" + codigo + ") es de " + salario);
		}

	}
}
