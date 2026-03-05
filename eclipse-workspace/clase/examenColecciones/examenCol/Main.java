package examenCol;

public class Main {

	public static void main(String[] args) {
		//Creamos el juego con 456 jugadores
		Juego laGamba = new Juego(456);
		Prueba p1 = new Prueba();
		Prueba p2 = new Prueba();
		Prueba p3 = new Prueba();
		Prueba p4 = new Prueba();
		
		//Visualizamos el panel de jugadores. Deberían de aparecer todos activos
		laGamba.verJugadores();
		
		//Primera prueba. Vamos a eliminar a 150 jugadores al azar
		p1.nuevaPrueba(150);
		// Y volvemos a ver el panel. Ahora ya no estarán todos activos
		laGamba.verJugadores();
		
		//Segunda prueba. Eliminamos a 200 jugadores
		p2.nuevaPrueba(200);
		
		//Tercera prueba. Y será la última porque ya solo quedará 1 jugador activo
		p3.nuevaPrueba(105);
		
		//Vemos la informacion de las 3 pruebas realizadas
		laGamba.verPruebas();
		
		// Y si volvemos a ver el panel, solo debería de quedar 1 jugador activo
		laGamba.verJugadores();
	}
}
