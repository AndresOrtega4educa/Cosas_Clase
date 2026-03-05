package SegundoTrimestre;

public class Pokemon {
	private int pokedex;
	private String nombre;
	private String[] tipos = new String[2];
	private int pv;
	private static int numPokemon = 0;
	private Pokemon evolucion = null;
	private Pokemon[] equipo; // Equipo pokemon
	private int contador; // Cuantos pokemon forman el equipo

	public int getnumPokemon() {
		return numPokemon;
	}
//Estos 2 public Pokemon son los distintos constructores, cuando el pokemon tiene 2 tipos y cuando solo tiene 1

	public Pokemon(int c, String n, String t1, String t2, int pv) {
		this.pokedex = c;
		this.nombre = n;
		this.tipos[0] = t1;
		this.tipos[1] = t2;
		this.pv = pv;

	}

	public Pokemon(int c, String n, String t1, int pv) {
		this.pokedex = c;
		this.nombre = n;
		this.tipos[0] = t1;
		this.tipos[1] = null;
		this.pv = pv;

	}

//Esta función si la llamas muestra la info del pokemon
	public void mostrar() {
		System.out.println("-----------------");
		System.out.println("Número de la pokedex: " + this.pokedex);
		System.out.println("Nombre: " + this.nombre);

		if (this.tipos[1] == null)
			System.out.println("Tipo: " + this.tipos[0]);
		else
			System.out.println("Tipos: " + this.tipos[0] + ", " + this.tipos[1]);
		if (this.evolucion != null)
			System.out.println("Evoluciona en: " + this.evolucion.nombre);
		System.out.println("Puntos de vida: " + this.pv);
		System.out.println("----------------\n");
	}

	public void setEvolucion(Pokemon p) {
		this.evolucion = p;
	}

	public Pokemon evoluciona() {
		Pokemon pokemon = this;
		if (this.evolucion == null)
			System.out.println("Este Pokémon no evoluciona!");
		else
			pokemon = this.evolucion;
		return pokemon;

	}

	public void combate(Pokemon p) {
		// Con este método llamas a pelear a dos pokemons

		Pokemon pokemon = this;
		Pokemon pokemon2 = p;
		boolean combateTerminado;
		int vida1 = pokemon.pv;
		int vida2 = pokemon2.pv;
		String nombre1 = pokemon.nombre;
		String nombre2 = pokemon2.nombre;
		System.out.println(nombre1 + " vs " + nombre2 + "\n" + vida1 + " - " + vida2);

		combateTerminado = false;

		do {
			// Ataque del Pokémon 2 a Pokémon 1
			int ataque2 = (int) (Math.random() * 51) + 1;
			vida1 -= ataque2;

			// Para que la vida no quede en número negativo
			if (vida1 < 0)
				vida1 = 0;
			System.out.println(nombre2 + " ataca: " + ataque2 + " puntos de daño");
			System.out.println(nombre1 + ": " + vida1 + " HP restante" + "\n");

			// Verificar si el pokemon 1 está fainted
			if (vida1 <= 0) {
				combateTerminado = true;
			}

			// Solo se realiza el ataque del Pokémon 1 si el combate no terminó
			if (!combateTerminado) {
				int ataque1 = (int) (Math.random() * 51) + 1;
				vida2 -= ataque1;

//Para que la vida no quede en número negativo
				if (vida2 < 0)
					vida2 = 0;
				System.out.println(nombre1 + " ataca: " + ataque1 + " puntos de daño");
				System.out.println(nombre2 + ": " + vida2 + " HP restante" + "\n");

				// Verificar si el pokemon 2 está fainted
				if (vida2 <= 0) {
					combateTerminado = true;
				}
			}

		} while (!combateTerminado);

		System.out.println("*************************");
		System.out.println("¡¡Ya tenemos un ganador!!");
		System.out.println("*************************\n");

		if (vida1 > 0)
			System.out.println("Ganador: " + nombre1);
		else
			System.out.println("Ganador: " + nombre2 + "\n");
		System.out.println("!!Enhorabuena¡¡");

	}

}