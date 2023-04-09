package controlador;

import javax.swing.JButton;

import modelo.Coordenada;

public class BotonCasilla extends JButton {
	private Coordenada coordenada;

	public BotonCasilla(Coordenada coordenada) {
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
