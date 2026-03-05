package tinderMatch;

public class Main {

	public static void main(String[] args) {

		Tinder tinderMatch = new Tinder();
		
		BoiBoi h1 = new BoiBoi(tinderMatch,"Cahlo", "12/03/2004", 2);
		BoiBoi h2 = new BoiBoi(tinderMatch,"Jaime","15/08/1999",2);
		GrrGrr m1 = new GrrGrr(tinderMatch,"María", "07/05/2004", 1, 18, 28);
		Otro o1 = new Otro(tinderMatch,"Irene", "03/12/2005", 0, 20, 22);
		
		
		h2.mostrarDatos();
		h1.mostrarDatos();
		tinderMatch.buscaMatches(h1);
		
	}

}
