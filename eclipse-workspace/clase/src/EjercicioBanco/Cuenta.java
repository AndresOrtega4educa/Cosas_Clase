
package EjercicioBanco;

public class Cuenta {

	private Cliente cliente1;
	private Cliente cliente2 = null;
	private double saldo;
	private Sucursal sucursal;
	private String codigo;

	public Cuenta(Cliente cliente1, double saldo, Sucursal sucursal, String codigo) {

		this.cliente1 = cliente1;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.codigo = codigo;

		
	}

	public Cuenta(Cliente cliente1, Cliente cliente2, double saldo, Sucursal sucursal, String codigo) {

		this.cliente1 = cliente1;
		this.cliente2 = cliente2;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.codigo = codigo;

		
	}

	public String getIBAN() {
		return sucursal.getCodigoCompleto()+" "+this.codigo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void verCuenta() {
		System.out.println(this.getIBAN()+ "  -  " +this.getSaldo()+"€");
	}
	
}
