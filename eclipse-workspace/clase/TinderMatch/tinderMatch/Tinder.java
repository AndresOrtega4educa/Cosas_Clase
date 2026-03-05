package tinderMatch;

import java.util.ArrayList;
import java.util.HashSet;

public class Tinder {

	private HashSet<BoiBoi> listaHombres = new HashSet<>();
	private HashSet<GrrGrr> listaMujeres = new HashSet<>();
	private HashSet<Otro> listaOtros = new HashSet<>();

	public Tinder() {

	}

	public void anyadeHombre(BoiBoi hombre) {

		listaHombres.add(hombre);

	}

	public ArrayList<Persona> construirListaMatches(BoiBoi hombre){
		ArrayList<Persona> matches = new ArrayList<>();
		if (hombre.getQueBusco() == 0) {
			for (BoiBoi h : this.listaHombres)
			if (h.getQueBusco()!=2 && hombre.esMatch(h)==true && h!=hombre)
				matches.add(h);
			for (GrrGrr m : this.listaMujeres)
				if (m.getQueBusco()!=2 && hombre.esMatch(m)==true)
					matches.add(m);
			for(Otro o: this.listaOtros)
				if(o.getQueBusco()!=2 && hombre.esMatch(o)==true)
					matches.add(o);
		}
		return matches;
	}

	public void buscaMatches(BoiBoi hombre) {
		ArrayList<Persona> matches = new ArrayList<>();
		matches = construirListaMatches(hombre);
		//finalmente hago el listado de matches
		if (matches.size() == 0)
			System.out.println("Espabila loquete que te veo cuajao trainer!");
		else
			for (Persona persona : matches)
				persona.mostrarDatos();
	}
	
	public void buscaMatchAzar(BoiBoi hombre) {
		ArrayList<Persona> matches = new ArrayList<>();
		matches = construirListaMatches(hombre);
		int azar = (int)(Math.random()*matches.size());
		matches.get(azar).mostrarDatos();
	}

	public void anyadeMujer(GrrGrr mujer) {

		listaMujeres.add(mujer);

	}

	public static void buscaMatches(GrrGrr mujer) {
//Hacer la lista como la de hombre pero cambiando los numeros y variables
	}

	public void anyadeOtro(Otro otro) {

		listaOtros.add(otro);

	}

	public static void buscaMatches(Otro otro) {
		//Hacer la lista como la de hombre pero cambiando los numeros y variables
	}
}
