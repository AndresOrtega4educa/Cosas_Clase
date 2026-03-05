package empresaReparto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Paquete {

	private static HashSet<Paquete> almacen = new HashSet<>();

	private double peso;
	private Localizacion ubi;
	private int x;
	private int y;

	public Paquete(double peso, int x, int y) {

		this.peso = peso;
		this.ubi = new Localizacion(x, y);
		almacen.add(this);
	}

	public static Paquete destinoMasCercano(Localizacion origen) {
		HashMap<Paquete, Double> distancias = new HashMap<>();
		Paquete destino = null;
		if (Paquete.almacen.size() != 0) {
			for (Paquete paquete : Paquete.almacen) {
				// por cada paquete, calculo la distania usando la funcion que hice ayer
				double distancia = paquete.distancia(paquete.ubi);
				// y meto en el diccionario una entrada nueva con el paquete y su distancia
				distancias.put(paquete, distancia);
			}
			// al final devuelvo el paquete con menor distancia
			double minimo = Double.MAX_VALUE;
			for (Map.Entry<Paquete, Double> entrega : distancias.entrySet()) {
				if (entrega.getValue() < minimo) {
					minimo = entrega.getValue();
					destino = entrega.getKey();
				}
			}
		}
		// no olvides comprobar en algun momento que la lista de paquetes no está vacia
		return destino;
	}

	public int obtenerX() {

		return ubi.obtenerX();
	}

	public int obtenerY() {
		return ubi.obtenerY();
	}

	public double distancia(Localizacion destino) {

		double distx = Math.pow(destino.obtenerX() - this.ubi.obtenerX(), 2);
		double disty = Math.pow(destino.obtenerY() - this.ubi.obtenerY(), 2);

		double distancia = Math.sqrt(distx + disty);
		return distancia;
	}

	public Localizacion getLocalizacion() {

		return ubi;
	}

	public static void borrarDestino(Paquete entrega) {
		Paquete.almacen.remove(entrega);

	}

}
