package ficheros;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Boletín1Ej2 {

	public static void main(String[] args) {
		// Escribe una función que nos cuente el número de líneas
		// y de caracteres que hay en un fichero.
		// La llamada a la función debería de ser como esta:
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

		ArrayList<String> lineas = estadisticas(nombreFichero);
		if (lineas != null) {
			System.out.println("\n" + lineas + "\n");

		} else {
			System.out.println("El fichero está vacio o ha ocurrido un error al leerlo");
		}

	}

	public static boolean existeElFichero(String fichero) {
		File f = new File(fichero);
		return (f.isFile());
	}

	public static ArrayList<String> estadisticas(String fichero) {
int contL =0;
int contLB = 0;
int cantC=0;
int cantEsp=0;

		ArrayList<String> lineas = null;
		Path f = Path.of(fichero);
		try {
			lineas = (ArrayList<String>) Files.readAllLines(f);
		} catch (Exception e) {
			System.out.printf("Error con el fichero %s\n", fichero);
			System.out.println(e.getMessage());
		}
		
		for(String linea : lineas)
			c

		System.out.printf("Número de líneas: %d",contL);
		System.out.printf("Líneas en blanco: %d",contLB);
		System.out.printf("Cantidad de caracteres sin contar los espacios: %d",cantC);
		System.out.printf("Cantidad de espacios: %d",cantEsp);
		
		return lineas;

	}

}
//Ruta del archivo (hacer ctrl + c crtl + v)
//home/alumno/kk.txt



