package controlador;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.AbstractDocument.Content;

import modelo.Coordenada;
import modelo.Dificultad;

public class Botonera extends JPanel {
	private BontonCasilla[][] botones;

	public Botonera(Dificultad dificultad) {
		super();
		crearBotonera(dificultad);

	}
	public void crearBotonera(Dificultad dificultad) {
		removeAll();
		
		this.botones = new BontonCasilla[dificultad.getLongitud()][dificultad.getLongitud()];
		
		setLayout(new GridLayout(dificultad.getLongitud(), dificultad.getLongitud(),0 , 0));
		
		for (int i=0;i<dificultad.getLongitud();i++) {
			for(int j=0;j<dificultad.getLongitud();j++) {
				botones[i][j] = new BontonCasilla(new Coordenada(i, j));
				botones[i][j].setBackground(new Color(112, 112, 112));
				botones[i][j].setBorder(new LineBorder(new Color(255,100, 255)));
				add(botones[i][j]);
			}
		
		}
	}
	
	
	
	public BontonCasilla[][] getBotones() {
		return botones;
	}
	
	


	
}
