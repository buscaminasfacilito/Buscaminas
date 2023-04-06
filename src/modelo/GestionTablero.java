package modelo;

import controlador.BotonCasilla;

public class GestionTablero {

	private TableroAleatorio miTablero;
	private boolean isPrimerMovimiento;
	private int numeroMinas;
	
	public GestionTablero(int lado) {
		this.numeroMinas = 15;
		this.miTablero = new TableroAleatorio(lado);
		this.isPrimerMovimiento=true;
	}
	
	
	public void hacerMovimiento(Coordenada cordenada) {
		if(isPrimerMovimiento) {
			miTablero.generaAleatorio(numeroMinas, cordenada);
			miTablero.desvelarContiguas(cordenada);
			this.isPrimerMovimiento = false;
		}
		
		miTablero.desvelarContiguas(cordenada);
	}

	public TableroAleatorio getMiTablero() {
		return miTablero;
	}
	
	
	
}
