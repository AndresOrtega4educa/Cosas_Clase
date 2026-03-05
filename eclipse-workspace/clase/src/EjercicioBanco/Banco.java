package EjercicioBanco;

import java.util.ArrayList;

public class Banco {

	public static String getCodigo;
	Sucursal sucursal;
	String nombre;
	String codigo;
	ArrayList<Sucursal> sucursales = new ArrayList<>();

	public Banco(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		
	}

	public void nuevaSucursal(Sucursal s) {
		this.sucursales.add(s);
	}

	public void listarSucursales() {
		System.out.println("|||Banco; " + this.nombre + " / Código: (" + this.codigo + ")|||\n--------------------------------------------------------");
		for (Sucursal s : sucursales) {
			System.out.println("-" + s.getCiudad() + "(" + s.getCodigo() + ")");
		}
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
}
