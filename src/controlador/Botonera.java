package controlador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.AbstractDocument.Content;

import modelo.Coordenada;
import modelo.Dificultad;

public class Botonera extends JPanel {
	private BotonCasilla[][] botones;
	private Color base = new Color(200,200,200);
	private Color hovered = new Color(base.getRed()-50,base.getGreen()-50,base.getBlue()-50);
	public Botonera(Dificultad dificultad) {
		super();
		crearBotonera(dificultad);

	}
	public void crearBotonera(Dificultad dificultad) {
		removeAll();
		
		this.botones = new BotonCasilla[dificultad.getLongitud()][dificultad.getLongitud()];
		
		setLayout(new GridLayout(dificultad.getLongitud(), dificultad.getLongitud(),0 , 0));
		
		for (int i=0;i<dificultad.getLongitud();i++) {
			for(int j=0;j<dificultad.getLongitud();j++) {
				botones[i][j] = new BotonCasilla(new Coordenada(i, j));
				botones[i][j].setBackground(base);
				botones[i][j].setBorder(BorderFactory.createBevelBorder(0));
				botones[i][j].setFont(new Font("Arial",Font.CENTER_BASELINE,25));
				add(botones[i][j]);
			}
		
		}
	}
	
	
	
	public BotonCasilla[][] getBotones() {
		return botones;
	}
	
	public BotonCasilla getBoton(Coordenada cord) {
		return botones[cord.getPosX()][cord.getPosY()];
	}
	
	public void setHover(BotonCasilla boton) {
		boton.setBackground(hovered);
	}
	
	public void quitHover(BotonCasilla boton) {
		boton.setBackground(base);
	}
	
	


	
}
