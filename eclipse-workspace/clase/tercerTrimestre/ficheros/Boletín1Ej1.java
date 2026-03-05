package ficheros;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Boletín1Ej1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		boolean existe = false;
		String nombreFichero = null;

		while (existe == false) {
			System.out.print("Escribe el nombre del fichero: ");
			nombreFichero = teclado.nextLine();
			existe = existeElFichero(nombreFichero);
			if (existe == false)
				System.out.printf("El fichero %s no existe\n", nombreFichero);
		}

		ArrayList<String> lineas = devuelveContenido(nombreFichero);
		if (lineas != null) {
			System.out.println("\n"+lineas+"\n");

			System.out.print("Introduce la palabra a buscar: ");
			
			String palabra = teclado.nextLine();

			System.out.printf("El fichero %s tiene %d líneas\n",nombreFichero, lineas.size());
			int contador = 0;
			for (String linea : lineas)
				contador += cuentaPalabras(linea, palabra);
			System.out.printf("La palabra '%s' aparece %d veces", palabra, contador);
		} else {
			System.out.println("El fichero está vacio o ha ocurrido un error al leerlo");
		}

	}

	public static boolean existeElFichero(String fichero) {
		File f = new File(fichero);
		return (f.isFile());
	}

	public static ArrayList<String> devuelveContenido(String fichero) {
		ArrayList<String> lineas = null;
		Path f = Path.of(fichero);
		try {
			lineas = (ArrayList<String>) Files.readAllLines(f);
		} catch (Exception e) {
			System.out.printf("Error con el fichero %s\n", fichero);
			System.out.println(e.getMessage());
		}

		return lineas;
	}

	public static int cuentaPalabras(String linea, String palabra) {
		String[] palabras = linea.split("\\s+");
		int contador = 0;
		for (String p : palabras)
			if (palabra.equalsIgnoreCase(p))
				contador++;
		return contador;
	}
}
