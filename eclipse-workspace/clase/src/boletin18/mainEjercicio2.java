package boletin18;

public class mainEjercicio2 {

	public static void main(String[] args) {
		personajeEjercicio2 heroe = new personajeEjercicio2("Bocchi La Roca");

		accesorioEjercicio2 espada = new accesorioEjercicio2("Espada", 100);
		accesorioEjercicio2 escudo = new accesorioEjercicio2("Escudo", 75);

	
		heroe.añadirAccesorio(espada);
		heroe.añadirAccesorio(escudo);
		heroe.añadirAccesorio(espada);
	

		heroe.eliminarAccesorio(espada);
		heroe.eliminarAccesorio(espada); 
		heroe.mostrar();
		
	}
}
