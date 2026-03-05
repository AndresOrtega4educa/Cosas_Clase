package EjercicioBanco;

public class main {

	public static void main(String[] args) {

		Banco banco = new Banco("Créditos Informáticos", "ES68 1234");
		Sucursal madrid = new Sucursal(banco, "Calle del pez volador", 5, 8900, "Madrid", 21894);
		Sucursal sevilla = new Sucursal(banco, "Calle Lanza", 7, 7800, "Sevilla", 36753);
		Cliente c1 = new Cliente("Marcocks", "Calvo", "01657883D", 687453629, madrid);
		Cliente c2 = new Cliente("Zishan", "Ashfaq", "67453792A", 629538456, sevilla);
		Cliente c3 = new Cliente("Andrea", "Coronado", "23452359F", 682395216, madrid);
		Cuenta cuenta1 = new Cuenta(c3, 879.56, sevilla, "473828593029");
		Cuenta cuenta2 = new Cuenta(c2, c1, 500.31, sevilla, "473828593029");

		banco.listarSucursales();
		madrid.listarClientes();
		sevilla.listarClientes();
		cuenta1.verCuenta();
		cuenta2.verCuenta();
	}

}
