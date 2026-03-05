package repasoExamen;

import java.util.ArrayList;


public class Main {
	
	

	public static void main(String[] args) {
		Academia academia = new Academia();

		academia.agregarAlumno(new Alumno("Ana", 7.5));
		academia.agregarAlumno(new Alumno("Luis", 4.0));
		academia.agregarAlumno(new Alumno("Marcos", 10.0));
		academia.agregarAlumno(new Alumno("Andrés", 2.0));
		academia.agregarAlumno(new Alumno("Nick", 7.5));
		academia.agregarAlumno(new Alumno("Daniel", 7.5));

		academia.mostrarNotas();

		// Ordenados
		System.out.println("\nAlumnos ordenados por nota:");
		System.out.println("-----------------------------");
		for (Alumno a : academia.obtenerAlumnosOrdenadosPorSeleccion()) {
			System.out.printf("%-12s %s%n", a.getNombre(), a.getNota());
		}

		// Media
		System.out.println("\nMedia: " + academia.calcularMedia() + "\n");

		// Mejor alumno
		System.out.println("\n--- EL PODIO (Top 3) ---");
		ArrayList<Alumno> losMejores = (ArrayList<Alumno>) academia.obtenerTresMejoresSeleccion();

		for (int i = 0; i < losMejores.size(); i++) {
			Alumno a = losMejores.get(i);
			System.out.println((i + 1) + "º Puesto: " + a.getNombre() + " (" + a.getNota() + ")");
		}

		// Suspensos
		System.out.println("\nAlumnos suspensos:");
		for (Alumno a : academia.obtenerAlumnosSuspensos()) {
			System.out.println(a.getNombre() + " - " + a.getNota());
		}
	}

}
