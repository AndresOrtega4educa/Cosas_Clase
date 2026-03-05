package jjoo;

import java.util.HashSet;

public class DeporteDeEquipo extends Deporte {

	
	private String nomDep;
	private HashSet<Participante> participantes = new HashSet<>();

	public DeporteDeEquipo(String nomDep,HashSet<Participante> participantes) {
		super(nomDep,participantes);
		
	}
}
