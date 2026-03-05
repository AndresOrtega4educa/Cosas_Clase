package Boletín_13;

public class Grupo {

	private String nombre;
	private Ciclo ciclo;
	private int curso;
	private int numAlumnos;
	private int alumnosMatriculados = 0;
	private Alumno[] listaAlumnos;
	private Profesor tutor = null;

	public Grupo(String nombre, Ciclo ciclo, int curso, int numAlumnos) {
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.curso = curso;
		this.numAlumnos = numAlumnos;
		this.listaAlumnos = new Alumno[numAlumnos];
	}

	public void anyadeTutor(Profesor tutor) {
		this.tutor = tutor;
		tutor.setTutoria(this);

	}

	public void anyadeAlumno(Alumno alumno) {
		if (this.numAlumnos == this.alumnosMatriculados)
			System.out.println("Grupo completo, ya están los " + this.alumnosMatriculados + " en el curso");
		else {
			this.listaAlumnos[this.alumnosMatriculados] = alumno;
			this.alumnosMatriculados++;
		}
	}

	public void verGrupo() {
		System.out.println("Nombre del Grupo: " + this.nombre);
		System.out.println("Ciclo: " + this.ciclo.getNombre() + " - Curso: " + this.curso);
		System.out
				.println("Total alumnos: " + this.numAlumnos + " / Alumnos matriculados: " + this.alumnosMatriculados);
		if (this.tutor != null)
			System.out.println("Tutor: " + this.tutor.getNombre());
		else
			System.out.println("No tienes tutor asignado");
		System.out.println("\nLISTADO DE ALUMNOS DEL GRUPO:");
		for (int i = 0; i < this.alumnosMatriculados; i++)
			System.out.println("- " + this.listaAlumnos[i].getNombre());
		
		System.out.println("\nLISTADO DE MODULOS DEL GRUPO:");
		Modulo[] modulos = this.ciclo.getModulos(this.curso);
		int posicion = 0;
		Modulo m = modulos[posicion];
		while(m!=null) {
			System.out.println("- "+ m.getNombre());
			posicion++;
			m = modulos[posicion];
		}
	}
}