package Colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {

		// --------------------------|
		// Lists --> ArrayList |
		// Sets --> HashSet |
		// Diccionarios --> HashMap |
		// --------------------------|

		// Método PUT y REMOVE

		HashMap<String, Double> sueldos = new HashMap<>();
		sueldos.put("José María Morales", 3567.44);
		sueldos.put("Akito Koteta", 2897.33);
		sueldos.put("Marcos Tao", 1755.84);
		sueldos.put("Armando Bronca", 1795.65);
		sueldos.put("Kerry Cachota", 2013.54);

		System.out.println(sueldos);

		sueldos.put("José María Morales", 5000.00);
		System.out.println(sueldos);

		String nombre = "Pepe Pótamo";
		// sueldos.remove(nombre);

		// Iteración de un HashMap

		for (Entry<String, Double> persona : sueldos.entrySet()) {
			System.out.printf("%s: %.2f", persona.getKey(), persona.getValue());
		}

		// Nombres y sueldos
		for (String persona : sueldos.keySet()) {
			System.out.printf("%s: %s€\n", persona, sueldos.get(persona));
		}

		// Salarios
		for (Double sueldo : sueldos.values()) {
			System.out.printf("%.2f\n", sueldo);
		}

		// METODO ITERATOR
		
		System.out.println("\nIterator\n");
		
		Iterator<Map.Entry<String, Double>> iterador = sueldos.entrySet().iterator();
		while (iterador.hasNext()) {
			Map.Entry<String, Double> persona = iterador.next();
			System.out.printf("%s: %.2f\n", persona.getKey(), persona.getValue());
		} 
		
		//OTRO METODO ITERATOR
		
		Iterator<String> iterador2 = sueldos.keySet().iterator();
		while (iterador2.hasNext()) {
			String nombre3 =  iterador2.next();
			System.out.printf("it2- %s: %.2f\n", nombre3, sueldos.get(nombre3));
		}
		
		// NO APRENDER (FUNCION LAMBDA)

		sueldos.forEach((nombre2, sueldo2) -> System.out.println(nombre2 + ": " + sueldo2));

	}
}
