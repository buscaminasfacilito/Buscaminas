package modelo;

public enum Dificultad {
	facil(5),medio(8),dificil(12);
	
	private int longitud;

	private Dificultad(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}
	
	public int getPorcentaje() {
		switch(this.longitud) {
		case 5:
			return 15;
		case 8:
			return 20;
		case 12:
			return 25;
		default:
			return 20;
		}
	}
}
