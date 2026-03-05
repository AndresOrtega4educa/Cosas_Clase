package Protectora;

public abstract class Animal {

	protected boolean adoptado = false;;
	protected int anyoNacimiento;
	protected String nombre = null;
	protected String animalInteresado;

	public Animal(String nombre, int anyoNacimiento) {
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;

	}

	public Animal(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public void getInfoPerro() {
		System.out.println("Animal: Perro //Año de nacimiento: " + this.anyoNacimiento + " // Nombre: " + this.nombre);
	}

	public void getInfoGato() {
		System.out.println("Animal: Gato //Año de nacimiento: " + this.anyoNacimiento + " // Nombre: " + this.nombre);
	}

	public void getInfoTortuga() {
		System.out.println("Animal: Tortuga // Año de nacimiento: " + this.anyoNacimiento + " // Nombre: " + this.nombre);
	}

}
