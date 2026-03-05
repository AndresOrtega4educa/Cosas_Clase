package examen;

public class Proyecto {

	private String nombre;
	private JefeDeProyecto jefe;
	private Programador prog1;
	private Programador prog2;
	private Programador prog3;
	private String codigo;
	private int maximo;

	public Proyecto(String nombre, JefeDeProyecto jefe, Programador prog1, String codigo) {
		this.nombre = nombre;
		this.jefe = jefe;
		this.prog1 = prog1;
		this.codigo = codigo;
	}

	public Proyecto(String nombre, JefeDeProyecto jefe, Programador prog1, Programador prog2, Programador prog3,
			String codigo, int maximo) {
		this.nombre = nombre;
		this.jefe = jefe;
		this.prog1 = prog1;
		this.prog2 = prog2;
		this.prog3 = prog3;
		this.codigo = codigo;
		this.maximo = maximo;
	}

	public void crearProyecto() {

		System.out.println("Proyecto: " + nombre + ". " + codigo + ". " + "Jefe de Proyectos: " + jefe.nombre + ". "
				+ "Desarrolladores asignados: " + maximo);

	}

	public void cambiaProyecto() {

		System.out.println("El jefe de proyecto ha cambiado. Ahora es " + jefe.nombre + "\n" + maximo
				+ " Desarrolladores asignados al proyecto " + nombre + "\n Ya hay " + maximo
				+ " Desarrolladores asignados al proyecto " + nombre + ". " + "Este dato no puede cambiarse");

	}

	public void listarProyectos() {
		System.out.println("Proyecto " + nombre + ". " + codigo + "\nJefe de Proyectos: " + jefe.codigo + ". "
				+ jefe.nombre + "\nDesarrolladores asignados: " + "\n" + prog1.codigo + ". " + prog1.nombre + "\n"
				+ prog2.codigo + ". " + prog2.nombre + "\n" + prog3.codigo + ". " + prog3.nombre);
	}

	public String getNombre() {
		return nombre;
	}

}
