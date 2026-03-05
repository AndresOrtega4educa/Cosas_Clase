package Concesionario;

public class Main {

	public static void main(String[] args) {

		Conductor conductor1 = new Conductor("01675583X", 2005, 2025, 8);
		Conductor conductor2 = new Conductor("45678931J", 2007, 2026, 0);
		Coche coche1 = new Coche("8547-GPT", 1990, "Andrés");

		conductor1.mostrar();
		System.out.println("\n---------------------------------------------------\n");
		conductor2.mostrar();
		System.out.println("\n---------------------------------------------------\n");
		coche1.mostrar();
		System.out.println("\n---------------------------------------------------\n");

	}
}