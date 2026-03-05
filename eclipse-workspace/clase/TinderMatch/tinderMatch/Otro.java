package tinderMatch;

public class Otro extends Persona{
	private int edadMin;
	private int edadMax;
	
	
	
	public Otro(Tinder app,String nombre, String nacimiento, int queBusco) {
		super(nombre, nacimiento, queBusco);
		
		app.anyadeOtro(this);
	}

	public Otro(Tinder app,String nombre, String nacimiento, int queBusco, int edadMin, int edadMax) {
		super(nombre, nacimiento, queBusco);
		this.edadMin = edadMin;
		this.edadMax = edadMax;
		app.anyadeOtro(this);
	}
	
}
