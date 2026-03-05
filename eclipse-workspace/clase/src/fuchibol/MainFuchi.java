package fuchibol;

import java.util.HashSet;
import java.util.List;

public class MainFuchi {

	public static void main(String[] args) {

	

		// TORNEO
		Competicion FFI = new Competicion("Futbol Frontier Interdimensional");

		// EQUIPOS
		Equipo Raimon = new Equipo("Raimon");
		Equipo Alius = new Equipo("Academia Alius");
		Equipo Zero = new Equipo("Equipo Zero");
		Equipo Cascada = new Equipo("Cascada Perfecta");
		Equipo Earth = new Equipo("Earth Eleven");
		Equipo Costail = new Equipo("Selección de Costail");

		HashSet<Equipo> listaEquipos = new HashSet<>(List.of(Raimon, Alius, Zero, Cascada, Earth));

		// ENTRENADORES
		Entrenador Travis = new Entrenador("Percival Travis", Raimon);
		Entrenador Schiller = new Entrenador("Lina Schiller", Alius);
		Entrenador Black = new Entrenador("Astero Black", Zero);
		Entrenador Evans = new Entrenador("David Evans", Cascada);
		Entrenador Wonderbot = new Entrenador("Clauss Wonderbot", Earth);

		// JUGADORES
		Jugador Mark = new Jugador("Mark Evans", 1, Raimon);
		Jugador Blaze = new Jugador("Axel Blaze", 10, Raimon);
		Jugador Foster = new Jugador("Xavier Foster", 10, Alius);
		Jugador Bellatrix = new Jugador("Isabelle Trick", 9, Alius);
		Jugador Long = new Jugador("Bai Long", 11, Zero);
		Jugador Tezcat = new Jugador("Tezcat", 10, Zero);
		Jugador Ecks = new Jugador("Ar Ecks", 10, Cascada);
		Jugador Blade = new Jugador("Victor Blade", 10, Earth);
		Jugador Sharpe = new Jugador("Keenan Sharpe", 3, Earth);

		// ARBITROS
		Arbitro Horse = new Arbitro("Chester Horse Junior", "Primero");
		Arbitro Storm = new Arbitro("Tezcat Storm", "Segundo");
		Arbitro Negreira = new Arbitro("José María Negreira", "Linier");

		//JORNADA
		/*Jornada j1 = new Jornada(FFI);
		j1.resultadoPartido(1,0,3);
		j1.resultadoPartido(2,5,0);
		j1.resultadoPartido(3,2,2);*/
		
		
		
		//PARTIDOS
		/*Partido p1 = new Partido(Cascada, Earth);
		Partido p2 = new Partido(Alius, Zero);
		Partido p3 = new Partido(Raimon, Costail);*/
		
		FFI.anyadeEquipo(Earth);
		FFI.anyadeEquipo(Raimon);
		FFI.anyadeEquipo(Zero);
		FFI.anyadeEquipo(Cascada);
		FFI.anyadeEquipo(Alius);
		FFI.anyadeEquipo(Costail);
		FFI.anyadeEquipos(listaEquipos);
		
		FFI.verClasificacion();
	}
}
