package SegundoTrimestre;

public class EquiPokemon {

	private String entrenador;
	private Pokemon[] equipo = new Pokemon[3];
			
			public EquiPokemon(String entrenador, Pokemon p5, Pokemon p6, Pokemon p7) {
			this.entrenador = entrenador;
			this.equipo[0] = p5;
			this.equipo[1] = p6;
			this.equipo[2] = p7;
			}
		
			public void mostrar() {
				System.out.println("Entrenador: "+this.entrenador);
				for (int i=0; i<3;i++) {
					this.equipo[i].mostrar();
				}
			}
}
