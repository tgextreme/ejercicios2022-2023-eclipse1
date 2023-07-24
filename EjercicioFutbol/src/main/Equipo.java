package main;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String idEquipo;
	private String nombreEquipo;
	private List<Jugador> player;
	private int puntos;
	public Equipo() {
	
	}
	public Equipo(String idEquipo, String nombreEquipo) {
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.player = new ArrayList<Jugador>();
	}
	
	public void addJugador(Jugador j) {
		
		if(siono()==true) {
		this.player.add(j);
		}
	}
	public void actualizaPuntos(int puntos) {
		this.puntos=this.puntos+puntos;
	}
	public boolean siono() {
		
		if(this.player.size()<=3) {
			return true;
		}
		return false;
	}

	public String getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public List<Jugador> getPlayer() {
		return player;
	}
	public void setPlayer(List<Jugador> player) {
		this.player = player;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombreEquipo=" + nombreEquipo + ", player=" + player + ", puntos="
				+ puntos + "]";
	}
	
	
	
	

}
