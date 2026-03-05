package ListadeTareas;

import java.time.LocalDate;
import java.util.Arrays;

public class Tareas {
	private String titulo;
	private String descripcion;
	private String color;
	private LocalDate fecha;
	private boolean completa = false;

	private static Tareas[] lista = null; // Inicializas el array en null para poder entrar en el if(lista == null).

	public Tareas(String tit, String desc, String col) {
		
		  //Con esta nomenclatura te ahorras el "this." La estructura es: nombre de la
		  //variable = nombre que le das tú en el constructor.
		 
		titulo = tit;
		descripcion = desc;
		color = col;
		fecha = LocalDate.now();
		if (lista == null) {
			// Inicializo la lista con un elemento y ci¡opio en el la tarea
			lista = new Tareas[1];
			lista[0] = this;
		} else {
			// Aumento en una posicion la lista y copio en el la tarea.
			lista = Arrays.copyOf(lista, lista.length + 1);
			lista[lista.length - 1] = this;
		}

	}

	public void mostrar() {

		System.out.println(titulo + " (" + color + ")");
		System.out.println(descripcion);
		System.out.println("Fecha: " + fecha + " - Completada: " + completa);
		System.out.println("----------------------------------------------");

	}

	// Esto muestra todas las tareas sin importa compleción
	
	  public static void mostrarTarea() {
	  
	  for (int i = 0; i < lista.length; i++) { lista[i].mostrar();
	  
	  }
	  
	  }
	 

	public void completar() {
		this.completa = true;
	}

	public static void mostrarNoCompletas() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].completa != true) {
				lista[i].mostrar();
			} else {
				System.out.println("Tarea: " + "*" + lista[i].titulo + "*" + " completada");
				System.out.println("----------------------------------------");
			}
		}
	}
}