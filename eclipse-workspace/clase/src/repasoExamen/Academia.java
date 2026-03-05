package repasoExamen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Academia {

	private HashMap<String, Alumno> alumnos;

	public Academia() {
		alumnos = new HashMap<>();
	}

	public void agregarAlumno(Alumno a) {
		alumnos.put(a.getNombre(), a);
	}

	public HashMap<String, Alumno> getAlumnos() {
		return alumnos;
	}

	// AQUÍ VAN LOS MÉTODOS NUEVOS
	
	public void mostrarNotas() {
		System.out.printf("%-12s %s%n", "Alumno","Nota");
		System.out.println("-----------------------------");
		Iterator<Entry<String,Alumno>> iterador = this.getAlumnos().entrySet().iterator();
		while (iterador.hasNext()) {
			Map.Entry<String, Alumno> alumno = iterador.next();
			System.out.printf("%-12s %.2f \n",alumno.getKey(),alumno.getValue().getNota());
		} 
	}
	
	

	public List<Alumno> obtenerAlumnosOrdenadosPorSeleccion() {
	    // Convertimos los valores del HashMap a una lista para manipularlos
	    List<Alumno> desordenada = new ArrayList<>(alumnos.values());
	    List<Alumno> ordenada = new ArrayList<>();

	    while (!desordenada.isEmpty()) {
	        Alumno mejorAlumno = desordenada.get(0);

	        // Buscamos el alumno con la nota más alta
	        for (Alumno a : desordenada) {
	            if (a.getNota() > mejorAlumno.getNota()) {
	                mejorAlumno = a;
	            }
	        }
	        
	        // Lo movemos de una lista a otra
	        desordenada.remove(mejorAlumno);
	        ordenada.add(mejorAlumno);
	    }

	    return ordenada;
	}

	public double calcularMedia() {

		if (alumnos.isEmpty())
			return 0;

		double suma = 0;

		for (Alumno a : alumnos.values()) {
			suma += a.getNota();
		}

		return Math.round(suma / alumnos.size()*100d)/100d;
	}

	//Selecciona los 3 mejores con el algoritmo de burbuja
	public List<Alumno> obtenerTresMejoresSeleccion() {
		// 1. Creamos una copia para no vaciar el HashMap original
		List<Alumno> desordenada = new ArrayList<>(alumnos.values());
		List<Alumno> ordenada = new ArrayList<>();

		// 2. Determinamos cuántas veces iterar (3 o el total si hay menos de 3)
		int iteraciones = Math.min(desordenada.size(), 3);

		// 3. Solo iteramos las veces necesarias para el podio
		for (int i = 0; i < iteraciones; i++) {
			Alumno mejorAlumno = desordenada.get(0);

			// Buscamos al mejor de los que quedan
			for (Alumno a : desordenada) {
				if (a.getNota() > mejorAlumno.getNota()) {
					mejorAlumno = a;
				}
			}

			// Lo movemos de una lista a la otra
			desordenada.remove(mejorAlumno);
			ordenada.add(mejorAlumno);
		}

		return ordenada;
	}

	public List<Alumno> obtenerAlumnosSuspensos() {

		List<Alumno> suspensos = new ArrayList<>();

		for (Alumno a : alumnos.values()) {
			if (a.getNota() < 5) {
				suspensos.add(a);
			}
		}

		return suspensos;
	}
}
