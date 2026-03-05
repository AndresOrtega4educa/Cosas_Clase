package Boletín_13;

import SegundoTrimestre.Persona;

public class Main {

	public static void main(String[] args) {

		Profesor profe1 = new Profesor("Jose María", "Morales Váquez", "Informática");
		Profesor profe2 = new Profesor("Pepa", "Cano", "Empresa");

		Alumno alumno1 = new Alumno("Mario", "Carcalete", 17);
		Alumno alumno2 = new Alumno("Andrea", "Coronado", 21);
		Alumno alumno3 = new Alumno("Marcos", "Alegría", 18);
		Alumno alumno4 = new Alumno("Marcos", "Pineros", 190);

		Modulo programación = new Modulo("Programación", 8, 1, false);
		Modulo python = new Modulo("Python", 3, 2, true);
		Modulo fundamentos = new Modulo("Fundamentos de Programación", 2, 1, true);

		Ciclo dam = new Ciclo("Desarrollo de Aplicaciones Multiplataforma", "SUPERIOR");

		dam.anyadeModulo(programación);
		dam.anyadeModulo(fundamentos);
		dam.anyadeModulo(python);

		Grupo dam1 = new Grupo("DAM1", dam, 1, 4);

		dam1.anyadeTutor(profe1);
		dam1.anyadeAlumno(alumno1);
		dam1.anyadeAlumno(alumno2);
		dam1.anyadeAlumno(alumno3);
		dam1.anyadeAlumno(alumno4);

		dam1.verGrupo();
		

	}
}
