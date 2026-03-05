package fuchibol;

import java.util.HashSet;

public class Equipo {

	private String nombre;
	private Entrenador entrenador;
	HashSet<Jugador> jugadores = new HashSet<>();
	private int partidosGanados = 0;
	private int partidosEmpatados= 0;
	private int partidosPerdidos = 0;
	private int golesAFavor= 0;
	private int golesEnContra= 0;
	private int puntos = 0;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	public void anyadeJugador(Jugador jugador) {
		this.jugadores = jugadores;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPts() {
		return this.puntos;
	}
	
	public int getPG() {
		return this.partidosGanados;
	}
	public int getPE() {
		return this.partidosEmpatados;
	}
	public int getPP() {
		return this.partidosPerdidos;
	}
	
	public int getGF() {
		return this.golesAFavor;
	}
	public int getGC() {
		return this.golesEnContra;
	}

	public void ganaPartido() {
		this.partidosGanados++;
		this.puntos+=3;
	}

	public void pierdePartido() {
		this.partidosPerdidos++;
		
	}

	public void empataPartido() {
		this.partidosEmpatados++;
		this.puntos++;
	}

	public void cambiaGoles(int golesAFavor, int golesEnContra) {
		this.golesAFavor+=golesAFavor;
		this.golesEnContra+=golesEnContra;
		
		
	}
	
	
}
