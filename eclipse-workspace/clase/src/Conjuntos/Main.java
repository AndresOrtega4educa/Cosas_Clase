package Conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		HashSet<String> alumnos = new HashSet<>();
		HashSet<String> profes = new HashSet<>(Arrays.asList("José María Morales", "Yago Navarrete"));
		// System.out.println(profes);
		alumnos.add("Kerry Kaberga");
		alumnos.add("Akito Koteta");
		alumnos.add("Carmen Igga");
		alumnos.add("Armando Buya");
		alumnos.add("Maria Unpajote");

		alumnos.remove("Akito Koteta");

		// System.out.println(alumnos);

		/*int i = 0;
		for (String alumno : alumnos) {
			if (i != alumnos.size() - 1)
				System.out.print(alumno + ", ");
			else
				System.out.println(alumno);
			i++;
		}*/

		HashSet<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3, 5, 6, 7, 9, 0));
		HashSet<Integer> conjunto2 = new HashSet<>(Arrays.asList(7, 8, 4, 5));

		// Union de dos conjuntos (coge todos los valores)
		//conjunto1.addAll(conjunto2);
		//System.out.println(conjunto1);

		//Interseccion de dos conjuntos (Solo los comunes)
		//conjunto2.retainAll(conjunto1);
		//System.out.println(conjunto2);
		
		//Son conmutativos tanto la Union como la interseccion
		
		//Diferencia (Muestra los números que no son comunesde ambos)
		conjunto2.removeAll(conjunto1);
		System.out.println(conjunto2);
	}
}
