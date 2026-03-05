package boletin18;

import java.util.ArrayList;
import java.util.List;

public class personajeEjercicio2 {

	    private String nombre;
	    private List<accesorioEjercicio2> inventario;

	    public personajeEjercicio2(String nombre) {
	        this.nombre = nombre;
	        this.inventario = new ArrayList<>();
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public List<accesorioEjercicio2> getInventario() {
	        return inventario;
	    }

	    // Añadir accesorio al inventario
	    public void añadirAccesorio(accesorioEjercicio2 accesorio) {
	        if (inventario.size() >= 10) {
	            System.out.println("No se pueden llevar más de 10 accesorios.");
	            return;
	        }

	        if (inventario.contains(accesorio)) {
	            System.out.println("El accesorio '" + accesorio.getNombre() + "' ya está en el inventario.");
	            return;
	        }

	        inventario.add(accesorio);
	        System.out.println("Accesorio añadido: " + accesorio);
	    }

	    // Eliminar accesorio (agotado)
	    public void eliminarAccesorio(accesorioEjercicio2 accesorio) {
	        if (inventario.remove(accesorio)) {
	            System.out.println("Accesorio eliminado: " + accesorio.getNombre());
	        } else {
	            System.out.println("El accesorio no existe en el inventario.");
	        }
	    }
	    
	   
	    
	    public void mostrar() {
	    	
	    	for(int i=0;i<inventario.size();i++)
	 			System.out.println("Heroe: "+this.nombre+" // Inventario: "+this.inventario.get(i));
	    }
	    
	}

	

