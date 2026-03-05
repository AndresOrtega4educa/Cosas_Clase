package ventanas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swing01 {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Que sería lo correcto?");
		
		ventana.setSize(300,300);
		ventana.setLayout(new FlowLayout());
		JLabel mensaje = new JLabel("Que sería lo correcto?");
		JButton boton = new JButton("Bombardear Israel");
		JTextField edicion = new JTextField(25);
	
		
		ventana.add(mensaje);
		ventana.add(boton);
		ventana.add(edicion);
		
		
		
		
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		

	}

}
