package jjoo;

import java.util.HashSet;

public class Equipo {

	private String nacionalidad;
	private DeporteDeEquipo deporteE;
	private DeporteIndividual deporteI;
	private HashSet<Participante> listaParticipante = new HashSet<>();

	public void anyadeParticipanteE(Participante participante) {
		if (participante.getNacionalidad().equals(this.nacionalidad) == false)
			System.out.printf(
					"El jugador %s no puede participar en el equipo de %s de %s " + "porque su nacionalidad es %s \n",
					participante.getNombre(), this.deporteE, this.nacionalidad, participante.getNacionalidad());
		else
			listaParticipante.add(participante);
	}

	public void anyadeParticipanteI(Participante participante) {
		if (participante.getNacionalidad().equals(this.nacionalidad) == false)
			System.out.printf(
					"El jugador %s no puede participar en el equipo de %s de %s " + "porque su nacionalidad es %s",
					participante.getNombre(), this.deporteI, this.nacionalidad, participante.getNacionalidad());
		else
			listaParticipante.add(participante);
	}
}
