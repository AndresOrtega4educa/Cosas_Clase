package ConsultaMedica;

import java.util.ArrayList;

public class CentroMedico {

	private String nombre;
	private String codigo;

	ArrayList<Paciente> pacientes = new ArrayList<>();
	ArrayList<Medico> medicos = new ArrayList<>();
	ArrayList<Consulta> consultas = new ArrayList<>();

	public CentroMedico(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;

	}

	public void anyadirPaciente(Paciente p) {
		pacientes.add(p);
	}

	public void anyadirMedico(Medico m) {
		medicos.add(m);
	}

	public void anyadeConsulta(Consulta c) {
		consultas.add(c);
	}

	public void listaPacientes() {
		for (Paciente p : pacientes) {
			System.out.println(p.getNombre() + " " + p.getApellido());
		}
	}

	public void eliminaMedico(Medico m) {
		medicos.remove(m);
	}
	
	public void eliminaPaciente(Paciente p) {
		pacientes.remove(p);
	}
	
	public void listaMedicos() {
		for (Medico m : medicos) {
	        System.out.println((m.getNombre())+", "+(m.getApellido()));
	    }
	}
	
	public void listaPaciente() {
		for (Paciente p : pacientes) {
	        System.out.println((p.getNombre()) + ", " + (p.getApellido()));
	    }
	}
}
