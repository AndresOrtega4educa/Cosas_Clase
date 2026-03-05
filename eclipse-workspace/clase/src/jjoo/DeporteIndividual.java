package jjoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeporteIndividual extends Deporte {

	private HashMap<Participante, Double> listaParticipantes = new HashMap<>();

	public DeporteIndividual(String nomDep) {
		super(nomDep);
	}

	public void resultado(Participante participante, double marca) {
		if (listaParticipantes.containsKey(participante)) {
			if (listaParticipantes.get(participante) < marca)
				this.listaParticipantes.put(participante, marca);
		}

		else
			listaParticipantes.put(participante, marca);
	}

	public void obtenerPodium() {

		System.out.println("\nMedallero" + " " + this.getNombre());

		// 1. Hacemos una copia de la lista
		HashMap<Participante, Double> copia = new HashMap<>(this.listaParticipantes);

		// 2. Buscamos el mayor
		System.out.println("-----------------------------");
		System.out.println("ORO");
		if (copia.size() != 0) {

			Participante p = obtenerMayor(copia);
			double marca = copia.get(p);
			System.out.printf("%s con %.2f puntos", p.getNombre(), marca);
			copia.remove(p);
		} else
			System.out.println("No hay participantes en esta competición");

		// 3. Lo imprimimos y lo borramos
		obtenerMedalla("ORO", copia);
		obtenerMedalla("PLATA", copia);
		obtenerMedalla("BRONCE", copia);
		// 4. Comprobamos que no haya más participantes con la misma marca, si hay lo
		// sacamos

		// 5. Repetimos 2,3 y 4 dos veces mas
		System.out.println("\nPLATA");
		if (copia.size() != 0) {

			Participante p = obtenerMayor(copia);
			double marca = copia.get(p);
			System.out.printf("%s con %.2f puntos", p.getNombre(), marca);
			copia.remove(p);
		} else
			System.out.println("No hay participantes en esta competición");
		System.out.println("\nBRONCE");
		if (copia.size() != 0) {

			Participante p = obtenerMayor(copia);
			double marca = copia.get(p);
			System.out.printf("%s con %.2f puntos", p.getNombre(), marca);
			copia.remove(p);
		} else
			System.out.println("No hay participantes en esta competición");
	}

	public void obtenerMedalla(String medalla, HashMap<Participante, Double> copia) {
		System.out.println(medalla);
		if (copia.size() != 0) {
			Participante p = obtenerMayor(copia);
			double mayor = copia.get(p);
			System.out.printf("%s con .2f puntos\n", p.getNombre(), mayor);
			copia.remove(p);
			Iterator<Map.Entry<Participante, Double>> iterador = copia.entrySet().iterator();
			while (iterador.hasNext()) {
				Map.Entry<Participante, Double> elemento = iterador.next();
				if (elemento.getValue() == mayor) {
					System.out.printf("%s con %.2f puntos\n", elemento.getKey().getNombre(), mayor);
					iterador.remove();
				}
			}
		} else
			System.out.println("No hay mas participantes en esta competición");
	}

	public Participante obtenerMayor(HashMap<Participante, Double> lista) {
		double mayor = -1;
		Participante pMayor = null;
		for (Participante p : lista.keySet())
			if (lista.get(p) > mayor) {
				mayor = lista.get(p);
				pMayor = p;
			}
		return pMayor;
	}
}
