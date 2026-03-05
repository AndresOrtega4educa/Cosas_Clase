package examen;

public class MainExamen {

	public static void main(String[] args) {

		Programador p1 = new Programador("Elena Nito Del Bosque", "EMP-001", 1500.44, false, true);
		Programador p2 = new Programador("Demetrio Imedio", "EMP-002", 1400.21, false, false);
		Programador p3 = new Programador("Felipe Lotas", "EMP-003", 1600.11, true, true);
		JefeDeProyecto j1 = new JefeDeProyecto("Germán Ivela", "EMP-004", 2000.25);
		JefeDeProyecto j2 = new JefeDeProyecto("Benito Camelas", "EMP-005", 1987.75);
		Proyecto pr1 = new Proyecto("PRO-001", j1, p1, p2, p3, "Hacer aplicación Java para ENAIRE", 3);

		System.out.println("CREACIÓN DE EMPLEADOS");
		System.out.println("");
		p1.crearEmpleado();
		System.out.println(" ");
		System.out.println(" ");
		p2.crearEmpleado();
		System.out.println(" ");
		System.out.println(" ");
		p3.crearEmpleado();
		System.out.println(" ");
		System.out.println("CREACIÓN DE PROYECTOS: ");
		pr1.crearProyecto();
		System.out.println(" ");
		System.out.println("CAMBIOS EN LOS PROYECTOS: (ESTE ESTÁ MAL HECHO) ");
		System.out.println();
		pr1.cambiaProyecto();
		System.out.println(" ");
		System.out.println("ASIGNACION DE DESARROLLADORES A LOS PROYECTOS: (ESTE NO HE SABIDO HACERLO) ");
		System.out.println("");
		System.out.println("LISTADO DE INFORMACIÓN DE UN PROYECTO:");
		System.out.println("");
		pr1.listarProyectos();
		System.out.println("");
		System.out.println("CÁLCULO DE SALARIOS");
		System.out.println("");
		p1.calcularSalarios();
		System.out.println(" ");
		System.out.println(" ");
		p2.calcularSalarios();
		System.out.println(" ");
		System.out.println(" ");
		p3.calcularSalarios();

	}

}
