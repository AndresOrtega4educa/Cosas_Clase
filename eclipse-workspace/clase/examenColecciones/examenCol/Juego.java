package examenCol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Juego {

	private HashMap<String, Jugador> jugadores;
	int participantes;
	int perdedores;
	
	private HashMap<String, Jugador> getJugadores() {
		return jugadores;
	}
	public Juego(int participantes) {
		jugadores = new HashMap<>();
	}

	public void agregarJugadores(Jugador j) {
		jugadores.put(j.getCodigo(), j);
	}
	
	public void verJugadores() {
		
		System.out.println("------------------------------------------------------------------------------");
		for(Jugadores j: jugadores)
		System.out.printf("%-4s 4s 4s 4s 4s 4s 4s 4s 4s 4s 4s 4s\n",jugadores.entrySet());
		System.out.println("------------------------------------------------------------------------------");
		} 
	

	

	public void verPruebas() {
		int contadorPrueba = 0;
		for(int p=1;p>4;p++) {
			System.out.println("Número de pruebas hasta el momento: "+contadorPrueba+"\nPrueba número: "+p+". Expulsados: "+perdedores+". Restantes: "+participantes );
			contadorPrueba++;
		}
		

	}
}
