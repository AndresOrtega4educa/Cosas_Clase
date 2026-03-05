package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Apuntes {

	public static void main(String[] args) {
		// metodo1();
		// metodo2();
		// metodo3();
		metodo4();
	}

	public static void metodo1() {
		try {
			BufferedReader lector = new BufferedReader(new FileReader("/home/alumno/quijote.txt"));

			// SEGUNDA FORMA DE LEER UN FICHERO, ESTE A JOSEMARÍA LE GUSTA MÁS
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea);
			}
			// PRIMERA FORMA DE LEER UN FICHERO(A JOSEMARÍA NO LE ENTUSIASMA
			/*
			 * do { linea = lector.readLine(); if(linea!=null) System.out.println(linea);
			 * }while(linea !=null);
			 */

			lector.close();
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
	}

	public static void metodo2() {
		try {
			File fichero = new File("/home/alumno/quijote.txt");
			Scanner lector = new Scanner(fichero);

			String linea;
			while (lector.hasNextLine()) {
				linea = lector.nextLine();
				System.out.println(linea);
			}

			lector.close();
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
	}

	public static void metodo3() {
		ArrayList<String> lineas = null;
		try {
			Path fichero = Path.of("/home/alumno/quijote.txt");
			lineas = (ArrayList) Files.readAllLines(fichero);

		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
		for (String linea : lineas)
			System.out.println(linea);
	}

	public static void metodo4() {
		Path fichero = Path.of("/home/alumno/quijote.txt");
		String contenido = null;
		try {
			contenido = Files.readString(fichero);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}
		System.out.println(contenido);
	}

}
