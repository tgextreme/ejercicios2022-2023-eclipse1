package main;

public class Lampara {
	private String estilo;
	private boolean bateria;
	private int calificacion; // ñ ny ni 

	public Lampara(String estilo, boolean bateria, int calificacion) {

		this.estilo = estilo;
		this.bateria = bateria;
		this.calificacion = calificacion;
	}

	public void encender() {
		System.out.println("La lámpara se ha encendido");
	}

	public String getEstilo() {
		return this.estilo;
	}
	public Boolean hayBateria() {
		return this.bateria;
	}
	public int getCalificacion() {
		return this.calificacion;
	}

}
