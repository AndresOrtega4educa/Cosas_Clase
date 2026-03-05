package Protectora;

public class Perro extends Animal {

	private String nombre;
	private int anyoNacimiento;

	public Perro(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);

	}
	
	public Perro(int anyoNacimiento) {
		super(anyoNacimiento);
	}
	

	public boolean estaVacunado() {
		return true;
	}

	public void mostrar() {
		System.out.println("Los datos del perro son: \n" + this.nombre + " // " + this.anyoNacimiento);
	}

}
