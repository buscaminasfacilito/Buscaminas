package modelo;

public class MainParaPruebasGuarro {
	public static void main(String[] args) {
		TableroAleatorio tablero = new TableroAleatorio(10);
		Coordenada posInicial = new Coordenada(4, 4);
		tablero.generaAleatorio(25, posInicial);
		tablero.showMinasTablero();
		
		System.out.println();
		tablero.showNumeroMinasContiguas();
		
		tablero.desvelarContiguas(posInicial);
		System.out.println();
		tablero.showCasillasDesveladas();
		
		
	}
}
