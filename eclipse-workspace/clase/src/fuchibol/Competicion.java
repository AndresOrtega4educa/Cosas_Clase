package fuchibol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;

public class Competicion {

	private String nombre;
	HashSet<Equipo> listaEquipos = new HashSet<>();
	HashSet<Partido> partidos = new HashSet<>();
	ArrayList<Jornada> jornadas = new ArrayList();
	

	public Competicion(String nombre) {
		this.nombre = nombre;
	}

	public void anyadeEquipo(Equipo equipo) {
		listaEquipos.add(equipo);
	}

	public void anyadeEquipos(HashSet<Equipo> equipos) {
		listaEquipos.addAll(equipos);
	}

	public void verClasificacion() {
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaHoy = fecha.format(formato);

		System.out.println(
				"------------------------------------------------------------------------------------------------------");
		System.out.println("Competición:" + this.nombre + " // Clasificación a día:" + fechaHoy);
		System.out.println(
				"------------------------------------------------------------------------------------------------------");
		System.out.printf("%-25s | %3s | %2s | %2s | %2s | %2s | %3s | %3s |\n", "EQUIPO", "Pts", "PJ", "PG", "PE",
				"PP", "GF", "GC");
		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		ArrayList<Equipo> listaEquiposOrdenada = this.ordenarClasif();

		for (Equipo e : listaEquiposOrdenada) { // ← USAR LA ORDENADA
			int PJ = e.getPG() + e.getPP() + e.getPE();
			System.out.printf("%-25s | %3d | %2d | %2d | %2d | %2d | %3d | %3d |\n", e.getNombre(), e.getPts(), PJ,
					e.getPG(), e.getPE(), e.getPP(), e.getGF(), e.getGC());
		}
	}

	public ArrayList<Equipo> ordenarClasif() {

	    ArrayList<Equipo> ordenada = new ArrayList<>();
	    ArrayList<Equipo> desordenada = new ArrayList<>(this.listaEquipos);

	    while (!desordenada.isEmpty()) {

	        Equipo equipoMayor = null;

	        for (Equipo n : desordenada) {
	            equipoMayor = decideCualVaAntes(n, equipoMayor);  // ← USAR n
	        }

	        ordenada.add(equipoMayor);
	        desordenada.remove(equipoMayor);
	    }
	    return ordenada;
	}

		
	public Equipo decideCualVaAntes(Equipo equipo1, Equipo equipo2) {

	    if (equipo1 == null) return equipo2;
	    if (equipo2 == null) return equipo1;

	    if (equipo1.getPts() > equipo2.getPts()) {
	        return equipo1;
	    }
	    else if (equipo1.getPts() < equipo2.getPts()) {
	        return equipo2;
	    }
	    else {
	        int dif1 = equipo1.getGF() - equipo1.getGC();
	        int dif2 = equipo2.getGF() - equipo2.getGC();
	        if (dif1 > dif2) return equipo1;
	        else return equipo2;
	    }
	}
}

