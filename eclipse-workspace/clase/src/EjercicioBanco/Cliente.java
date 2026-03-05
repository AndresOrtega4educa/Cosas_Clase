package EjercicioBanco;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String nif;
	private int tlfno;
	private Sucursal sucursal;
	ArrayList<Cuenta> cuentas = new ArrayList<>();

	public Cliente(String nombre, String apellidos, String nif, int tlfno, Sucursal sucursal) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.tlfno = tlfno;
		this.sucursal = sucursal;
		this.sucursal.anyadeCliente(this);
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public String getNif() {
		return this.nif;
	}

	public void anyadeCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

}
