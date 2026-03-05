package tinderMatch;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public abstract class Persona {
	protected String nombre;
	protected LocalDate fechaNac;
	protected int queBusco; // 0 - me da igual, 1 - hombre, 2 - mujer
	private int edadMin;
	private int edadMax;

	public Persona(String nombre, String nacimiento, int queBusco) {
		this.nombre = nombre;
		this.queBusco = queBusco;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNac = LocalDate.parse(nacimiento, formato);
	}

	public Persona(String nombre, String nacimiento, int queBusco, int minimo) {
		this.nombre = nombre;
		this.queBusco = queBusco;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaNac = LocalDate.parse(nacimiento, formato);
		if (minimo < 18)
			this.edadMin = minimo;
	}

	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechaNac, hoy);
		return periodo.getYears();
	}

	public void mostrarDatos() {
		System.out.printf("Nombre: %s. Edad: %d\n", this.nombre, this.getEdad());
		if (this instanceof BoiBoi)
			System.out.print("Soy un BoiBoi y busco");
		if (this instanceof GrrGrr)
			System.out.print("Soy una GrrGrr y busco");
		if (this instanceof Otro)
			System.out.print("Soy un Therian y busco");

		if (this.queBusco == 0)
			System.out.println(" a un Therian\n");
		if (this.queBusco == 1)
			System.out.println(" a un BoiBoi\n");
		if(this.queBusco == 2)
			System.out.println(" a una GrrGrr\n");
		
		if (this.edadMin == 18 && this.edadMax == 200)
System.out.printf("Busco a una persona entre %d y %d años\n\n", this.edadMin, this.edadMax);

	}
	
	public int getQueBusco() {
		return this.queBusco;
	}

	public boolean esMatch(Persona p) {
		boolean match = true;
		int edad1 = this.getEdad();
		int edad2 = p.getEdad();
		if(edad1< p.edadMin || edad1>p.edadMax || edad2<this.edadMin|| edad2>this.edadMax)
			match = false;
		return match;
	}
	
	
}


