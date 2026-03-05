package SegundoTrimestre;

public class Persona {

	// Se pone private delante de las variables para que no puedan manipularse
	private String nombre;
	private String apellidos;
	private int edad = 0;
	private static int numPersonas = 0; // Ponemos static porque queremos que sea común a todos los objetos

	// Puedo guardar en el constructor los datos imprescindibles para que la clase
	// tenga identidad propia(en este caso no pongo la edad)
	public Persona(String nom, String ape) {
		this.nombre = nom;
		this.apellidos = ape;
		numPersonas++;

	}

	// Esta funcion va sumando 1 cada vez que se cruce con un objeto del tipo
	// Persona
	public int getnumPersonas() {
		return numPersonas;

	}

	// Los constructores se pueden llamar igual pero no se podrán llamar a menos que
	// se modifiquen los datos que coge o los que devuelve.
	// Lo que quiere decir que la creación del constructor tiene que ser diferente
	// pero puedes llamar al mismo constructor varias veces.
	public Persona(String nom, String ape, int edad) {
		this.nombre = nom;
		this.apellidos = ape;
		this.edad = edad;
		numPersonas++;
	}

	public void incrementaEdad() { // aquí se pone public para que pueda ejecutarse
		this.edad++;
	}

	public void mostrar() {
		System.out.println(this.apellidos + ", " + this.nombre);
	}
}
