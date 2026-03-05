package tinderMatch;

import java.time.LocalDate;

public class BoiBoi extends Persona{

	private boolean esHombre=true;
	private int edadMin;
	private int edadMax;
	
	public BoiBoi(Tinder app,String nombre, String nacimiento, int queBusco) {
		super(nombre, nacimiento, queBusco);
		app.anyadeHombre(this);
	}

	public BoiBoi(Tinder app,String nombre, String nacimiento, int queBusco, int edadMin, int edadMax) {
		super(nombre, nacimiento, queBusco);
		this.esHombre = esHombre;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		app.anyadeHombre(this);
	}
	
	public int getQueBusco() {
	
		return this.queBusco;
	}
	
}
