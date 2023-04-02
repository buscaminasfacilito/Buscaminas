package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utiles.Utiles;

public class TableroAleatorio extends Tablero {
	private boolean terminado = false;

	// Constructor aleatorio
	public TableroAleatorio(int lado, int minas, int[] posInicial) {
		super(lado);
		generaAleatorio(minas, lado, posInicial);
		showMinasTabloero();
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

	public void generaAleatorio(int minas, int longitud, int[] posInicial) {
		Random rnd = new Random();
		int i=0;
		while(i<minas) {
			int fila = rnd.nextInt(longitud);
			int columna = rnd.nextInt(longitud);
			Coordenada coordenadaRnd = new Coordenada(fila, columna);
			if(!getCasilla(coordenadaRnd).isMina() && ((posInicial[0]<fila-1 || posInicial[0]>fila+1) || (posInicial[1]<columna-1 || posInicial[1]>columna+1))) {
				getCasilla(coordenadaRnd).setMina(true);
				i++;
			}
			
		}
		
		

	}

	public void showMinasTabloero() {
		int value;
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[0].length; j++) {
				if(getCasilla(new Coordenada(i, j)).isMina()) value = 1;
				else value = 0;
				System.out.print(value + "|");
			}
			System.out.println();
		}
	}

}
