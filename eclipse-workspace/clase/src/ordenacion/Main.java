package ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList(List.of(7, 1, 3, 5, 4, 6, 2));
		ArrayList<Integer> desordenada = new ArrayList(List.of(7, 1, 3, 5, 4, 6, 2));
		System.out.println(ordenarPorSeleccion(desordenada));
		ArrayList<Integer> ordenada2 = ordenarPorBurbuja(numeros);
		System.out.println(ordenada2);

	}

	public static ArrayList<Integer> ordenarPorSeleccion(ArrayList<Integer> desordenada) {
		ArrayList<Integer> ordenada = new ArrayList<>();

		while (desordenada.size() !=0) {
			int mayor = -1;

			for (int n : desordenada) {
				if (n > mayor) {
					mayor = n;
					
				}
			}
			desordenada.remove((Integer)mayor);
			ordenada.add(mayor);
		}

		return ordenada;
	}

	public static ArrayList<Integer> ordenarPorBurbuja(ArrayList<Integer> desordenada) {
		// ArrayList<Integer> ordenada = new ArrayList<>();
		boolean hayCambios = true;
		while (hayCambios == true) {
			hayCambios = false;
			for (int i = 0; i < desordenada.size() - 1; i++)
				if (desordenada.get(i + 1) > desordenada.get(i)) {
					int n = desordenada.remove(i);
					desordenada.add(i + 1, n);
					hayCambios = true;

				}

		}
		return desordenada;
	}
}
