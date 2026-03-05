/*package ListadeTareas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarea {

	private String titulo;
	private String descripcion;
	private String color;
	private LocalDate fecha;
	private boolean completa;

	// Lista de todas las tareas
	private static ArrayList<Tareas> lista = new ArrayList<>();

	public Tarea(String tit, String desc, String col) {
		this.titulo = tit;
		this.descripcion = desc;
		this.color = col;
		this.fecha = LocalDate.now();
		this.completa = false;

		
	}

	public void completar() {
		this.completa = true;
	}

	public void mostrar() {

		System.out.println(titulo + " (" + color + ")");
		System.out.println(descripcion);
		System.out.println("Fecha: " + fecha + " - Completada: " + completa);
		System.out.println("----------------------------------------------");

		}

	// Muestra solo tareas NO completadas
	public static void mostrarNoCompletas() {
		for (Tarea t : lista) {
			if (!t.completa) {
				t.mostrar();
			}
		}
	}

	public static void mostrarTodas() {
		for (Tarea t : lista) {
			t.mostrar();
		}
	}

	public void borrarTarea() {
		if(lista.remove(this) == false)
			System.err.println("No puedo eliminar la tarea.No existe");
	}

}*/
