package modelo;

import java.util.ArrayList;
import java.util.List;

import utiles.Utiles;

public class TableroAleatorio extends Tablero {
	private boolean terminado = false;

	// Constructor aleatorio
	public TableroAleatorio(int lado, int minas) {
		super(lado);
		List<Coordenada> posiciones = generaAleatorio(minas, lado);
	}

	// constructor no aleatorio
	public TableroAleatorio(int lado, List<Coordenada> posiciones) {
		super(lado);
	}

	public void contarMinasAlrededor(List<Coordenada> posiciones) {

	}

	public boolean[][] getCasillasDesveladas() {
		boolean[][] tableroDesveladas = new boolean[getAncho()][getAlto()];
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[0].length; j++) {

				if (getCasilla(new Coordenada(i, j)).isVelada()) {
					tableroDesveladas[i][j] = false;
				} else {
					tableroDesveladas[i][j] = true;
				}

			}
		}
		return tableroDesveladas;
	}

	public void desvelarContiguas(Coordenada lugar) {
		// tablero, lugar
		Casilla casilla = getCasilla(lugar);
		if (casilla.isVelada()) {
			casilla.setVelada(false);
			if (!casilla.isMina()) {
				if (casilla.getMinasAlrededor() == 0) {
					// desde el punto -1,-1 con respecto a casilla hasta +1,+1
					for (int i = lugar.getPosX() - 1; i <= lugar.getPosX() + 1; i++) {
						for (int j = lugar.getPosY() - 1; j <= lugar.getPosY() + 1; j++) {
							Coordenada coordenada = new Coordenada(i, j);
							if (isInToBounds(coordenada)) {
								desvelarContiguas(coordenada);
							}
						}

					}
				}
			}

		}
	}

	private boolean isInToBounds(Coordenada coordenada) {
		int alto = getAlto();
		int ancho = getAncho();
		if (coordenada.getPosX() < ancho && coordenada.getPosX() >= 0 && coordenada.getPosY() < alto
				&& coordenada.getPosY() >= 0) {
			return true;
		}
		return false;
	}

	public List<Coordenada> generaAleatorio(int minas, int longitud) {
		// TODO
		return null;

	}

}
