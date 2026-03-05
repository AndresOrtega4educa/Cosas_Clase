package Protectora;

public class Tortuga extends Animal {
	
	private String nombre;
	private int anyoNacimiento;
	
	public Tortuga(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);

	}
	
	public Tortuga(int anyoNacimiento) {
		super(anyoNacimiento);
	}

	
	public boolean esTerrestre() {
		return true;
	}
	
	public boolean esMarina() {
		return false;
	}
	
	public void mostrar() {
		System.out.println("Los datos de la tortuga son: \n" + this.nombre + " // " + this.anyoNacimiento);
	}

	
}
