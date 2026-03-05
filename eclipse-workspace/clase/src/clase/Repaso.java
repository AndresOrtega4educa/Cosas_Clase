package clase;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		int numero_secreto=(int) (Math.random()*10 -1)+1;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Estoy pensando un número, intenta adivinarlo: ");
		int entrada = teclado.nextInt();
		while(entrada!=numero_secreto) {
			System.out.print("Tu número no coincide con el que estoy pensando, prueba otra vez: ");
			entrada = teclado.nextInt();
		}
		System.out.println("Enhorabuena has acertado, mi número era el: " + numero_secreto);
	}

}
