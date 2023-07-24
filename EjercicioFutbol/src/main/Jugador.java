package main;

import java.time.LocalDate;
import java.util.Date;

public class Jugador {
	
	private int idJugador;
	private String nombre;
	private int numCamiseta;
	private LocalDate fechaNacimiento;
	private int puntos;
	private int rebotes;
	public Jugador() {
	}
	

	
	public Jugador(int idJugador, String nombre, int numCamiseta, LocalDate fechaNacimiento, int puntos, int rebotes) {
		
		this.idJugador = idJugador;
		this.nombre = nombre;
		this.numCamiseta = numCamiseta;
		this.fechaNacimiento = fechaNacimiento;
		this.puntos = puntos;
		this.rebotes = rebotes;
	}



	public void anotaPuntos(int puntos) {
		this.puntos=puntos;
		
	}
	public void anotaPuntos() {
		this.puntos=2;
	}
	
	public void sumaRebotes(int r) {
		
		this.rebotes=this.rebotes+r;
	}
	
	
	
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", numCamiseta=" + numCamiseta + ", fechaNacimiento="
				+ fechaNacimiento + ", puntos=" + puntos + ", rebotes=" + rebotes + "]";
	}
	
	
	public int getIdJugador() {
		return idJugador;
	}



	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumCamiseta() {
		return numCamiseta;
	}
	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getRebotes() {
		return rebotes;
	}
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}
	
	

}
