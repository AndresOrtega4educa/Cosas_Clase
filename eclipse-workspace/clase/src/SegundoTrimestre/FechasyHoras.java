package SegundoTrimestre;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class FechasyHoras {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		LocalDate hoy2 = LocalDate.now();
		System.out.println(hoy);
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
LocalDateTime fechayhora = LocalDateTime.now();

String fechaTxt = "08/10/1968";
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate cumple = LocalDate.parse(fechaTxt,formato);
System.out.println(cumple);
if (cumple.isAfter(hoy))
	System.out.println(cumple + " es posterior a "+hoy);
else
	System.out.println(cumple + " no es posterior a "+hoy);
if(cumple.isBefore(hoy))
	System.out.println(cumple + " es anterior a "+hoy);
else
	System.out.println(cumple + " no es anterior a "+hoy);

System.out.println(hoy.isEqual(hoy2)); //Devuelve un true o un false
	
		

	}

}
