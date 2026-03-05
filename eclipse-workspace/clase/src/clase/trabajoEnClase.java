package clase;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class trabajoEnClase {
	final static int MINA = 7;

	public static void main(String[] args) {

		// +++++++++++MUY IMPORTANTE PATTERN Y+++
		// ++++++++++++++++++MATCHER+++++++++++++

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu correo electrónico: "); String correo =
		 * teclado.nextLine();
		 * 
		 * // Expresión regular para validar un email String expresionRegular =
		 * "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; // Inicio de la
		 * cadena,Letras, // números o símbolos válidos // antes del @,Símbolo //
		 * obligatorio // Nombre del dominio,Punto literal (se escapa con \\),Extensión
		 * (al menos 2 // letras, como .com, .es, .org) // Compilamos el patrón //$= Fin
		 * de la cadena. Pattern pattern = Pattern.compile(expresionRegular);
		 * 
		 * // Creamos el matcher con el texto a evaluar Matcher matcher =
		 * pattern.matcher(correo);
		 * 
		 * // Verificamos si coincide con el patrón if (matcher.matches()) {
		 * System.out.println(" El correo es válido."); } else
		 * 
		 * { System.out.println(" El correo no es válido."); } teclado.close();
		 */

		// \/\/\/\/\/\/\/\/\/\/\/
		// Ejercicios de repaso para el examen
		// \/\/\/\/\/\/\/\/\/\/\/

		// Primero

		// Ejercicio 1: gemera 5 numeros aleatorios que esten entre el 1 y el
		// introducido por teclado.
		// Cuando metas un numero menor que 10 no sea valido y que sean todos pares y no
		// se repitan

		// ----------------------SOLUCIÓN------------------------------

		/*
		 * Scanner teclado = new Scanner(System.in); int inicio = 1; int fin;
		 * 
		 * // Pedir número hasta que sea válido (igual o mayor que 10) do {
		 * System.out.print("Dime un número igual o mayor que 10: "); fin =
		 * teclado.nextInt(); if (fin < 10) {
		 * System.out.println("Número no válido. Intenta otra vez."); } } while (fin <
		 * 10);
		 * 
		 * int[] numerosPares = new int[5]; int contador = 0;
		 * 
		 * // Generar 5 números pares aleatorios distintos while (contador < 5) { int
		 * resultado = (int) (Math.random() * (fin - inicio + 1) + inicio);
		 * 
		 * if (resultado % 2 == 0 && !repetido(numerosPares, contador, resultado)) {
		 * numerosPares[contador] = resultado; contador++; } }
		 * 
		 * System.out.println("5 números aleatorios pares entre " + inicio + " y " + fin
		 * + ":\n"); for (int i = 0; i < numerosPares.length; i++) {
		 * System.out.println("Numero aleatorio " +(i+1)+": " + numerosPares[i]); }
		 * 
		 * teclado.close(); }
		 * 
		 * // Método para comprobar si el número ya está en el array public static
		 * boolean repetido(int[] array, int tamaño, int numero) { for (int i = 0; i <
		 * tamaño; i++) { if (array[i] == numero) { return true; } } return false;
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 2: Genera 10 numeros entre el 1 y el 1000 y que de ellos encuentra
		// cual es el mayor y el menor
		// cuenta cuantos numeros son pares e impares y que lo dejes bonito:

		// -----------------------------------SOLUCIÓN------------------------------------
		/*
		 * int inicio = 1; int fin = 1000; int[] numeros = new int[10]; // Guardamos los
		 * 10 números int mayor = inicio; int menor = fin; int pares = 0; int impares =
		 * 0;
		 * 
		 * System.out.println("Generando 10 números aleatorios entre " + inicio + " y "
		 * + fin + "...\n");
		 * 
		 * // Generar los números y analizar for (int i = 0; i < 10; i++) { int
		 * numeroRandom = (int) (Math.random() * (fin - inicio + 1) + inicio);
		 * numeros[i] = numeroRandom;
		 * 
		 * // Revisar mayor y menor if (numeroRandom > mayor) { mayor = numeroRandom; }
		 * if (numeroRandom < menor) { menor = numeroRandom; }
		 * 
		 * // Contar pares e impares if (numeroRandom % 2 == 0) { pares++; } else {
		 * impares++; } }
		 * 
		 * // Mostrar resultados System.out.println("Números generados:"); for (int i =
		 * 0; i < numeros.length; i++) { System.out.print(numeros[i]);
		 * 
		 * 
		 * if(i<numeros.length-1) System.out.print(", "); else System.out.print(""); }
		 * System.out.println("\n\nResultados:"); System.out.println("Mayor: " + mayor);
		 * System.out.println("Menor: " + menor);
		 * System.out.println("Cantidad de pares: " + pares);
		 * System.out.println("Cantidad de impares: " + impares);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3: Tienes que meter una frase por teclado la salida tiene que ser
		// sin vocales y sin espacios. Y tienes que contar las vocales suprimidas y los
		// espacios suprimidos.

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce una frase: "); String frase = teclado.nextLine();
		 * teclado.close();
		 * 
		 * String fraseModificada = ""; // guardará la frase sin vocales ni espacios int
		 * contadorVocales = 0; int contadorEspacios = 0;
		 * 
		 * for (int i = 0; i < frase.length(); i++) { char c = frase.charAt(i);
		 * 
		 * if (c == ' '){ contadorEspacios++; } else if ("aeiouAEIOU".indexOf(c) != -1)
		 * { contadorVocales++; } else { fraseModificada += c; // agregamos el carácter
		 * si no es vocal ni espacio } }
		 * 
		 * System.out.println("\nFrase sin vocales ni espacios: " + fraseModificada);
		 * System.out.println("Vocales suprimidas: " + contadorVocales);
		 * System.out.println("Espacios suprimidos: " + contadorEspacios);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Boletín 1

		// Ejercicio 1
		/*
		 * for (int i=1; i<11; i++) { System.out.println(i); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 2

		/*
		 * for (int i = 0; i < 50; i += 2) {
		 * 
		 * System.out.println(i); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3
		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número: "); int numero = teclado.nextInt();
		 * 
		 * for (int i=1; i<6; i++) { System.out.println(numero*i); } teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 4

		/*
		 * for(int i=0; i<1000; i+=7) { System.out.println(i);}
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número y te digo si es par o impar: "); int numero
		 * = teclado.nextInt();
		 * 
		 * if (numero%2 == 0) System.out.println("Es par "); else
		 * System.out.println("Es impar "); teclado.close();
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 6

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número y te digo si es divisible entre 3: "); int
		 * numero = teclado.nextInt();
		 * 
		 * if (numero%3 == 0) System.out.println("Es divisible entre 3 "); else
		 * System.out.println("No es divisible entre 3  "); teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 7

		/*
		 * System.out.print("Dime el precio de tu producto: "); Scanner teclado = new
		 * Scanner(System.in); int precio = teclado.nextInt();
		 * System.out.println("Sumando el 21% de IVA queda en:" + (precio + precio*0.21)
		 * + "$");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 8

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("De cuanto es la deuda?: "); double deuda =
		 * teclado.nextDouble(); System.out.print("Cuántos meses tienes?: "); int meses
		 * = teclado.nextInt();
		 * 
		 * System.out.println("El dinero por mes a pagar es de: " + (deuda/meses));
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 9

		/*
		 * int numero = (int) (Math.random() * (50)) + 1; System.out.println(numero);
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 10/11

		/*
		 * int dado1; int dado2; int contador = 0;
		 * 
		 * do { dado1 = (int) (Math.random() * 6) + 1; dado2 = (int) (Math.random() * 6)
		 * + 1; contador++;
		 * 
		 * System.out.println( dado1 + "  " + dado2); } while (dado1 != dado2);
		 * 
		 * System.out.println("¡Ambos dados sacaron el mismo número!");
		 * System.out.println("Número de tiradas: " + contador);
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 12/13

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Cuantos dados vas a tirar?: "); int numDados =
		 * teclado.nextInt(); System.out.print("De cuantas caras son los dados?: "); int
		 * numCaras = teclado.nextInt(); if (numCaras % 2 != 0)
		 * System.out.println("No existen las caras impares! ");
		 * 
		 * else {
		 * 
		 * for (int i = 0; i <= numDados; i++) { int dados = (int) (Math.random() *
		 * numCaras) + 1; System.out.println("La tirada ha salido: " + i + ": " +
		 * dados);
		 * 
		 * }
		 * 
		 * }
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 14/15

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dime un número: "); int numero1 = teclado.nextInt();
		 * System.out.print("Dame otro número: "); int numero2 =teclado.nextInt();
		 * 
		 * if (numero1>numero2) {
		 * 
		 * int numeroMedio2 = (int) (Math.random() * numero1 + numero2);
		 * System.out.println("Tu número medio es: " + numeroMedio2); } else { int
		 * numeroMedio = (int) (Math.random() * numero2 + numero1);
		 * System.out.println("Tu número medio es: " + numeroMedio);
		 * 
		 * }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 16

		/*
		 * int numero1 = (int) (Math.random() * 49 + 1); int numero2 = (int)
		 * (Math.random() * 49 + 1); int numero3 = (int) (Math.random() * 49 + 1); int
		 * numero4 = (int) (Math.random() * 49 + 1); int numero5 = (int) (Math.random()
		 * * 49 + 1); int numero6 = (int) (Math.random() * 49 + 1);
		 * System.out.println("El número de la lotería es: " + numero1 + " " + numero2 +
		 * " " + numero3 + " " + numero4 + " " + numero5 + " " + numero6);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 17

		/*
		 * for (int i = 1; i <= 15; i++) { int resultado = (int) (Math.random() * 3) +
		 * 1; // genera 1, 2 o 3
		 * 
		 * String simbolo; if (resultado == 3) { simbolo = "X"; } else { simbolo =
		 * String.valueOf(resultado); }
		 * 
		 * System.out.println("Número: " + i + ": " + simbolo); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 18

		/*
		 * int numero; int contador = 0;
		 * 
		 * do { numero = (int) (Math.random() * 1000) + 1; contador++;
		 * System.out.println("Número generado: " + numero); } while (numero != 666);
		 * 
		 * System.out.println("¡Ha salido el 666 después de " + contador +
		 * " intentos!");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 19

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número y te doy sus divisores: "); int numero =
		 * teclado.nextInt();
		 * 
		 * for (int i = 1; i <= numero; i++) {
		 * 
		 * if (numero % i == 0)
		 * 
		 * System.out.println("Los divisores de " + numero + " son: " + i); }
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 20

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce el primer número: "); int a = teclado.nextInt();
		 * 
		 * System.out.print("Introduce el segundo número: "); int b = teclado.nextInt();
		 * 
		 * System.out.print("Introduce el tercer número: "); int c = teclado.nextInt();
		 * 
		 * int[] numeros = {a, b, c}; // guardamos los tres números en un array
		 * 
		 * Arrays.sort(numeros); // los ordena de menor a mayor
		 * 
		 * System.out.println("Números ordenados de menor a mayor: " + numeros[0] + ", "
		 * + numeros[1] + ", " + numeros[2]);
		 * 
		 * teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 21

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número y te digo si es primo o no: "); int numero =
		 * teclado.nextInt(); teclado.close();
		 * 
		 * boolean esPrimo = numero > 1; // descartamos 0 y 1 directamente
		 * 
		 * for (int i = 2; i <= numero / 2 && esPrimo; i++) { if (numero % i == 0)
		 * esPrimo = false; }
		 * 
		 * System.out.println("El número " + numero + (esPrimo ? " es primo" :
		 * " no es primo"));
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/
		// Ejercicio 22

		/*
		 * boolean esPrimo; int azar; do { azar = (int) ((Math.random() * 50000000 + 1))
		 * + 100000000; esPrimo = true; int raiz = (int)Math.sqrt(azar)+1;
		 * //------Operación: System.out.println("Probando el número " + azar + "...");
		 * if (azar % 2 == 0) esPrimo = false; else { for (int divisor = 3; divisor
		 * <raiz && esPrimo == true; divisor += 2) if (azar % divisor == 0) esPrimo =
		 * false; } //-----------Solución: } while (esPrimo == false);
		 * System.out.println("El número " + azar + " es primo");
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 23/24

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce el primer número: "); int inicio =
		 * teclado.nextInt(); System.out.print("Introduce el segundo número: "); int fin
		 * = teclado.nextInt(); teclado.close();
		 * 
		 * // Aseguramos que inicio sea menor que fin
		 * 
		 * 
		 * if (inicio > fin) { int temp = inicio; inicio = fin; fin = temp; }
		 * 
		 * System.out.print("Primos entre " + inicio + " y " + fin + ": ");
		 * 
		 * boolean primero = true; // Para no poner coma antes del primer primo
		 * 
		 * for (int numero = inicio; numero <= fin; numero++) { if (numero < 2)
		 * continue;
		 * 
		 * boolean esPrimo = true; for (int i = 2; i <= Math.sqrt(numero); i++) { if
		 * (numero % i == 0) { esPrimo = false; } }
		 * 
		 * if (esPrimo) { if (!primero) System.out.print(", ");
		 * System.out.print(numero); primero = false; } }
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 25

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame un número: "); double numero = teclado.nextDouble();
		 * teclado.close();
		 * 
		 * int contador = 0; double copia = numero;
		 * 
		 * while (copia > 0.5) { // usamos un pequeño margen para evitar bucles
		 * infinitos con decimales double resultado = copia / 2;
		 * System.out.println("División " + (contador + 1) + ": " + copia + " / 2 = " +
		 * resultado); copia = resultado; contador++; }
		 * 
		 * System.out.println("Se ha dividido entre 2 " + contador +
		 * " veces hasta aproximarse a 0.");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/
		// ---------------------------------------------------------------------------------------------------------------------------------------------

		// ***********Boletín 2***********

		// Ejercicio 1/2

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * // Pedimos tres palabras al usuario String[] palabras = new String[3];
		 * 
		 * for (int i = 0; i < 3; i++) { System.out.print("Introduce la palabra " + (i +
		 * 1) + ": "); palabras[i] = teclado.nextLine(); }
		 * 
		 * teclado.close();
		 * 
		 * // Ordenamos alfabéticamente Arrays.sort(palabras);
		 * 
		 * // Mostramos el resultado
		 * System.out.println("\nPalabras ordenadas alfabéticamente:"); for (String
		 * palabra : palabras) { System.out.println(palabra);
		 * 
		 * // Ordenamos normalmente (A → Z) Arrays.sort(palabras);
		 * 
		 * // Imprimimos en orden inverso (Z → A)
		 * System.out.println("\nPalabras ordenadas de Z a A:"); for (int i =
		 * palabras.length - 1; i >= 0; i--) { System.out.println(palabras[i]);
		 * 
		 * }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce el precio del artículo: "); double precio =
		 * teclado.nextDouble(); teclado.close();
		 * 
		 * double iva = 0.21; // 21% double precioConIVA = precio * (1 + iva);
		 * 
		 * // Redondear a 2 decimales usando Math.round precioConIVA =
		 * Math.round(precioConIVA * 100.0) / 100.0;
		 * 
		 * System.out.println("El precio con IVA del 21% es: " + precioConIVA);
		 */

		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 4:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce la primera nota (0-10): "); double nota1 =
		 * teclado.nextDouble();
		 * 
		 * System.out.print("Introduce la segunda nota (0-10): "); double nota2 =
		 * teclado.nextDouble();
		 * 
		 * teclado.close();
		 * 
		 * // Comprobamos que ambas notas sean válidas if (nota1 < 0 || nota1 > 10 ||
		 * nota2 < 0 || nota2 > 10) {
		 * System.out.println("Error: las notas deben estar entre 0 y 10."); } else { //
		 * Calculamos la media double media = (nota1 + nota2) / 2;
		 * 
		 * // Redondeamos sin decimales int mediaRedondeada = (int) Math.round(media);
		 * 
		 * System.out.println("La media redondeada sin decimales es: " +
		 * mediaRedondeada); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5/6:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce la nota del trabajo en clase (0-10): "); double
		 * nota1 = teclado.nextDouble();
		 * 
		 * System.out.print("Introduce la nota de ejercicios prácticos (0-10): ");
		 * double nota2 = teclado.nextDouble();
		 * 
		 * System.out.print("Introduce la nota del examen (0-10): "); double nota3 =
		 * teclado.nextDouble();
		 * 
		 * teclado.close();
		 * 
		 * // Validar que las notas estén en el rango 0-10 if (nota1 < 0 || nota1 > 10
		 * || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
		 * System.out.println("Error: todas las notas deben estar entre 0 y 10.");
		 * return; }
		 * 
		 * // Calcular media ponderada double media = nota1 * 0.05 + nota2 * 0.15 +
		 * nota3 * 0.80;
		 * 
		 * // Redondear a dos decimales para nota real double mediaRedondeada =
		 * Math.round(media * 100.0) / 100.0;
		 * 
		 * // Calcular nota de boletín según regla especial int notaBoletin; if (media
		 * >= 5) { notaBoletin = (int) Math.round(media); // redondeo matemático } else
		 * { notaBoletin = (int) media; // truncar decimales }
		 * 
		 * // Mostrar resultados System.out.println("Media real (2 decimales): " +
		 * mediaRedondeada); System.out.println("Nota de boletín: " + notaBoletin);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 7:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce un número para mostrar su tabla de multiplicar: "
		 * ); int numero = teclado.nextInt();
		 * 
		 * teclado.close();
		 * 
		 * System.out.println("Tabla de multiplicar del " + numero + ":");
		 * 
		 * for (int i = 1; i <= 10; i++) { System.out.println(numero + " x " + i + " = "
		 * + (numero * i)); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 8:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce un número: "); int numero = teclado.nextInt();
		 * teclado.close();
		 * 
		 * System.out.print("Divisores del número " + numero + ": ");
		 * 
		 * boolean primero = true; // para controlar la coma
		 * 
		 * for (int i = 1; i <= numero; i++) { if (numero % i == 0) { if (!primero) {
		 * System.out.print(", "); // agregamos la coma antes del siguiente divisor }
		 * System.out.print(i); primero = false; } }
		 * 
		 * System.out.println(); // salto de línea al final
		 */

		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 9:

		/*
		 * boolean hemosAcabado = false; Scanner teclado = new Scanner(System.in); int
		 * contador = 0; do {
		 * System.out.println("Introduce un número entre el 1 y 100 o FIN para salir: "
		 * ); String entrada = teclado.nextLine(); if (entrada.equalsIgnoreCase("FIN"))
		 * { // Ignora mayúsculas/minúsculas hemosAcabado = true; } else if
		 * (entrada.matches("[0-9]+")) { System.out.println("Es un número entero"); int
		 * numero = Integer.parseInt(entrada); if (numero >= 1 && numero <= 100) {
		 * contador++; } else {
		 * System.out.println("Pero no es un entero entre 1 y 100"); } } else {
		 * System.out.println("Es otra cosa"); } } while (!hemosAcabado);
		 * System.out.println("Has introducido " + contador +
		 * " números válidos entre 1 y 100."); teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 12/13

		/*
		 * int azar = (int) (Math.random() * 50) + 1; //NUMERO QUE PIENSA LA MÁQUINA:
		 * //System.out.println(azar);
		 * 
		 * System.out.println(" Adivina el número que estoy pensando "); Scanner teclado
		 * = new Scanner(System.in); boolean acertado = false; for (int intentos = 1;
		 * intentos < 6 && acertado==false; intentos++) {
		 * System.out.print("Intento número " + intentos +
		 * " ¿En qué número estoy pensando? " ); int elección = teclado.nextInt();
		 * if(elección == azar) { System.out.println(" ¡Eres la cabra loquete! ");
		 * acertado = true; System.out.println(" Fin del programa "); } else if
		 * (elección > azar) System.out.println(" Columpiada de época tu "); else
		 * System.out.println(" Más corto que tu pito ");
		 * 
		 * } if (acertado == false)
		 * System.out.println(" Lo siento. Has agotado tus intentos. El número era " +
		 * azar);
		 */
		/// \/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 17:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("Introduce una temperatura: "); String temperatura =
		 * teclado.nextLine(); teclado.close(); double numero =
		 * Double.parseDouble(temperatura.substring(0, temperatura.length() - 1)); char
		 * unidad = temperatura.charAt(temperatura.length() - 1); double calculo = 0;
		 * switch (unidad) { case 'C', 'c': calculo = (numero * 1.8) + 32;
		 * System.out.println(temperatura + " equivale a " + calculo + "F"); calculo =
		 * numero + 273.15; System.out.println(temperatura + " equivale a " + calculo +
		 * "K"); break; case 'F', 'f': break; case 'K', 'k': break; default:
		 * System.out.println("La unidad no está reconocida"); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// ***Boletín 3: cadenas de caracteres uso de switch, match o una instrucción
		// similar***

		// Ejercicio 1/2:

		/*
		 * Scanner teclado = new Scanner(System.in); String contraseña; String
		 * contraseña2; int contador=0; do {
		 * System.out.print("Introduce tu contraseña: "); contraseña = teclado.next();
		 * System.out.print("Introduzca la contraseña de nuevo: "); contraseña2 =
		 * teclado.next(); if (!contraseña.equals(contraseña2)) {
		 * System.out.println("Las contraseñas no coinciden. Intentalo de nuevo\n ");
		 * contador++; } } while (!contraseña.equals(contraseña2));{
		 * System.out.println("¡Contraseña correcta! \n Número de intentos fallidos: " +
		 * contador); } teclado.close();
		 */

		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Cuál es tu nombre?: "); String nombre = teclado.next();
		 * System.out.println("Cuál es tu apellido?: "); String apellido =
		 * teclado.next(); System.out.println(apellido+", "+ nombre); teclado.close();
		 */

		// Ejercicio 4:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce una cadena de texto: "); String texto =
		 * teclado.nextLine();
		 * 
		 * 
		 * int numEspacios = 0; for (int i = 0; i < texto.length(); i++) { if
		 * (texto.charAt(i) == ' ') { numEspacios++; } }
		 * 
		 * 
		 * String textoSinEspacios = texto.replace(" ", "");
		 * 
		 * 
		 * System.out.println("\nTexto sin espacios: " + textoSinEspacios);
		 * System.out.println("Número de espacios eliminados: " + numEspacios);
		 * 
		 * teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * 
		 * System.out.print("Introduce una cadena de texto: "); String texto =
		 * teclado.nextLine();
		 * 
		 * 
		 * String textoReves = new StringBuilder(texto).reverse().toString();
		 * 
		 * 
		 * System.out.println("Texto al revés: " + textoReves);
		 * 
		 * teclado.close(); } } /*La versión facil sería: String alReves = ” ”; for (int
		 * i=0; i<texto.length (); i++) { alReves = alReves + texto.charAt(i); }
		 * System.out.println (”Cadena al reves: “ + alReves);
		 */

		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 6

		/*
		 * String texto = " hola calvito molongo"; String pares = ""; String impares =
		 * ""; for(int i=0; i<texto.length(); i++) { if (i%2 == 0) //pares +=
		 * texto.charAt(i); pares = pares + texto.charAt(i); else impares +=
		 * texto.charAt(i); } System.out.println("Cadena posiciones pares: " + pares);
		 * System.out.println("Cadena posiciones impares: " + impares);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 7

		/*
		 * String texto = " hola calvito molongo"; String sinVocales = "";
		 * 
		 * for(int i=0; i<texto.length();i++) { char c = texto.charAt(i); if(c !='a' &&
		 * c!='e' && c!='i' && c!='o' && c!='u') sinVocales = sinVocales +
		 * texto.charAt(i); } System.out.println("Cadena sin vocales: " + sinVocales);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 8

		/*
		 * String texto =
		 * "En un lugar de la mancha de cuyo nombre no quiero acordarme "; String
		 * sinVocales = ""; String minusculas = texto.toLowerCase();
		 * System.out.println("Esta es la cadena pre-cambio: " + minusculas); for(int
		 * i=0; i<texto.length();i++) { char c = minusculas.charAt(i); switch(c) { case
		 * 'a' : break; case 'e' : break; case 'i' : break; case 'o' : break; case 'u' :
		 * break; default: sinVocales = sinVocales + texto.charAt(i); }
		 * 
		 * Cambiar las vocales por números: sinVocales = sinVocales.replace("a", "4");
		 * sinVocales = sinVocales.replace("e", "3"); sinVocales =
		 * sinVocales.replace("o", "0"); sinVocales = sinVocales.replace("i", "1");
		 * 
		 * } System.out.println("Cadena sin vocales: " + sinVocales);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 10/11

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Escribe aquí tu DNI: "); String Dni = teclado.nextLine();
		 * if (Dni.length() == 9) { if (Dni.matches("[0-9]{8}[A-Z]"))
		 * System.out.println(Dni + " es un DNI válido"); else System.out.println(Dni +
		 * " no es un DNI válido"); } else System.out.println(Dni +
		 * " no es un DNI válido");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 12/13

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu matrícula: "); String matricula =
		 * teclado.nextLine(); if
		 * (matricula.matches("[0-9]{4}[-\\s][A-Za-z&&[^AEIOUQaeiouq]]{3}"))
		 * System.out.println("Es una matrícula válida"); else
		 * System.out.println("No es una matrícula  válida");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 15

		/*
		 * String fecha = "13/05/2024"; boolean fechaCorrecta = true; if
		 * (fecha.length()!=10) fechaCorrecta = false; else if(fecha.charAt(2) != '/' ||
		 * fecha.charAt(5) != '/') fechaCorrecta=false; else { int dia =
		 * Integer.parseInt(fecha.substring(0,2)); int mes=
		 * Integer.parseInt(fecha.substring(3,5)); if(dia<1 || dia>31) fechaCorrecta =
		 * false; else if (mes<1 || mes >12) fechaCorrecta = false; } if
		 * (fechaCorrecta==true) System.out.println("La fecha "+ fecha +
		 * " es correcta"); else System.out.println("La fecha "+ fecha +
		 * " no es correcta");
		 */

		// ---------------------------------------------------------------------------------------------------------------------------------------------
		// ****Boletín 4****

		// Ejercicio 1

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce un número entero: "); int numero =
		 * scanner.nextInt();
		 * 
		 * long factorial = 1;
		 * 
		 * if (numero < 0) {
		 * 
		 * System.out.println("El factorial no está definido para números negativos.");
		 * }
		 * 
		 * else if (numero == 0) {
		 * 
		 * System.out.println("El factorial de 0 es 1."); }
		 * 
		 * else {
		 * 
		 * for (int i = 1; i <= numero; i++) { factorial *= i; }
		 * 
		 * System.out.println("El factorial de " + numero + " es " + factorial); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 2

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Cuántos número de la secuencia de fibonacci quieres?: ");
		 * int veces = teclado.nextInt(); int num1 = 0; int num2 = 1;
		 * System.out.print("Los primeros " + veces +
		 * " número de la sucesión de fibonacci: "); if (veces >= 1)
		 * System.out.print("0"); if (veces >= 2) System.out.print(", 1"); for (int i =
		 * 2; i < veces; i++) { int nuevoNumero = num1 + num2; System.out.print(", " +
		 * nuevoNumero); num1 = num2; num2 = nuevoNumero;
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3

		/*
		 * Scanner teclado = new Scanner(System.in); System.out.
		 * print("Cuál es el mayor número que quieres que enseñe la suscesión? : ");
		 * long veces = teclado.nextInt(); long num1 = 0; long num2 = 1;
		 * System.out.print("Los números menores o iguales que "
		 * +veces+" en la sucesión de fibonacci son: "); if (veces >= 1)
		 * System.out.print("0"); if (veces >= 2) System.out.print(", 1"); for (int i =
		 * 2; i < veces+1; i++) { long nuevoNumero = num1 + num2; if(nuevoNumero<=veces)
		 * System.out.print(", " + nuevoNumero); num1 = num2; num2 = nuevoNumero;
		 * 
		 * }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 4

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce un número: "); int numero = teclado.nextInt();
		 * teclado.close();
		 * 
		 * // Convertimos el número a positivo para evitar problemas con el signo -
		 * numero = Math.abs(numero);
		 * 
		 * // Convertimos a String y contamos los caracteres String numeroStr =
		 * String.valueOf(numero); int cifras = numeroStr.length();
		 * System.out.println("El número tiene " +cifras+" cifra"+(cifras > 1 ? "s." :
		 * "."));
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5

		/*
		 * String original = "88998899889988"; String invertido = ""; for (int i =
		 * original.length() - 1; i >= 0; i--) { char c = original.charAt(i); //
		 * ^^Variable temporal: me puedo saltar esa linea de código siempre y cuando en
		 * // vez de usar 'c' use 'original.charAt(i)' invertido = invertido + c; } if
		 * (original.equals(invertido)) { System.out.println("El número " + original +
		 * " es capicúa."); } else { System.out.println("El número " + original +
		 * " no es capicúa."); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 6

		/*
		 * int contador = 0; int numero = 2;
		 * 
		 * while (contador < 50) { boolean esPrimo = true;
		 * 
		 * for (int i = 2; i <= Math.sqrt(numero); i++) { if (numero % i == 0) { esPrimo
		 * = false; break; } }
		 * 
		 * if (esPrimo) { contador++;
		 * 
		 * double raiz = Math.sqrt(numero); // Redondeamos manualmente a 2 decimales
		 * double raizRedondeada = Math.round(raiz * 100.0) / 100.0;
		 * 
		 * int cuadrado = numero * numero; int cubo = numero * numero * numero;
		 * 
		 * System.out.println("Número: " + numero + " | Raíz: " + raizRedondeada +
		 * " | Cuadrado: " + cuadrado + " | Cubo: " + cubo); }
		 * 
		 * numero++; }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 9

		/*
		 * Scanner teclado = new Scanner (System.in);
		 * System.out.println("Escribe un texto: "); String texto = teclado.nextLine();
		 * System.out.println("Escribe un caracter: "); String temporal =
		 * teclado.nextLine(); char caracter = temporal.charAt(0); teclado.close(); int
		 * contador = 0; for (int i=0; i<texto.length(); i++) if (texto.charAt(i) ==
		 * caracter) contador++; System.out.println("El caracter " + caracter +
		 * " aparece en " + contador + " ocasiones"); if (contador != 0) {
		 * System.out.println("Las posiciones en las que aparece son: "); String
		 * posiciones = ""; for (int i=0; i<texto.length(); i++) { if(texto.charAt(i) ==
		 * caracter) { posiciones = posiciones + i + ", "; } } posiciones =
		 * posiciones.substring(0,posiciones.length()-2); System.out.print(posiciones);
		 * }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 10

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("Introduce un texto con cifras y letras: "); String texto
		 * = teclado.nextLine(); teclado.close();
		 * System.out.print("Las cifras de este texto son: "); for (int i = 0; i <
		 * texto.length(); i++) { char caracter = texto.charAt(i); switch (caracter) {
		 * case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
		 * System.out.print(caracter); } }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 11

		/*
		 * String texto = "Esto es una cadena de prueba"; String textoPares = "" +
		 * texto.charAt(0); for (int posicion = 1; posicion < texto.length();
		 * posicion++) { textoPares = textoPares + "-" + texto.charAt(posicion); }
		 * textoPares = textoPares.replace("- -", " "); System.out.println(textoPares);
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 12

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Introduce un año: "); int año = teclado.nextInt();
		 * teclado.close();
		 * 
		 * // Comprobamos si es bisiesto según las reglas boolean esBisiesto = (año % 4
		 * == 0 && año % 100 != 0) || (año % 400 == 0);
		 * 
		 * if (esBisiesto) { System.out.println("El año " + año + " es bisiesto."); }
		 * else { System.out.println("El año " + año + " no es bisiesto."); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 13

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("Introduce un carácter: "); String caracter =
		 * teclado.nextLine();
		 * System.out.println("Introduce un número de repeticiones: "); int repeticiones
		 * = teclado.nextInt(); teclado.close(); for (int i = 0; i < repeticiones; i++)
		 * { for (int a = 0; a < repeticiones; a++) { System.out.print(caracter); }
		 * System.out.println(); }
		 */

		// ---------------------------------------------------------------------------------------------------------------------------------------------
		// ****Boletín 5****

		// Ejercicio 1

		/*
		 * int cantidadNumeros = 6; int inicio = 1; int fin = 49; int[] numeros = new
		 * int[cantidadNumeros]; int contador = 0;
		 * 
		 * while (contador < cantidadNumeros) { int numeroAleatorio = (int)
		 * (Math.random() * (fin - inicio + 1) + inicio); boolean repetido = false;
		 * 
		 * // Comprobar si el número ya está en el array for (int i = 0; i < contador;
		 * i++) { if (numeros[i] == numeroAleatorio) { repetido = true; } }
		 * 
		 * // Si no estaba repetido, lo añadimos al array if (!repetido) {
		 * numeros[contador] = numeroAleatorio; contador++; } }
		 * 
		 * // Mostrar los números generados
		 * System.out.print("Números de la lotería primitiva: "); for (int i = 0; i <
		 * numeros.length; i++) { System.out.print(numeros[i] + " "); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5

		/*
		 * int inicio = 1; int fin = 50; int[] numeros = new int[100];
		 * 
		 * int mayor = inicio; int menor = fin; int numeroMasRepetido = 0; int
		 * maxRepeticiones = 0;
		 * 
		 * System.out.println("Generando 100 números aleatorios entre " + inicio + " y "
		 * + fin + "...\n");
		 * 
		 * // Generar los 100 números aleatorios for (int i = 0; i < numeros.length;
		 * i++) { numeros[i] = (int) (Math.random() * (fin - inicio + 1)) + inicio;
		 * 
		 * // Buscar mayor y menor if (numeros[i] > mayor) { mayor = numeros[i]; } if
		 * (numeros[i] < menor) { menor = numeros[i]; } }
		 * 
		 * // Contar repeticiones for (int i = 0; i < numeros.length; i++) { int
		 * contador = 0; for (int j = 0; j < numeros.length; j++) { if (numeros[i] ==
		 * numeros[j]) { contador++; } }
		 * 
		 * if (contador > maxRepeticiones) { maxRepeticiones = contador;
		 * numeroMasRepetido = numeros[i]; } }
		 * 
		 * // Mostrar resultados System.out.println("Números generados: " +
		 * Arrays.toString(numeros)); System.out.println("\nNúmero mayor: " + mayor);
		 * System.out.println("Número menor: " + menor);
		 * System.out.println("Número que más se repite: " + numeroMasRepetido + " (" +
		 * maxRepeticiones + " veces)");
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 6

		/*
		 * String numero = "111222233333"; int[] contador = new int[10]; for (int i = 0;
		 * i < numero.length(); i++) { String cifra = "" + numero.charAt(i); int
		 * posicion = Integer.parseInt(cifra); contador[posicion] += 1; } for (int i =
		 * 0; i < 10; i++) { if (contador[i] != 0) { System.out.println("El dígito " + i
		 * + " se repite: " + contador[i] + " veces."); } }
		 */
		// ---------------------------------------------------------------------------------------------------------------------------------------------
		// ****Boletín 6****

		// Ejercicio 1

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu código postal: "); String codigo =
		 * teclado.nextLine();
		 * 
		 * // Expresión regular para validar un código postal String expresionRegular =
		 * "^28\\d{3}$"; //"^"=inicio de la cadena, "28"=porque tiene que empezar por
		 * 28, "\\d{3}"= los tres dígitos del 0-9
		 * 
		 * Pattern pattern = Pattern.compile(expresionRegular);
		 * 
		 * // Creamos el matcher con el texto a evaluar Matcher matcher =
		 * pattern.matcher(codigo);
		 * 
		 * // Verificamos si coincide con el patrón if (matcher.matches()) {
		 * System.out.println("El código postal es válido."); } else
		 * 
		 * { System.out.println("El código postal no es válido."); } teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 2

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu número de teléfono fijo: "); String numero =
		 * teclado.nextLine();
		 * 
		 * String expresReg = "^9\\d{7}$";
		 * 
		 * Pattern pattern = Pattern.compile(expresReg);
		 * 
		 * Matcher matcher = pattern.matcher(numero);
		 * 
		 * if (matcher.matches()) { System.out.println("El número es válido"); }else {
		 * System.out.println("El número no es válido"); } teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 3

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu número de teléfono móvil: "); String numero =
		 * teclado.nextLine();
		 * 
		 * String expresReg = "^[6,7,8]\\d{7}$"; Pattern pattern =
		 * Pattern.compile(expresReg); Matcher matcher = pattern.matcher(numero); if
		 * (matcher.matches()) { System.out.println("El número es válido");
		 * 
		 * } else { System.out.println("El número no es válido");
		 * 
		 * } teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 4

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu número de teléfono móvil: "); String numero =
		 * teclado.nextLine();
		 * 
		 * String expresReg = "^\\+34 \\d{9}$"; Pattern pattern =
		 * Pattern.compile(expresReg); Matcher matcher = pattern.matcher(numero); if
		 * (matcher.matches()) { System.out.println("El número es válido");
		 * 
		 * } else { System.out.println("El número no es válido");
		 * 
		 * } teclado.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 5

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce dos palabras: "); String texto =
		 * teclado.nextLine(); teclado.close();
		 * 
		 * String expresionRegular = "^[A-Z][a-zA-Z]* [A-Z][a-zA-Z]*$"; Pattern pattern
		 * = Pattern.compile(expresionRegular); Matcher matcher =
		 * pattern.matcher(texto);
		 * 
		 * if (matcher.matches()) { System.out.println("El texto es válido."); } else {
		 * System.out.println("El texto no es válido."); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 6

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu código formato 'XX00-xxX-00': "); String texto
		 * = teclado.nextLine(); teclado.close();
		 * 
		 * String expresionRegular =
		 * "^[A-Z][A-Z][0-9][0-9]-[a-z][a-z][A-Z]-[0-9][0-9]*$"; Pattern pattern =
		 * Pattern.compile(expresionRegular); Matcher matcher = pattern.matcher(texto);
		 * 
		 * if (matcher.matches()) { System.out.println("El texto es válido."); } else {
		 * System.out.println("El texto no es válido."); }
		 */

		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 7

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu tarjeta de crédito y fecha de caducidad: ");
		 * String texto = teclado.nextLine(); teclado.close();
		 * 
		 * String expresionRegular =
		 * "^[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4} (0[1-9]|1[0-2])/\\d{2}$"; Pattern
		 * pattern = Pattern.compile(expresionRegular); Matcher matcher =
		 * pattern.matcher(texto);
		 * 
		 * if (matcher.matches()) { System.out.println("El texto es válido."); } else {
		 * System.out.println("El texto no es válido."); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 8

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu tarjeta de crédito y fecha de caducidad: ");
		 * String texto = teclado.nextLine(); teclado.close();
		 * 
		 * String expresionRegular =
		 * "^ES[0-9]{2} [0-9]{4} [0-9]{4} [0-9]{2} [0-9]{10}$"; Pattern pattern =
		 * Pattern.compile(expresionRegular); Matcher matcher = pattern.matcher(texto);
		 * 
		 * if (matcher.matches()) { System.out.println("El texto es válido."); } else {
		 * System.out.println("El texto no es válido."); }
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 9

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Ingresa un número: "); String numero = scanner.nextLine();
		 * 
		 * // Regex directamente con matches() if (numero.matches("\\d{4,8}")) {
		 * System.out.println("Número válido: " + numero); } else { System.out.
		 * println("Número inválido. Debe tener entre 4 y 8 cifras y solo dígitos."); }
		 * 
		 * scanner.close();
		 */
		// /\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\/\/

		// Ejercicio 10

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduce tu dirección IP a validar: "); String texto =
		 * teclado.nextLine(); teclado.close();
		 * 
		 * String expresionRegular = "^[0-9]{3}.[0-9]{3}.[0-9]{2}.[0-9]{2}$"; Pattern
		 * pattern = Pattern.compile(expresionRegular); Matcher matcher =
		 * pattern.matcher(texto);
		 * 
		 * if (matcher.matches()) { System.out.println("La dirección IP es válida."); }
		 * else { System.out.println("La dirección IP no es válida."); }
		 */

// ********************************************************************************************
// ********************************************************************************************
//--------------------------------APUNTES PARA EXAMEN FINAL 1ER TRIMESTRE---------------------------
//FUNCIÓN SPLIT:

		/*
		 * String texto1 = "Examen 1T01"; String texto2 = "Octubre-2025";
		 * 
		 * String[] elementos1 = texto1.split(" ");
		 * 
		 * for (String elemento:elementos1) System.out.println(elemento);
		 * 
		 * String[] elementos2 = texto2.split("-");
		 * 
		 * for(String elemento:elementos2) System.out.println(elemento);
		 * 
		 * String resultado = elementos1[1] + "-" + elementos2[1] + " "; resultado =
		 * resultado + elementos1[0] + " " + elementos2[0];
		 * 
		 * System.out.println(resultado);
		 */
		// ********************************************************************************************
		// -------------------FIN DEL EJERCICIO---------------------

		// Programa que corrige los espacios de más en una frase

		/*
		 * String texto1 = "En un lugar de     la mancha  de    cuyo nombre no quiero";
		 * String[] palabras = texto1.split("[ ]+"); String fraseCorrecta = ""; for
		 * (String palabra:palabras) fraseCorrecta = fraseCorrecta + palabra + " ";
		 * System.out.print(fraseCorrecta);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************
		// PRÁCTICA DE SALIDA EN PANTALLA:

		// Nuevo print:"printf" (%s=string, %d=entero, %f=double o float [%.2f=redondea
		// a dos decimales])

		/*
		 * System.out.println("Esto va en la linea de arriba\nY esto en la de abajo");
		 * 
		 * String nombre = "Andrés Ortega"; int edad = 20; double salario = 2341.98;
		 * 
		 * System.out.printf("Tu nombre es %s tienes %d y cobras %f euros\n", nombre,
		 * edad, salario); System.out.println("fin del programa");
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************
		// Ejercico 1: ejemplo de empresa enseñando ingresos:

		/*
		 * int n1 = 345; int n2 = 1245; int n3 = 2; int n4 = 32;
		 * 
		 * System.out.printf("Ingresos:\n%-3d€\n%-4d€\n%-1d€\n%-2d€\n", n1, n2, n3, n4);
		 * System.out.printf("Ingresos:\n%5d€\n%5d€\n%5d€\n%5d€\n", n1, n2, n3, n4);
		 * System.out.printf("Ingresos:\n%05d€\n%05d€\n%05d€\n%05d€\n", n1, n2, n3, n4);
		 * 
		 * double d1 = -345.12; double d2 = 1223.2; double d3 = 2.0; double d4 =
		 * -32.345; System.out.printf("Ingresos:\n%(6.2f€\n%(7.2f€\n%(3.2f€\n%(5.2f€\n",
		 * d1, d2, d3, d4);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// Ejercicio 2: Seleccionar por teclado la longitud y los decimales de un printf

		/*
		 * Scanner teclado = new Scanner(System.in); double pi = 3.141592653;
		 * 
		 * System.out.print("Cuánto quieres que ocupe tu número?: "); int espacio =
		 * teclado.nextInt(); System.out.print("Cuántos decimales quieres?: "); int
		 * decimales = teclado.nextInt(); teclado.close();
		 * 
		 * String formato = "%" + espacio + "." + decimales + "f";
		 * 
		 * System.out.println("El formato es: " + formato);
		 * System.out.printf("Tu número pi es:" + formato, pi);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// Ejercicio 3: Mostrar una lista de la compra
		/*
		 * String[] productos = { "Manzana", "Banana", "Cereza" }; double[] precios = {
		 * 1.25, 0.75, 2.5 };
		 * 
		 * System.out.printf("%-10s %10s%n", "Productos", "Precios");
		 * 
		 * for (int i = 0; i < productos.length; i++) {
		 * System.out.printf("%-10s %10.2f%n", productos[i], precios[i]);
		 * 
		 * }
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// Ejercicio 4: Recibo de la compra.

		/*
		 * String[] productos = { "Pan","Leche","Huevos"}; double [] cantidad = {2,1,6};
		 * double [] precio = {1.50,2.20,0.30}; double totalGeneral = 0;
		 * 
		 * System.out.printf("%-10s %10s %10s %10s%n", "Producto", "Cantidad", "Precio",
		 * "Total"); System.out.println(
		 * "----------------------------------------------------------------");
		 * 
		 * for (int i=0;i<productos.length;i++) { double total = precio[i] *
		 * cantidad[i]; totalGeneral += total;
		 * 
		 * System.out.printf("%-10s %10.2f %10.2f %10.2f%n", productos [i], cantidad[i],
		 * precio[i], total);
		 * 
		 * }
		 * 
		 * System.out.println(
		 * "----------------------------------------------------------------");
		 * System.out.printf("%-10s %32.2f%n", "TOTAL", totalGeneral);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// Ejercicio: Práctica del dado trucado

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * 
		 * System.out.print("Cuántos dados vas a tirar?: "); int numDados =
		 * teclado.nextInt(); teclado.close();
		 * 
		 * boolean todosIguales; int numTiradas = 0; int resultados[] = new
		 * int[numDados]; int[] frecuencias = new int[7]; do { numTiradas++; for (int i
		 * = 0; i < numDados; i++) { int dado = (int) (Math.random() * 6) + 1;
		 * frecuencias[dado]++; resultados[i] = dado; if (i == numDados - 1)
		 * System.out.println(dado); else System.out.print(dado + " - "); } todosIguales
		 * = false; for (int j = 1; j < numDados; j++) { if (resultados[0] !=
		 * resultados[j]) todosIguales = true; } } while (todosIguales == true);
		 * 
		 * System.out.println("Has necesitado: " + numTiradas +
		 * " para que salgan todos iguales."); for (int k = 1; k <= 6; k++) {
		 * System.out.printf("El número %d ha salido el %.2f%%  de las veces\n", k,
		 * (double) (100 * frecuencias[k]) / (numDados * numTiradas)); }
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// ......................Tratamiento de excepciones........................
		// Ejercicio: Reparto de la cuenta.

		/*
		 * Scanner teclado = new Scanner(System.in); double importe = 0; int personas =
		 * 0; try { System.out.print("Cuánto ha costado la cena?: "); importe =
		 * teclado.nextDouble(); System.out.print("Cuántos habéis cenado?: "); personas
		 * = teclado.nextInt(); } catch (Exception e) {
		 * System.out.println("Ha ocurrido un error");
		 * 
		 * } finally { System.out.println("Se ejecuta siempre. haya o no excepción");
		 * 
		 * teclado.close(); if (importe != 0 && personas != 0) { double porPersona =
		 * importe / personas; System.out.printf("Tocáis a %.2f € por cabesa.",
		 * porPersona); } else
		 * System.out.println("Ni el importe ni los comensales pueden ser 0!!!"); }
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// **********************************************************************************************

		// ......................MÁS EJERCICIOS........................
		// Ejercicio 1: Constante de Kaprekar

		/*
		 * Scanner teclado = new Scanner(System.in); int numero1 = -1; final int
		 * kaprekar = 6174; String textNum; boolean numeroValido = false; // controla si
		 * la entrada es válida
		 * 
		 * // Bucle de validación while (!numeroValido) numeroValido =validarKaprekar();
		 * System.out.
		 * print("Introduce tu número de 4 cifras con al menos una diferente de las demás: "
		 * );
		 * 
		 * try { numero1 = teclado.nextInt(); textNum = String.format("%04d", numero1);
		 * // conserva ceros a la izquierda } catch (Exception e) {
		 * System.out.println("Eso no es un número entero"); teclado.nextLine();
		 * continue; // vuelve al inicio del bucle }
		 * 
		 * // Validaciones textNum = String.format("%04d", numero1); // asegurar que
		 * tenga 4 cifras if (textNum.length() != 4) {
		 * System.out.println("Tu número no tiene exactamente cuatro cifras"); continue;
		 * }
		 * 
		 * boolean hayDiferencias = false; for (int i = 1; i < 4; i++) if
		 * (textNum.charAt(0) != textNum.charAt(i)) hayDiferencias = true;
		 * 
		 * if (!hayDiferencias) { System.out.println("Todos los dígitos son iguales");
		 * continue; }
		 * 
		 * if (numero1 == kaprekar) {
		 * System.out.println("El número ya es la constante de Kaprekar"); continue; }
		 * 
		 * numeroValido = true;
		 * 
		 * 
		 * System.out.println("Ahora sí, ¡vamos a ello!");
		 * 
		 * do { textNum = String.format("%04d", numero1); char cifras[] = new
		 * char[textNum.length()]; for (int i = 0; i < textNum.length(); i++) cifras[i]
		 * = textNum.charAt(i);
		 * 
		 * Arrays.sort(cifras); String textoAscendente = ""; for (int i = 0; i <
		 * cifras.length; i++) textoAscendente += cifras[i];
		 * 
		 * int numAscendente = Integer.parseInt(textoAscendente);
		 * 
		 * String textoDescendente = ""; for (int i = cifras.length - 1; i >= 0; i--)
		 * textoDescendente += cifras[i];
		 * 
		 * int numDescendente = Integer.parseInt(textoDescendente);
		 * 
		 * numero1 = numDescendente - numAscendente;
		 * 
		 * System.out.println(numDescendente + " - " + numAscendente + " = " + numero1);
		 * 
		 * } while (numero1 != 6174);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// *********************************************************

		// Ejercicio Funciones:

		/*
		 * muestraNumero(5); int n = 6; muestraNumero(n); String texto =
		 * creaLinea(10,'+'); System.out.println(texto); texto = creaLinea (20,'-');
		 * System.out.println(texto); }
		 * 
		 * public static void muestraNumero(int numero) { System.out.println(numero); }
		 * public static String creaLinea(int veces, char caracter) { String cadena =
		 * ""; for (int i=0; i<veces;i++) cadena +=caracter; return cadena;
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// *********************************************************

		// Ejercicio Función: "esPrimo"

		/*
		 * int[] numeros = { 7, 13, 56, 77, 2, 56, 84 }; for (int n : numeros) if
		 * (esPrimo(n) == true) System.out.println(n + " Es primo"); else
		 * System.out.println(n + " No es primo"); }
		 * 
		 * public static boolean esPrimo(int numero) { boolean primo =true; int raiz=
		 * (int) Math.sqrt(numero)+1; if(numero%2!=0 || numero==2) { for(int i=3;i<raiz
		 * && primo==true;i+=2) if(numero%i==0) primo = false; } else primo = false;
		 * 
		 * return primo;
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// *********************************************************

		// Separando Kaprekar en funciones:

		/*
		 * Scanner teclado = new Scanner(System.in); int numero1;
		 * 
		 * // Obtener número validado numero1 = pedirNumeroValido(teclado);
		 * 
		 * System.out.println("Ahora sí, ¡vamos a ello!");
		 * realizarProcesoKaprekar(numero1); }
		 * 
		 * // --------------------------- // FUNCIÓN PRINCIPAL //
		 * ---------------------------
		 * 
		 * public static int pedirNumeroValido(Scanner teclado) { final int KAPREKAR =
		 * 6174; boolean numeroValido = false; int numero1 = -1;
		 * 
		 * while (!numeroValido) { System.out.
		 * print("Introduce tu número de 4 cifras con al menos una diferente de las demás: "
		 * );
		 * 
		 * String textNum = "";
		 * 
		 * try { numero1 = teclado.nextInt(); textNum = String.format("%04d", numero1);
		 * } catch (Exception e) { System.out.println("Eso no es un número entero");
		 * teclado.nextLine(); continue; }
		 * 
		 * if (!esCuatroCifras(textNum)) continue;
		 * 
		 * if (!tieneAlMenosUnDigitoDistinto(textNum)) continue;
		 * 
		 * if (numero1 == KAPREKAR) {
		 * System.out.println("El número ya es la constante de Kaprekar"); continue; }
		 * 
		 * numeroValido = true; }
		 * 
		 * return numero1; }
		 * 
		 * // --------------------------- // VALIDACIONES // ---------------------------
		 * 
		 * public static boolean esCuatroCifras(String num) { if (num.length() != 4) {
		 * System.out.println("Tu número no tiene exactamente cuatro cifras"); return
		 * false; } return true; }
		 * 
		 * public static boolean tieneAlMenosUnDigitoDistinto(String num) { for (int i =
		 * 1; i < 4; i++) { if (num.charAt(0) != num.charAt(i)) { return true; } }
		 * System.out.println("Todos los dígitos son iguales"); return false; }
		 * 
		 * // --------------------------- // PROCESO KAPREKAR //
		 * ---------------------------
		 * 
		 * public static void realizarProcesoKaprekar(int numero) { final int KAPREKAR =
		 * 6174;
		 * 
		 * do { String textNum = String.format("%04d", numero); char[] cifras =
		 * textNum.toCharArray(); Arrays.sort(cifras);
		 * 
		 * int ascendente = Integer.parseInt(new String(cifras)); int descendente =
		 * Integer.parseInt(new StringBuilder(new String(cifras)).reverse().toString());
		 * 
		 * numero = descendente - ascendente;
		 * 
		 * System.out.println(descendente + " - " + ascendente + " = " + numero);
		 * 
		 * } while (numero != KAPREKAR);
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// *********************************************************

		// Buscaminas por funciones:

		/*
		 * int minas = 0; int lado = 0;
		 * 
		 * boolean correcto = false; do { Scanner teclado = new Scanner(System.in); try
		 * { System.out.print("Cuánto mide el lado de tu tablero?: "); lado =
		 * teclado.nextInt(); System.out.print("Cuántas minas quieres que haya?: ");
		 * minas = teclado.nextInt(); if (minas < lado * lado) correcto = true; else
		 * System.out.println("No puedo poner " + minas + " minas en el tablero de " +
		 * (lado * lado)); } catch (Exception e) {
		 * System.out.println("No has metido un número entero"); } } while (correcto ==
		 * false); System.out.println("Este es tu tablero: "); int[][] tablero = new
		 * int[lado][lado]; colocarMinas(tablero, lado, minas); mostrarTablero(tablero,
		 * lado);
		 * 
		 * }
		 * 
		 * public static void mostrarTablero(int[][] tablero, int lado) { for (int j =
		 * 0; j < lado; j++) { for (int i = 0; i < lado; i++) if (tablero[j][i] <= 1)
		 * System.out.print("X "); else System.out.print("X "); System.out.println(); }
		 * }
		 * 
		 * public static void colocarMinas(int[][] tablero, int lado, int minas) { int
		 * numMinas = 0; while (numMinas != minas) { int fila = (int) (Math.random() *
		 * lado); int columna = (int) (Math.random() * lado); if (tablero[fila][columna]
		 * == 0) { tablero[fila][columna] = MINA; numMinas++; } }
		 */
		// -------------------FIN DEL EJERCICIO---------------------
		// *********************************************************

		// +++++++++++++++++++++Boletín 7++++++++++++++++++++++++++++

		// Ejercicio 4:

		/*
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.print("Dame una frase: "); String nota = teclado.nextLine();
		 * teclado.close();
		 * 
		 * String[] lista = nota.split(" "); int contador = 0; for (String palabra :
		 * lista) { if (tieneCuatrooMasVocales(palabra)) contador++; } if(contador ==1)
		 * System.out.println("Hay " + contador + " palabra con 4 o más vocales"); else
		 * System.out.println("Hay " + contador + " palabras con 4 o más vocales"); }
		 * 
		 * //rivate static Salida=> boolean tieneCuatrooMasVocales(String p) <=Entrada
		 * /*{
		 * 
		 * int cuentaVocales = 0; boolean tieneCuatroVocales = false; char[] letras = {
		 * 'a', 'e', 'i', 'o', 'u' }; for (char letra : letras) cuentaVocales +=
		 * buscaLetra(p, letra); if (cuentaVocales >= 4) tieneCuatroVocales = true;
		 * return tieneCuatroVocales; }
		 */

		/*
		 * private static int buscaLetra(String p, char letras) { int cuenta = 0; for
		 * (int i = 0; i < p.length(); i++) { if (Character.toLowerCase(p.charAt(i)) ==
		 * letras) { cuenta++; } } return cuenta;
		 */

		// -------------------FIN DEL EJERCICIO---------------------
		// ********************************************************

		// Ejercicio 7:

		/*Scanner teclado = new Scanner(System.in);
		System.out.print("De cuantos números quieres tu array?: ");
		try {
			int tamaño = teclado.nextInt();
			int tabla[] = new int[tamaño];
			for (int i = 0; i < tamaño; i++) {
				tabla[i] = (int) ((Math.random() * (1000 - 9) + 10));
			}
			for (int i = 0; i < tamaño; i++) {
				System.out.print(tabla[i] +" - ");
				if( i==tamaño-1)
					System.out.println(tabla[i]);
				else {
					System.out.print(tabla[i] +" - ");
				}
					
			}
			System.out.print("\nQué posición quieres recuperar?: ");
			int posicion = teclado.nextInt();
			if (posicion < 0 || posicion >= tamaño)
				System.out.println("Esa posición no existe");
			else
				System.out.println("Posición " + posicion + ": " + tabla[posicion]);
		} catch (InputMismatchException e) {
			System.err.println("No has metido un número entero");
		} catch (NegativeArraySizeException e) {
			System.err.println("No se puede crear un array con un tamaño negativo");
		} finally {
			teclado.close();
		}*/

	}
}