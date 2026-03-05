package tinderMatch;

import java.time.LocalDate;

public class GrrGrr extends Persona {

	private boolean esHombre = false;
	private int edadMin;
	private int edadMax;

	public GrrGrr(Tinder app,String nombre, String nacimiento, int queBusco) {
		super(nombre, nacimiento, queBusco);
		app.anyadeMujer(this);
	}

	public GrrGrr(Tinder app,String nombre, String nacimiento, int queBusco, int edadMin, int edadMax) {
		super(nombre, nacimiento, queBusco);
		this.esHombre = esHombre;
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		app.anyadeMujer(this);
	}

}
