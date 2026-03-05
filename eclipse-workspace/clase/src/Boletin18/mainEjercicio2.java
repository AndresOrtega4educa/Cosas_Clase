package Boletin18;

public class mainEjercicio2 {


	public static void main(String[] args) {
		personajeEjercicio2 heroe1 = new personajeEjercicio2("Bocchi La Roca");

		accesorioEjercicio2 espada = new accesorioEjercicio2("Espada", 100);
		accesorioEjercicio2 escudo = new accesorioEjercicio2("Escudo", 75);

	
		heroe1.añadirAccesorio(espada);
		heroe1.añadirAccesorio(escudo);
		heroe1.añadirAccesorio(espada);
	

		heroe1.eliminarAccesorio(espada);
		heroe1.eliminarAccesorio(espada); 
		System.out.println(" ");
		heroe1.mostrar();
		
	}
}
