package autoescuela;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Examen {

	private HashSet<Pregunta> preguntasExamen = new HashSet<>();

	public Examen(int numero, ArrayList<Pregunta> preguntas) {
		int max = preguntas.size();
		while (preguntasExamen.size() != numero) {
			int azar = (int) (Math.random() * max);
			preguntasExamen.add(preguntas.get(azar));

		}
	}

	public void mostrarExamen() {
		for (Pregunta p : preguntasExamen) {
			System.out.println("Pregunta: " + p.getTexto());
			System.out.println("");
			String[] respuestas = p.getRespuestas();
			for (String r : respuestas)
				System.out.println(r);
			System.out.println(" ");
		}

	}

	public void solucionExamen() {
		System.out.println("SOLUCIÓN: ");
		System.out.println("---------");
		for (Pregunta p : preguntasExamen) {
			System.out.println(p.getSolucion()+p.mostrarSol());
		}
	}
	public void corregirExamen() {
		int fallos=0;
		int i=1;
		for (Pregunta p: preguntasExamen) {
			System.out.println("Respuesta a la pregunta "+ (i++)+": ");
			Scanner teclado = new Scanner(System.in);
			String respuesta = teclado.nextLine();
			
		}
	}
}
