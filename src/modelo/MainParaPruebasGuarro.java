package modelo;

public class MainParaPruebasGuarro {
	public static void main(String[] args) {
		TableroAleatorio tablero = new TableroAleatorio(10);
		Coordenada posInicial = new Coordenada(3, 3);
		tablero.generaAleatorio(15, posInicial);
		tablero.showMinasTablero();
		
		System.out.println();
		tablero.showNumeroMinasContiguas();
		
		tablero.desvelarContiguas(posInicial);
		System.out.println();
		tablero.showCasillasDesveladas();
		
		
	}
}
