package controlador;

import java.awt.EventQueue;

import modelo.GestionSonidos;
import vista.UI;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaUI frame = new ParaUI();
					frame.setVisible(true);
					
				} catch (Exception e) {
					System.out.println("Error");	
				}
			}
		});
	}
}
