package ConsultaMedica;

public class Paciente extends Persona {
	private String dni;
	private int tlfno;
	
	
	private CentroMedico centro;

	public Paciente(String nombre, String apellido, String dni, int tlfno, CentroMedico centro) {
		super(nombre, apellido,centro);
		this.dni = dni;
		this.tlfno = tlfno;
		this.centro= centro;
	
		

	}

	public void cambiaCentro(CentroMedico c) {
		this.centro.eliminaPaciente(this);
		this.centro=c;
		this.centro.anyadirPaciente(this);
		
	}
	
	public void anyadeConsulta(Consulta c) {
		consultas.add(c);
	}
	
}
