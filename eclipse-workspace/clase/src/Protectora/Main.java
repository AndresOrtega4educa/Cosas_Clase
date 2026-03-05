package Protectora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Perro perro1 = new Perro("Toby", 2023);
		Perro perro2 = new Perro("Max", 2013);
		Perro perro3 = new Perro("Well", 2022);
		Perro perro4 = new Perro("Pepe", 2020);
		Perro perro5 = new Perro("Kaprekar", 2024);

		Gato gato1 = new Gato("Luis", 2022);
		Gato gato2 = new Gato("Coldo", 2012);
		Gato gato3 = new Gato("Goyo", 2018);
		Gato gato4 = new Gato("Armando", 2015);
		Gato gato5 = new Gato("Enrique", 2023);

		Tortuga tortuga1 = new Tortuga("Banjo", 2002);
		Tortuga tortuga2 = new Tortuga("Benja", 2001);
		Tortuga tortuga3 = new Tortuga("Gabi", 2005);
		Tortuga tortuga4 = new Tortuga("Alex", 2003);
		Tortuga tortuga5 = new Tortuga("Frodo", 2010);

		Scanner teclado = new Scanner(System.in);
		String entrada;

		do {
		    System.out.print("¿Qué animal deseas adoptar?\nPerro - Gato - Tortuga: ");
		    entrada = teclado.nextLine();

		    if (entrada.equalsIgnoreCase("Perro")) {
		    	System.out.println("");
		        perro1.getInfoPerro();
		        System.out.println("\n--------------------------------------------------------\n");
		        perro2.getInfoPerro();
		        System.out.println("\n--------------------------------------------------------\n");
		        perro3.getInfoPerro();
		        System.out.println("\n--------------------------------------------------------\n");
		        perro4.getInfoPerro();
		        System.out.println("\n--------------------------------------------------------\n");
		        perro5.getInfoPerro();

		    } else if (entrada.equalsIgnoreCase("Gato")) {
		    	System.out.println("");
		        gato1.getInfoGato();
		        System.out.println("\n--------------------------------------------------------\n");
		        gato2.getInfoGato();
		        System.out.println("\n--------------------------------------------------------\n");
		        gato3.getInfoGato();
		        System.out.println("\n--------------------------------------------------------\n");
		        gato4.getInfoGato();
		        System.out.println("\n--------------------------------------------------------\n");
		        gato5.getInfoGato();

		    } else if (entrada.equalsIgnoreCase("Tortuga")) {
		    	System.out.println("");
		        tortuga1.getInfoTortuga();
		        System.out.println("\n--------------------------------------------------------\n");
		        tortuga2.getInfoTortuga();
		        System.out.println("\n--------------------------------------------------------\n");
		        tortuga3.getInfoTortuga();
		        System.out.println("\n--------------------------------------------------------\n");
		        tortuga4.getInfoTortuga();
		        System.out.println("\n--------------------------------------------------------\n");
		        tortuga5.getInfoTortuga();

		    } else if (entrada.equals("Salir")) {
		    	System.out.println("\nMuy bien hasta la proxima.");
		    }
		    
		    else {
		        System.out.println("Entrada no válida, vuelve a intentar.\n");
		    }

		} while (!entrada.equalsIgnoreCase("Perro") &&
		         !entrada.equalsIgnoreCase("Gato") &&
		         !entrada.equalsIgnoreCase("Tortuga") &&
		         !entrada.equalsIgnoreCase("Salir"));

		teclado.close();

	
		/*
		 * cliente1.mostrar();
		 * System.out.println("\n---------------------------------------------------\n")
		 * ; cliente2.mostrar();
		 * System.out.println("\n---------------------------------------------------\n")
		 * ; animal1.getInfo();
		 * System.out.println("\n---------------------------------------------------\n")
		 * ;
		 */

	}
}

//+++++++++Terminar Programa+++++++++++++
//Arreglar bucle do-while para salir sin break.
//Añadir array de 3(perros), de 2(gatos) y de 1(tortuga) a clientes.
//Crear Función adoptar (mete los animales en el array de clientes.
//Crear la función vacunar después de ejecutar adoptar.
//Mostrar en la info de cliente el array de animales.
