package ConsultaMedica;

import java.time.LocalDate;

public class Consulta {

	private Paciente paciente;
	private Medico medico;
	private LocalDate fecha;
	private String desc;
	private String consejo;

	public Consulta(Paciente p, Medico m, LocalDate f, String d, String c) {
		this.paciente = p;
		this.medico = m;
		this.fecha = f;
		this.desc = d;
		this.consejo = c;

		CentroMedico centro1 = this.medico.getCentro();
		centro1.anyadeConsulta(this);
		this.medico.anyadeConsulta(this);
		this.paciente.anyadeConsulta(this);
	}

	public void muestraConsulta() {
		System.out.println("("+this.fecha+") - Doctor: "+ this.medico.getApellido()+", "+this.medico.getNombre() );
		System.out.println("Paciente: "+ this.paciente.getApellido()+", "+this.paciente.getNombre());
		System.out.println("Síntomas: "+ this.desc);
		System.out.println("Diagnóstico: "+ this.consejo);
	}

}
