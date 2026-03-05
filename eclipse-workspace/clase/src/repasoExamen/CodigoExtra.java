package repasoExamen;

import java.util.ArrayList;
import java.util.List;

public class CodigoExtra {

	// Seleccionar 3 mejores con algoritmo de seleccion

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

	// Seleccionar 3 mejores con algoritmo de burbuja

	public List<Alumno> obtenerTresMejoresBurbuja() {
		// 1. Convertimos el HashMap a una lista trabajable
		List<Alumno> lista = new ArrayList<>(alumnos.values());
		int n = lista.size();

		// 2. Definimos el límite (3 o menos si no hay suficientes alumnos)
		int limite = Math.min(n, 3);

		// 3. Solo hacemos tantas pasadas como elementos necesitemos en el podio
		for (int i = 0; i < limite; i++) {
			// En cada pasada, el "mejor" de los restantes flotará hacia la posición 'i'
			for (int j = n - 1; j > i; j--) {
				if (lista.get(j).getNota() > lista.get(j - 1).getNota()) {
					// Intercambiamos posiciones (Swap)
					Alumno temp = lista.get(j);
					lista.set(j, lista.get(j - 1));
					lista.set(j - 1, temp);
				}
			}
		}

		// Devolvemos solo los 3 primeros, que ya están garantizados
		return lista.subList(0, limite);
	}
	
	//Codigo autoincremental
	
	public Persona(String n, double s) {
		this.nombre = n;
		this.salario = s;
		this.setCodigo();
	}
	
	public void setCodigo() {
		if(this.codigo != null)
			System.out.println("Ya tiene codigo");
		else {
			contador++;
			if(contador<10)
				this.codigo = "EMP-00" + contador;
			else if(contador>=10 && contador<100)
				this.codigo = "EMP-0" + contador;
			else
				this.codigo = "EMP-" + contador;
		}
	}
		
	public void mostrarCodigo() {
		System.out.println(this.codigo);
	}
	
	
}
