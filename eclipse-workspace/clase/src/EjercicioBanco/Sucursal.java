package EjercicioBanco;

import java.util.ArrayList;

public class Sucursal {

	private String calle;
	private Banco banco;
	private int numero;
	private int codPost;
	private String ciudad;
	private int codigo;

	ArrayList<Cliente> clientes = new ArrayList<>();
	ArrayList<Cuenta> cuentas = new ArrayList<>();

	public Sucursal(Banco b, String calle, int numero, int codPost, String ciudad, int codigo) {

		this.banco = b;
		this.calle = calle;
		this.numero = numero;
		this.codPost = codPost;
		this.ciudad = ciudad;
		this.codigo = codigo;

		b.nuevaSucursal(this);

	}

	public String getCiudad() {
		return this.ciudad;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void anyadeCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void listarClientes() {
		System.out.println("***Sucursal; " + this.ciudad + " / Código: (" + this.codigo + ")***\n----------------------------------------");
		for (Cliente c : clientes) {
			System.out.println("-" + c.getApellidos() + ", " + c.getNombre() + "(" + c.getNif() + ")\n");
		}
	}

	public void anyadeCuenta(Cuenta c) {
	this.cuentas.add(c);

	}
	
	public String getCodigoCompleto() {
		return this.banco.getCodigo()+ " "+ this.codigo;
	}
}
