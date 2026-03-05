package apuntesExamenJueves;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Apuntes {

	public static void main(String[] args) {
		// ArrayList:
		ArrayList<String> nombres = new ArrayList<>();

		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Ana"); // permite duplicados

		System.out.println(nombres.get(0));

		// HashSets:
		HashSet<String> conjunto = new HashSet<>();

		conjunto.add("Rojo");
		conjunto.add("Azul");
		conjunto.add("Rojo"); // No se añade

		// HashMaps:
		HashMap<String, Integer> edades = new HashMap<>();

		edades.put("Ana", 20);
		edades.put("Luis", 25);

		System.out.println(edades.get("Ana"));

		// Recorrer colecciones:

		// For each:
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// Iterator:
		Iterator<String> iterador = nombres.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
