package Conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {
		int complementario = (int) (Math.random() * 6) + 1;
		HashSet<Integer> conjuntoNumeros = new HashSet<>(Arrays.asList(1, 44, 55, 67, 77, 23, 15));
		ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2, 55, 6, 2, 3, 77, 8, 44, 1, 2, 6));
		int[] vector = { 4, 5, 6, 22, 4, 1, 7, 9 };

		// Convertimos el array vector a un ArrayList con el siguiente método:

		ArrayList<Integer> vectorLista = new ArrayList<>();
		for (int n : vector)
			vectorLista.add(n);
		System.out.println(vectorLista);

		// y para un HashSet:

		HashSet<Integer> vectorConjunto = new HashSet<>();
		for (int n : vector)
			vectorConjunto.add(n);
		System.out.println(vectorConjunto);

		// Ahora de ArrayList a vector:

		// Lista que usaremos:(Líneas 12 y 13)
		// HashSet<Integer> conjuntoNumeros = new
		// HashSet<>(Arrays.asList(1, 44, 55, 67, 77, 23, 15));
		// ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2, 55, 6, 2, 3,
		// 77,8, 44, 1, 2, 6));

		// Otra forma de poner el bucle for(parte comentada):

		int[] vectorListaNumeros = new int[listaNumeros.size()];
		int i = 0;
		for (int n : listaNumeros) {
			// for(int i=0;i<listaNumeros.size();i++) {
			vectorListaNumeros[i] = listaNumeros.get(i);
			i++;
		}

		for (int n : vectorListaNumeros)
			System.out.print(n + " - ");

		// QUITAR LOS CORCHETES EN JAVA
		//ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2,3,4,5,6,7));
		//System.out.println(listaNumeros);
		//int i =0;
		//for(int n:listaNumoers){
		//if (i==listaNumeros.size()-1)
		//System.out.println();
		//else
		//System.out.println();
		
		
	}

}
