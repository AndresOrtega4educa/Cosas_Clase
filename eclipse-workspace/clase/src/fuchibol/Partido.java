package fuchibol;

import java.util.HashSet;

public class Partido {
	Equipo local;
	Equipo visitante;
	
	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
	}

	public void mostrarResultado(int golesLocal, int golesVisitante) {
		if(golesLocal>golesVisitante) {
			local.ganaPartido();
			visitante.pierdePartido();
		}else if(golesLocal<golesVisitante) {
			local.pierdePartido();
			visitante.ganaPartido();
		}else {
			local.empataPartido();
			visitante.empataPartido();
		}
		local.cambiaGoles(golesLocal,golesVisitante);
		visitante.cambiaGoles(golesVisitante,golesLocal);
		System.out.println("\nEl partido entre el: " + local.getNombre() + " y el " + visitante.getNombre()
				+ " Ha resultado en un " + golesLocal + ":" + golesVisitante + "\n");
		
	}
	
}
