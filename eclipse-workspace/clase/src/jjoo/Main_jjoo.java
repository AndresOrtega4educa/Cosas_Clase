package jjoo;

import java.util.HashSet;

public class Main_jjoo {

	public static void main(String[] args) {
		
	Participante j1 = new Participante("Pepe Lotas", "España");
	Participante j2 = new Participante("Ana Bohueles", "Francia");
	Participante j3 = new Participante("Strogonoff", "Russia");
	Participante j4 = new Participante("Ken Tanilo", "USA");

	HashSet<Participante> participantes = new HashSet<>();
	
	DeporteIndividual d1= new DeporteIndividual("Snowboard cross");
	DeporteDeEquipo d2= new DeporteDeEquipo("Curling",participantes);
	
	Equipo e1 = new Equipo();
	Equipo e2 = new Equipo();
	
	e1.anyadeParticipanteE(j1);
	e1.anyadeParticipanteE(j2);
	e1.anyadeParticipanteE(j3);
	e1.anyadeParticipanteE(j4);
	
	d1.resultado(j1, 45.4);
	d1.resultado(j2, 40.2);
	d1.resultado(j3, 49.7);
	d1.resultado(j4, 49.7);
	
	d1.obtenerPodium();
	
	}

}
