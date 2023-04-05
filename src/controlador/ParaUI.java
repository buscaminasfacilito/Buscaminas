package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import modelo.Dificultad;
import vista.UI;

public class ParaUI extends UI{
	
	public ParaUI() {
		
		behaviourDifficultyButtons(getDifficultyButton());
		
	}
	
	
	
	
	
	
	
	
	public void behaviourDifficultyButtons(JMenuItem myButtons[]){
		myButtons[0].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getPanelMinador().crearBotonera(Dificultad.facil);
					//actualizar
					getPanelMinador().revalidate();
					//System.out.println("Actualizado a facil");
				}
			});
		
		myButtons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanelMinador().crearBotonera(Dificultad.medio);
				//actualizar
				getPanelMinador().revalidate();
				//System.out.println("Actualizado a medio");
			}
		});
		
		myButtons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanelMinador().crearBotonera(Dificultad.dificil);
				//actualizar
				getPanelMinador().revalidate();
				//System.out.println("Actualizado a dificil");
			}
		});
		
	}
	
	
	
	
}
