package ListadeTareas;

public class Main {
	public static void main(String[] args) {

		Tareas t1 = new Tareas("Aprender Java", "Estudiar POO para aprobar el segundo trimestre.", "Azul");
		Tareas t2 = new Tareas("Bravely Second", "Pasarme el Bravely Second cuando tenga tiempo.", "Verde");
		Tareas t3 = new Tareas("Salir a la calle a que te de un poquito el aire loquete", "Que estas blanco nucelar.","Blanco");

	
		t2.completar();
		t3.completar();
		
		
		t1.mostrar();
		t2.mostrar();
		t3.mostrar();
		
		
	

	}
}
