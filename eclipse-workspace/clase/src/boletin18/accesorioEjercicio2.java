package boletin18;

public class accesorioEjercicio2 {

	    private String nombre;
	    private int valorOro;

	    public accesorioEjercicio2(String nombre, int valorOro) {
	        this.nombre = nombre;
	        this.valorOro = valorOro;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getValorOro() {
	        return valorOro;
	    }

	    // Dos accesorios se consideran iguales si tienen el mismo nombre
	
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof accesorioEjercicio2)) return false;
	        accesorioEjercicio2 otro = (accesorioEjercicio2) obj;
	        return nombre.equalsIgnoreCase(otro.nombre);
	    }

	
	    public int hashCode() {
	        return nombre.toLowerCase().hashCode();
	    }

	    public String toString() {
	        return nombre + " (" + valorOro + " oro)";
	    }
	}

