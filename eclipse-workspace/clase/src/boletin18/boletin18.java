package boletin18;

import java.util.Arrays;
import java.util.HashSet;

public class boletin18 {

	public static void main(String[] args) {

		// Ejercicio1

		HashSet<Integer> numerosPrimos = new HashSet<>(Arrays.asList((int) (Math.random() * 100) + 1));

		HashSet<Integer> conjunto1 = new HashSet<>();

		int contador = 0;
		boolean primo = false;
		int numero = 0;
		do {
			do {
				primo = true;
				numero = (int) (Math.random() * 100) + 1;
				for (int i = 2; i < numero - 1; i++) {
					if (numero % i == 0)
						primo = false;
				}
			} while (primo == false);
			conjunto1.add(numero);
			contador++;

		} while (conjunto1.size() < 10);
		System.out.println("conjunto1: "+conjunto1);
		
		HashSet<Integer> numerosPrimos2 = new HashSet<>(Arrays.asList((int) (Math.random() * 100) + 1));

		HashSet<Integer> conjunto2 = new HashSet<>();

		int contador2 = 0;
		do {
			do {
				primo = true;
				numero = (int) (Math.random() * 100) + 1;
				for (int i = 2; i < numero - 1; i++) {
					if (numero % i == 0)
						primo = false;
				}
			} while (primo == false);
			conjunto2.add(numero);
			contador++;

		} while (conjunto2.size() < 10);
		System.out.println("conjunto2:" +conjunto2);
		
		
		
		
		
		
	}
}
