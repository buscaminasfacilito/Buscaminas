package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import utiles.Utiles;

public class TableroAleatorio extends Tablero {
	private boolean terminado = false;

	// Constructor aleatorio
	public TableroAleatorio(int lado) {
		super(lado);
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
			for (int j = 0; j < getCasillas()[i].length; j++) {

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
		if (casilla.isVelada() && !casilla.isMarcada()) {
			casilla.setVelada(false);
			if (!casilla.isMina()) {
				if (casilla.getMinasAlrededor() == 0) {
					// desde el punto -1,-1 con respecto a casilla hasta +1,+1
					for (int i = lugar.getPosX() - 1; i <= lugar.getPosX() + 1; i++) {
						for (int j = lugar.getPosY() - 1; j <= lugar.getPosY() + 1; j++) {
							Coordenada coordenada = new Coordenada(i, j);
							int x = lugar.getPosX();
							int y = lugar.getPosY();
							if (isInToBounds(coordenada) && Math.abs((Math.abs(x-i)-Math.abs(y-j)))<2) {
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

	public void generaAleatorio(int minas, Coordenada posInicial) {
		Random rnd = new Random();
		int i=0;
		while(i<minas) {
			int fila = rnd.nextInt(getAlto());
			int columna = rnd.nextInt(getAncho());
			Coordenada coordenadaRnd = new Coordenada(fila, columna);
			if(!getCasilla(coordenadaRnd).isMina() && ((posInicial.getPosX()<fila-1 || posInicial.getPosX()>fila+1) || (posInicial.getPosY()<columna-1 || posInicial.getPosY()>columna+1))) {
				getCasilla(coordenadaRnd).setMina(true);
				i++;
				sumarMinaEnContiguas(coordenadaRnd);
			}
		}
	}
	
	public void sumarMinaEnContiguas(Coordenada coordenadaConMina) {
		int x = coordenadaConMina.getPosX();
		int y = coordenadaConMina.getPosY();
		for (int i = x-1; i <= x+1; i++) {
			for (int j = y-1; j <= y+1; j++) {
				Coordenada aux = new Coordenada(i, j);
				if(isInToBounds(aux)) {
					getCasilla(aux).sumarMina();;
				}
			}
		}
	}
	
	public int getCasillasVeladas() {
		int casillasVeladas = 0;
		
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[i].length; j++) {

				if (getCasilla(new Coordenada(i, j)).isVelada()) {
					casillasVeladas++;
				}
			}
		}
		
		return casillasVeladas;
	}

	public void showMinasTablero() {
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
	
	//METODOS DE PRUEBA PARA PROBAR EN UN MAIN
	public void showNumeroMinasContiguas() {
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[0].length; j++) {
				System.out.print(getCasilla(new Coordenada(i, j)).getMinasAlrededor()+ "|");
			}
			System.out.println();
		}
	}
	
	public void showCasillasDesveladas() {
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[0].length; j++) {
				if(getCasilla(new Coordenada(i, j)).isVelada()) System.out.print("*|");
				else {
					System.out.print(" |");}
					
				}
			System.out.println();
		}

	}
	public void showTableroFinal() {
		for (int i = 0; i < getCasillas().length; i++) {
			for (int j = 0; j < getCasillas()[0].length; j++) {
				if(getCasilla(new Coordenada(i, j)).isMina()) {
					System.out.print("*|");
				}else {
					if(getCasilla(new Coordenada(i, j)).isVelada()) System.out.print("*|");
					else {
						if(getCasilla(new Coordenada(i, j)).getMinasAlrededor()==0) {System.out.print(" |");}
						else System.out.print(getCasilla(new Coordenada(i, j)).getMinasAlrededor()+"|");}
					}
					
				}
			System.out.println();
		}

	}
	
	
			
}
