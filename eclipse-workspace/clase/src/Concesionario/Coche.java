package Concesionario;

import java.time.LocalDate;

public class Coche extends Vehiculo {
	private int edadCoche;
	private int precio;

	public Coche(String matricula, int anyoFabricacion, String nombre) {
		super(matricula, anyoFabricacion, nombre);

	}

	public void calcularPrecioSeguro() {
		int año = LocalDate.now().getYear();
		this.edadCoche = año - this.anyoFabricacion;
		precio = 400+500+700;
		
	}

	public void mostrar() {
		System.out.println(
				"Los datos del coche son: \n" + this.matricula + " // " + this.anyoFabricacion + " // " + this.nombre);
	}

}
