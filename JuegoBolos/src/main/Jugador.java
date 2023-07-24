package main;

public class Jugador {
	private String nombre;
	private int puntuacion;
	private int ronda;
	
	public Jugador(String nombre, int puntuacion, int ronda) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.ronda=ronda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	 
	
	
	
	
	
}
