package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class collections {

	public static void main(String[] args) {

		// Inicialización (NO METER NINGUNO DE LOS SIGUIENTES METODOS EN UN SYSO)

		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> alumnos = new ArrayList<>();

		Collections.addAll(numeros, 11, 33, 53, 67, 45, 63, 2, 2, 2, 7, 8, 75, 43);
		Collections.addAll(alumnos, "Lucía", "Marcos", "Martín", "Nick", "Daniel", "Andrea");

		System.out.println(numeros);
		System.out.println(alumnos);
		System.out.println("\nSort");

		// Metodo SORT

		Collections.sort(numeros);
		Collections.sort(alumnos);

		System.out.println(numeros);
		System.out.println(alumnos);
		System.out.println("\nShuffle");

		// Metodo SHUFFLE

		Collections.shuffle(alumnos);
		Collections.shuffle(numeros);

		System.out.println(numeros);
		System.out.println(alumnos);
		System.out.println("\nReverse");

		// Metodo REVERSE

		Collections.reverse(alumnos);
		Collections.reverse(numeros);

		System.out.println(numeros);
		System.out.println(alumnos);
		System.out.println("\nMax y Min");

		// Metodo MAX/MIN (ESTE SI SE PUEDE METER EN UN SYSO)

		System.out.println(Collections.max(numeros) + " - " + Collections.min(numeros));
		System.out.println(Collections.max(alumnos) + " - " + Collections.min(alumnos));
		System.out.println("\nFrequency");

		// Metodo FREQUENCY

		System.out.println("Veces que sale el número 2: " + Collections.frequency(numeros, 2));
		System.out.println("Veces que aparece Nick: " + Collections.frequency(alumnos, "Nick"));
		System.out.println("\nBinary Search");

		// Metodo BINARY SEARCH

		Collections.sort(numeros);
		System.out.println("Posición: " + Collections.binarySearch(numeros, 2));
		
		
	}
}
