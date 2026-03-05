package ConsultaMedica;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		CentroMedico AlamOs = new CentroMedico("Alameda de Osuna", "CM-9999");
		
		Medico m1 = new Medico("Alberto", "Suárez", "Neurocirujano", "094867", AlamOs);
		Paciente p1 = new Paciente("Marcocks", "Parker", "39583958G", 628528659, AlamOs);
		Consulta c1p1 = new Consulta(p1, m1, LocalDate.of(2024, 5, 12), "Leve dolor de cabeza","Paracetamol cada 8 horas");
	

		AlamOs.listaMedicos();
		AlamOs.listaPacientes();
	    c1p1.muestraConsulta();
		
	}

}
