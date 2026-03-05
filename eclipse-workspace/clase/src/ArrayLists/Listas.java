package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		ArrayList<String> textos = new ArrayList<>();
		ArrayList<Double> decimales = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>(List.of(5, 4, 7, 3, 2, 6, 8));

		// Array list inicializado con contenido
		ArrayList<Double> precios = new ArrayList<>(List.of(33.5, 55.6, 78.9, 75.0));

		System.out.println(precios);

		textos.add("Me he hecho cacona");
		textos.add("Vale");
		
		decimales.add(33.0);
		numeros.add(33);
		System.out.println(textos);
		System.out.println(decimales);
		System.out.println(numeros);

		System.out.println(textos.size());
		
		ArrayList<String> alumnos = new ArrayList<>(List.of("Jaime","Adrián", "Lucía", "Óscar", "Marcocks","Borjita","Carlos","Maradona"));
		if(alumnos.contains("Pepe"))
			System.out.println("Está en la lista");
		else
			System.out.println("No está en la lista");
		
		System.out.println(alumnos.indexOf("Marcocks"));
		alumnos.remove("Adrián");
		System.out.println(alumnos);
		System.out.println("-----------------------------------");
		
		//Eliminar numeros
		
		System.out.println(numeros);
		System.out.println(numeros.remove((Integer)3));
		System.out.println(numeros);
		System.out.println("-----------------------------------");
		
		//Borrar un Arraylist
		
		numeros.clear();
		System.out.println(numeros);
		System.out.println(numeros.size());
		if(numeros.isEmpty())
			System.out.println("Este array está vacío");
		System.out.println("-----------------------------------");
		
		//Copiar un array list
		
		ArrayList alumnos2 = (ArrayList) alumnos.clone();
		System.out.println(alumnos2);
		System.out.println("-----------------------------------");
		
		//Tupla
		List<Integer> tupla= List.of(9,8,7,6,5,4,3,2,1);
		System.out.println(tupla);
		System.out.println("-----------------------------------");
		
		//Recorrer un ArrayList
		
		for(int i=0;i<alumnos.size();i++)
		System.out.println(alumnos.get(i));
		System.out.println("....................................");
		
		//Otro método(Iterator)
		
		Iterator<String> iterador = alumnos.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	
	}
}
