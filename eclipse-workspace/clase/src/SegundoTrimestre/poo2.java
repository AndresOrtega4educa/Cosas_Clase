package SegundoTrimestre;

public class poo2 {

	public static void main(String[] args) {

		// Aquí van los pokémon de los que quiero información

		Pokemon p1 = new Pokemon(001, "Bulbasur", "Planta", (int) (Math.random() * 51) + 1);
		Pokemon p2 = new Pokemon(006, "Charizard", "Fuego", "Volador", (int) (Math.random() * 51) + 50);
		Pokemon p3 = new Pokemon(002, "Ivysaur", "Planta", "Veneno", (int) (Math.random() * 51) + 50);
		Pokemon p4 = new Pokemon(025, "Pikachu", "Eléctrico", (int) (Math.random() * 51) + 50);
		Pokemon p5 = new Pokemon(025, "Nidoking", "Veneno", "Lucha", (int) (Math.random() * 51) + 50);
		Pokemon p6 = new Pokemon(025, "Gengar", "Fantasma", "Veneno", (int) (Math.random() * 51) + 50);
		Pokemon p7 = new Pokemon(025, "Mewtwo", "Psíquico", (int) (Math.random() * 51) + 50);
		
		EquiPokemon equipo1 = new EquiPokemon("Chico Bien Carlos\n", p7, p6, p5);
		EquiPokemon equipo2 = new EquiPokemon("Entrenador Guay Javier\n", p1, p2, p4);
		
		
		
		// Aqui va el comando para llamar los pokemon a consola tanto para evolucionar,
		// ver la info o combatir

	
		p2.combate(p7);
		p1.mostrar();

	}

}
