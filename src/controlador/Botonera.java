package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import modelo.Coordenada;
import modelo.Dificultad;

public class Botonera extends JPanel {
	private BotonCasilla[][] botones;
	private Color base = new Color(200,200,200);
	private Color clicked = new Color(base.getRed()-50,base.getGreen()-50,base.getBlue()-50);
	private Color hovered = new Color(base.getRed()-20,base.getGreen()-20,base.getBlue()-20);
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
	
	public void setClicked(BotonCasilla boton) {
		boton.setBackground(clicked);
	}

	public void disableButtons() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setEnabled(false);
			}
		}
	}
	
}
