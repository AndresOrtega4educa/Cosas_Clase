package Protectora;

public class Clientes {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	private Animal animalInteresado;
	private Gato[] gatos = new Gato[2];
	private Perro[] perros = new Perro[3];
	private Tortuga[] tortugas = new Tortuga[1];
	
	public Clientes(String nombre, String apellido, int edad, int telefono, Perro animalInteresado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.animalInteresado = animalInteresado;
	}
	
	public Clientes(String nombre, String apellido, int edad, int telefono, Gato animalInteresado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.animalInteresado = animalInteresado;
	}
	
	public Clientes(String nombre, String apellido, int edad, int telefono, Tortuga animalInteresado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.animalInteresado = animalInteresado;
	}

	public void mostrar() {
		System.out.println("Los datos del cliente son: \n" + "\nNombre: " + this.nombre + " //" + " Apellido: " + this.apellido + " //"+ " Edad: " + this.edad + " //" + " Teléfono: " + this.telefono + " //" + " Animal a adoptar: "+this.animalInteresado);
	}
	
}






