package jjoo;

import java.util.HashSet;

public abstract class Deporte {
	
	protected String nomDep;
	protected Participante jugador;
	HashSet<Participante> participantes = new HashSet<>();
	
	public Deporte(String nombre) {
		this.nomDep=nomDep;
	}

	public Deporte(String nomDep, Participante jugador) {
		this.nomDep = nomDep;
		this.jugador = jugador;
	}

	public Deporte(String nomDep,HashSet<Participante>participantes) {
		this.nomDep = nomDep;
		this.participantes = participantes;
	}
	public String getNombre() {
		return nomDep;
	}
	
}
