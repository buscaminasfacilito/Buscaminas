package modelo;

import controlador.BotonCasilla;

public class GestionTablero {

	private TableroAleatorio miTablero;
	private boolean isPrimerMovimiento;
	private int numeroMinas;
	private Dificultad dificultadTablero;
	
	public GestionTablero(Dificultad difConstructor) {
		this.dificultadTablero = difConstructor;
		this.numeroMinas = (int) (Math.pow(difConstructor.getLongitud(), 2) * 0.2);
		this.miTablero = new TableroAleatorio(difConstructor.getLongitud());
		this.isPrimerMovimiento=true;
	}
	
	
	public void hacerMovimiento(Coordenada cordenada) {
		if(isPrimerMovimiento) {
			miTablero.generaAleatorio(numeroMinas, cordenada);
			miTablero.desvelarContiguas(cordenada);
			this.isPrimerMovimiento = false;
		}
		
		else if(!miTablero.getCasilla(cordenada).isVelada()) {
			miTablero.desvelarAlrededorDeSeleccionada(cordenada);
		}

		else {		
			miTablero.desvelarContiguas(cordenada);
		}
	}
	public void marcarCasilla(Coordenada cordenada) {
		if(miTablero.getCasilla(cordenada).isMarcada() && miTablero.getCasilla(cordenada).isVelada()) {
			miTablero.getCasilla(cordenada).setMarcada(false);			
		}else if(miTablero.getCasilla(cordenada).isVelada()) {
			miTablero.getCasilla(cordenada).setMarcada(true);
		}
	}

	public TableroAleatorio getMiTablero() {
		return miTablero;
	}
	
	public Dificultad getDificultad() {
		return this.dificultadTablero;
	}
	
	public int getNumeroMinas() {
		return this.numeroMinas;
	}
	
}
