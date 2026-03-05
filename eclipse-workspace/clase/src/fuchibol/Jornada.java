package fuchibol;

public class Jornada {

	int partido;
	Equipo local;
	Equipo visitante;
	int golesLocal = local.getGF();
	int golesVisitante = visitante.getGF();
	
	public Jornada(int partido, Equipo local, Equipo visitante) {
		this.partido = partido;
		this.local = local;
		this.visitante = visitante;
		
	}
	
	
	
}
