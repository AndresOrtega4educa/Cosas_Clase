package Concesionario;

import java.time.LocalDate;

public class Conductor {
	private String nif;
	private int anyoNacimiento;
	private int anyoCarnet;
	private int puntosCarnet;
	private int edad;
	private int fecha;

	public Conductor(String nif, int anyoNacimiento, int anyoCarnet, int puntosCarnet) {
		this.nif = nif;
		this.anyoNacimiento = anyoNacimiento;
		this.anyoCarnet = anyoCarnet;
		this.puntosCarnet = puntosCarnet;
	}

	public void mostrar() {
		int año = LocalDate.now().getYear();
		this.fecha = año - this.anyoCarnet;
		this.edad = año - this.anyoNacimiento;
		System.out.println("Los datos del conductor son: \n" + "\nNIF: " + this.nif + " //" + " Edad: " + edad + " //"+ " Años con el carnet: " + fecha + " //" + " Puntos del carnet: " + this.puntosCarnet);
	}

}
