package empresaReparto;

import java.util.HashSet;

public class Furgoneta {

	private static Localizacion puntoPartida = new Localizacion(0,0);
	private double pesoMax;
	private double kmsMax;
	private Ruta ruta = new Ruta();
	
	public Furgoneta(double pesoMax, double kmsMax) {
		this.pesoMax = pesoMax;
		this.kmsMax=kmsMax;
	}
	
	public void calcularRuta() {
		Paquete destino = Paquete.destinoMasCercano(puntoPartida);
		int peso =0;
		int distancia=0;
		while(destino != null || peso>pesoMax || distancia>kmsMax) {
			ruta.anyadirEntrega(destino);
			Localizacion nuevoOrigen = destino.getLocalizacion();
			Paquete.borrarDestino(destino);
			destino = Paquete.destinoMasCercano(nuevoOrigen);
		}
			
	}
	
	public void mostrarRuta() {
		ruta.mostrarRuta();
	}
	
}
