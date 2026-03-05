package clase;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Trabajoenclase2 {
	public static void main(String[] args) {

		// ***************************************************
		// Boletín 8
		// ***************************************************

		// Ejercicio 1 boletín 8:

		/*
		 * int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };
		 * 
		 * System.out.println("Matriz original:"); PrintMatriz(matriz);
		 * 
		 * System.out.println("\nMatriz traspuesta:"); TrasponerMatriz(matriz); }
		 * 
		 * public static void PrintMatriz(int[][] matriz) { for (int i = 0; i <
		 * matriz.length; i++) { System.out.print("|"); for (int j = 0; j <
		 * matriz[i].length; j++) { System.out.printf("%2d", matriz[i][j]); }
		 * System.out.println(" |"); } }
		 * 
		 * public static void TrasponerMatriz(int[][] matriz) { for (int i = 0; i <
		 * matriz[0].length; i++) { System.out.print("|"); for (int j = 0; j <
		 * matriz.length; j++) { System.out.printf("%2d", matriz[j][i]); }
		 * System.out.println(" |"); }
		 */

		// Ejercicio 2 boletín 8:

		/*
		 * Scanner teclado = new Scanner(System.in); boolean correcto = true;
		 * 
		 * do { System.out.print("Escribe tu contraseña: "); String contraseña =
		 * teclado.nextLine(); correcto = true; if (compruebaMayusculas(contraseña) ==
		 * false) { System.out.println("No tiene mayúsculas"); correcto = false; } if
		 * (compruebaMinusculas(contraseña) == false) {
		 * System.out.println("No tiene minúsculas"); correcto = false; } if
		 * (compruebaNumeros(contraseña) == false) {
		 * System.out.println("No tiene números"); correcto = false; } if
		 * (compruebaSimbolos(contraseña) == false) {
		 * System.out.println("No tiene símbolos"); correcto = false; } if
		 * (compruebaLongitud(contraseña) == false) {
		 * System.out.println("No tiene la longitud correcta"); correcto = false; }
		 * 
		 * } while (correcto == false); System.out.println("Contraseña correcta"); }
		 * 
		 * 
		 * public static boolean compruebaMayusculas(String p) { Pattern mayusculas =
		 * Pattern.compile("[A-ZÑ]{1}"); Matcher tieneMayusculas =
		 * mayusculas.matcher(p); return (tieneMayusculas.find()); }
		 * 
		 * public static boolean compruebaMinusculas(String p) { Pattern minusculas =
		 * Pattern.compile("[a-zñ]{1}"); Matcher tieneMinusculas =
		 * minusculas.matcher(p); return (tieneMinusculas.find()); } public static
		 * boolean compruebaNumeros(String p) { Pattern numeros =
		 * Pattern.compile("[0-9]{1}"); Matcher tieneNumeros = numeros.matcher(p);
		 * return (tieneNumeros.find()); } public static boolean
		 * compruebaSimbolos(String p) { Pattern simbolos = Pattern.compile("[-_!?*]");
		 * Matcher tieneSimbolos = simbolos.matcher(p); return (tieneSimbolos.find()); }
		 * 
		 * public static boolean compruebaLongitud(String p) {
		 * 
		 * return (p.matches(".{8,20}"));
		 */

		// Ejercicio 3 boletín 8:

		/*
		 * String cadenaaProbar = "O atacas en guerra o te expulsamos del clan"; int i =
		 * 0; int j = cadenaaProbar.length() - 1; String txtCifrado = ""; while (i < j)
		 * { txtCifrado += cadenaaProbar.charAt(j); txtCifrado +=
		 * cadenaaProbar.charAt(i); i++; j--; } if (cadenaaProbar.length() % 2 != 0)
		 * txtCifrado += cadenaaProbar.charAt(cadenaaProbar.length() / 2);
		 * System.out.println("Tu cadena original es: "+ cadenaaProbar );
		 * System.out.println("Tu cadena cifrada queda: "+txtCifrado);
		 */

		// Ejercicio 6 boletín 8:

		/*
		 * String palindromo = "Dábale arroz a la zorra el abad"; String reverse = "";
		 * palindromo = palindromo.toLowerCase(); palindromo = palindromo.replace(" ",
		 * ""); palindromo = palindromo.replace("á", "a"); palindromo =
		 * palindromo.replace("é", "e"); palindromo = palindromo.replace("í", "i");
		 * palindromo = palindromo.replace("ó", "o"); palindromo =
		 * palindromo.replace("ú", "u");
		 * 
		 * for(int i=palindromo.length()-1;i>=0;i--) { reverse
		 * =reverse+palindromo.charAt(i); }
		 * 
		 * if(reverse.equals(palindromo)) {
		 * System.out.println("Tu palabra es un palíndromo"); } else
		 * System.out.println("Tu palabra no es un palíndromo");
		 */

		// Ejercicio 7 boletín 8:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce un entero y te diré si es narcisista: "); String
		 * numero = teclado.nextLine(); teclado.close(); int suma = 0; int exponente =
		 * numero.length(); for (int i = 0; i < numero.length(); i++) { // int n
		 * =numero.charAt(i)-'0'; int n = Character.getNumericValue(numero.charAt(i));
		 * suma += Math.pow(n, exponente); } if (suma == Integer.parseInt(numero))
		 * System.out.println(numero + " es narcisista"); else System.out.println(numero
		 * + " no es narcisita");
		 */

		// ***************************************************
		// Boletín 10
		// ***************************************************

		// Ejercicio 1

		/*
		 * boolean correcto; int amigo1 = 0; int amigo2 = 0; do {
		 * 
		 * try { Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce un número: "); amigo1 = teclado.nextInt();
		 * System.out.println("Introduce otro número: "); amigo2 = teclado.nextInt();
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Has metido algo incorrecto"); correcto = false; } } while
		 * (correcto == false); if(esAmigo(amigo1, amigo2) == true) {
		 * System.out.println("Tus números son amigos"); } else {
		 * System.out.println("Tus números no son amigos"); }
		 * 
		 * }
		 * 
		 * public static boolean esAmigo(int amigo1, int amigo2) { int resultado = 0;
		 * for (int i = 1; i < amigo1; i++) if (amigo1 % i == 0) { resultado += i; } if
		 * (resultado == amigo2) { return true; } else { return false; }
		 */
		// ***************************************************
		// Ejercicio 2

		/*
		 * boolean correcto; int perfecto1 = 0; do {
		 * 
		 * try { Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce un número: "); perfecto1 = teclado.nextInt();
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Has metido algo incorrecto"); correcto = false; } } while
		 * (correcto == false); if(esPerfecto(perfecto1) == true) {
		 * System.out.println("Tu número es perfecto"); } else {
		 * System.out.println("Tu número no es perfecto"); }
		 * 
		 * }
		 * 
		 * public static boolean esPerfecto(int perfecto1) { int resultado = 0; for (int
		 * i = 1; i < perfecto1; i++) if (perfecto1 % i == 0) { resultado += i; } if
		 * (resultado == perfecto1) { return true; } else { return false; }
		 */
		// ***************************************************
		// Ejercicio 3

		/*
		 * boolean correcto; int abundante1 = 0; do {
		 * 
		 * try { Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce un número: "); abundante1 = teclado.nextInt();
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Has metido algo incorrecto"); correcto = false; } } while
		 * (correcto == false); if (esAbundante(abundante1) == true) {
		 * System.out.println("Tu número es abundante"); } else {
		 * System.out.println("Tu número no es abundante"); }
		 * 
		 * }
		 * 
		 * public static boolean esAbundante(int abundante1) { int resultado = 0; for
		 * (int i = 1; i < abundante1; i++) if (abundante1 % i == 0) { resultado += i; }
		 * if (resultado > abundante1) { return true; } else { return false; }
		 */

		// ***************************************************
		// Ejercicio 4

		/*
		 * boolean correcto; int defectivo1 = 0; do {
		 * 
		 * try { Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce un número: "); defectivo1 = teclado.nextInt();
		 * correcto = true; } catch (Exception e) {
		 * System.out.println("Has metido algo incorrecto"); correcto = false; } } while
		 * (correcto == false); if (esDefectivo(defectivo1) == true) {
		 * System.out.println("Tu número es defectivo"); } else {
		 * System.out.println("Tu número no es defectivo"); }
		 * 
		 * }
		 * 
		 * public static boolean esDefectivo(int defectivo1) { int resultado = 0; for
		 * (int i = 1; i <= defectivo1; i++) if (defectivo1 % i == 0) { resultado += i;
		 * } if (resultado < (2 * defectivo1)) { return true; } else { return false; }
		 */

		// ++++++++++++++++++++++++++++++FIN DEL EJERCICIO++++++++++++++++++++++++++++

		// LLenar un array con numeros random

		// 1. Crear un objeto Random
		/*
		 * Random random = new Random();
		 * 
		 * // 2. Declarar e inicializar el array int[] numeros = new int[10]; // Un
		 * array de 10 enteros
		 * 
		 * // 3. Llenar el array con números aleatorios for (int i = 0; i <
		 * numeros.length; i++) { // nextInt(bound) genera un número entre 0 (inclusivo)
		 * y el límite (exclusivo) numeros[i] = random.nextInt(100); // Números entre 0
		 * y 99 }
		 * 
		 * // 4. Imprimir el array (opcional)
		 * System.out.print("Tu array se queda así: "); for (int numero : numeros) {
		 * System.out.print(numero + " "); }
		 */
		// +++++++++++++++++++++++++FIN DEL EJERCICIO+++++++++++++++++

		// Ejercicio 1

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Cuántos dados vas a tirar?: "); int numDados = 0;
		 * 
		 * boolean entradaCorrecta = false; while(entradaCorrecta == false) {
		 * entradaCorrecta = true; try { numDados = teclado.nextInt(); if(numDados <=0)
		 * { entradaCorrecta=false;
		 * System.out.println("Entrada incorrecta.\nVuelve a intentarlo: "); }
		 * }catch(Exception e) {
		 * System.out.print("Entrada incorrecta.\nVuelve a intentarlo: ");
		 * teclado.nextLine(); entradaCorrecta = false; } } int contadorUno = 0; int
		 * contadorSeis = 0; int suma = 0;
		 * 
		 * for (int i = 0; i < numDados; i++) { int dado = (int) ((Math.random() * 6) +
		 * 1); System.out.print(dado); if (i != numDados - 1) System.out.print(", ");
		 * else System.out.println(""); if (dado == 1) contadorUno++; else if (dado ==
		 * 6) contadorSeis++; suma += dado; } if (contadorUno != 0)
		 * System.out.println("En " + contadorUno + " dados ha salido un 1"); if
		 * (contadorSeis != 0) System.out.println("En " + contadorSeis +
		 * " dados ha salido un 6"); System.out.println("La suma de todos los dados da "
		 * + suma); int media =3*numDados; if (media>suma)
		 * System.out.println("Tu tirada está por debajo de la mitad ("+media+")"); else
		 * if (media<suma)
		 * System.out.println("Tu tirada está por encima de la mitad ("+media+")"); else
		 * System.out.println("Tu tirada es exactamente la mitad ("+media+")");
		 * 
		 */

		// Ejercicio 2

		/*String[] clientes = { "Pepe Potamo", "José Morales", "Ángela Rubio", "Ricardo Borrique" };
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuántos premios vas a repartir? ");
		int numPremios = teclado.nextInt();
		teclado.close();
		int numClientes = clientes.length;
		if (numClientes == numPremios)
			System.out.println("Tienes solo " + numClientes + " clientes...");
		else if (numClientes < numPremios) {
			System.out.println("Tienes solo " + numClientes + " clientes...");
			System.out.println("Te sobran " + (numPremios - numClientes + " premios"));
		} else {
			int premiosRepartidos = 0;
			while (premiosRepartidos < numPremios) {
				int premio = (int) (Math.random() * numClientes);
				if (clientes[premio] != null) {
					int posicion = clientes[premio].indexOf(" ");
					String nombre = clientes[premio].substring(0, posicion);
					String apellido = clientes[premio].substring(posicion + 1);
					System.out.println(clientes[premio]);
					clientes[premio] = null;
					premiosRepartidos++;
				}
			}
			for (int i = 0; i < numPremios; i++) {
				int premio = (int) (Math.random() * numClientes);
				System.out.println(clientes[premio]);
	}
}*/
		
		//Ejercicio 3
		
	/*	capicuas(12,14);
	}
	
	public static void capicuas (int n1, int n2) {
		int contador =0;
		for(int i=n1; i<=n2;i++) {
			if(esCapicua(i)) {
				System.out.println(i);
				contador++;
			}
		}
		if(contador==0)
			System.out.println("No hay ningún número capicua");
		}
		
	
	public static boolean esCapicua(int n) {
		boolean capicua = false;
		String nTxt = String.valueOf(n);
		
		String nTxtInvertido= "";
		for(int i= nTxt.length()-1; i>=0;i--)
			nTxtInvertido+=nTxt.charAt(i);
		
		if (nTxt.equals(nTxtInvertido))
			capicua=true;
		return capicua;*/
		
	}
}
