package controlador;

import java.awt.EventQueue;

import vista.Derrota;
import vista.Victoria;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Victoria panelVictoria = new Victoria();
					Derrota panelDerrota = new Derrota();

					ParaUI frame = new ParaUI(panelVictoria,panelDerrota);
					frame.setVisible(true);
					
				} catch (Exception e) {
					System.out.println("Error");	
				}
			}
		});
	}
}
