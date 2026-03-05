package ConsultaMedica;

public class Medico extends Persona {
	private String especialidad;
	private String nCol;


	private CentroMedico centro;

	public Medico(String nombre, String apellido, String especialidad, String nCol, CentroMedico centro) {
		super(nombre, apellido, centro);
		this.especialidad = especialidad;
		this.nCol = nCol;
		this.centro = centro;
		centro.anyadirMedico(this);
		
	}

	public void cambiaCentro(CentroMedico c) {
		this.centro.eliminaMedico(this);
		this.centro=c;
		this.centro.anyadirMedico(this);
	}
	
	public void anyadeConsulta(Consulta c) {
		consultas.add(c);
	}
	
}
