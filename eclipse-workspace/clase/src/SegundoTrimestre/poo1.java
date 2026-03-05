package SegundoTrimestre;

public class poo1 {

	public static void main(String[] args) { // la clase main solo se pone en una de las clases dentro del mismo paquete

		Persona persona1 = new Persona("Lucía", "Sanz"); // esto es un objeto del tipo "Persona"
		persona1.mostrar();
		// Por cada syso debajo de persona va sumando 1 al getnumPersonas.
		System.out.println(persona1.getnumPersonas());

		Persona persona2; // esto es una variable de tipo persona pero no es un objeto porque no está
							// inicializada con el constructor

		persona2 = new Persona("Pepe", "Potamo", 57);// ahora si que sería un objeto
		persona2.mostrar();
		System.out.println(persona2.getnumPersonas());

		// Formas de destruir objetos:

		/* Forma 1 */// persona2 = null;
		/* Forma 2 */persona2 = new Persona("Alberto", "Pérez", 57);
		persona2.mostrar();

		System.out.println(persona2.getnumPersonas());

	}

}
