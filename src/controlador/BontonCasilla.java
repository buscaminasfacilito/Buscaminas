package controlador;

import java.awt.Color;

import javax.swing.JButton;

import modelo.Coordenada;

public class BontonCasilla extends JButton {
	private Coordenada coordenada;

	public BontonCasilla(Coordenada coordenada) {
		super();
		this.coordenada = coordenada;
	
	}
	
	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	

}
