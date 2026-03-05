package fuchibol;

public class Jugador extends Persona {
	
	private int dorsal;
	private Equipo equipo;
	
	public Jugador(String nombre,int dorsal,Equipo equipo) {
		super(nombre);
		this.dorsal = dorsal;
		this.equipo = equipo;
		
		this.equipo.anyadeJugador(this);
	}
	
	public Jugador(String nombre) {
		super(nombre);
	}

}
