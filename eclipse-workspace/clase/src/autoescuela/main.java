package autoescuela;

public class main {

	public static void main(String[] args) {

		new Pregunta("Que espejos son obligatorios en un turismo?", "El izquierdo", "El derecho", "Ninguno");
		new Pregunta("Con cuantos puntos empiezas en el carnét al momento de sacartelo?", "8 puntos", "12 puntos",
				"15 puntos");
		new Pregunta("Se puede conducir una bicicleta por una autopista?", "En ningun caso", "Si,si llevas casco",
				"Si, si respetas la velocidad máxima");

		Examen e1 = new Examen(3, Pregunta.getListaPreguntas());
		e1.mostrarExamen();
		e1.corregirExamen();
		e1.solucionExamen();

	}
}
