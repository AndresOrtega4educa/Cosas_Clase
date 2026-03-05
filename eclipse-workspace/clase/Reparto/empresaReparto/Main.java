package empresaReparto;

public class Main {

	public static void main(String[] args) {
		// Peso, coordenada x e y
		new Paquete(30.6, 4, 2);
		new Paquete(10.8, 6, 7);
		new Paquete(30.5, 1, 6);
		new Paquete(10.8, 2, 7);
		new Paquete(3.5,1,1);

		// Peso máx y kms máx diarios
		Furgoneta f1 = new Furgoneta(100, 100);

		f1.calcularRuta();
		f1.mostrarRuta();

	}
}