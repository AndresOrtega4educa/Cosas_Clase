package Protectora;

public class Gato extends Animal {

	private String nombre;
	private int anyoNacimiento;

	public Gato(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);
	}
	
	public Gato(int anyoNacimiento) {
		super(anyoNacimiento);
	}

	public boolean estaVacunado() {
		return true;
	}

	public void mostrar() {
		System.out.println("Los datos del gato son: \n" + this.nombre + " // " + this.anyoNacimiento);
	}

}
