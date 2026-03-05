package examenCol;

import java.util.HashMap;



public class Jugador {

	private String codigo;
	private boolean activo = true;

	public Jugador(String codigo, boolean activo) {

		this.codigo = codigo;
		this.activo = activo;
	}

	public void setCodigo() {
		int contador = 0;
		if(this.codigo != null)
			System.out.println("Ya tiene codigo");
		else {
			
			contador++;
			if(contador<10)
				this.codigo = "00" + contador;
			else if(contador>=10 && contador<100)
				this.codigo = "0" + contador;
			else
				this.codigo = "" + contador;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public boolean estaActivo() {
		return activo;
	}

}
