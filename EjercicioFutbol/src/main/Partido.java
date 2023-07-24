package main;

import java.util.Date;

public class Partido {
	
		private int idPartido;
		private Date fecha;
		private Equipo equipoLocal;
		private Equipo equipoVisitante;
		private int puntosLocal;
		private int puntosVisitante;
		private Jugador maximoAnotador;
		private Jugador maximoReboteador;
		public Partido() {
			
		}
		public Partido(int idPartido, Date fecha, Equipo equipoLocal, Equipo equipoVisitante) {
			
			this.idPartido = idPartido;
			this.fecha = fecha;
			this.equipoLocal = equipoLocal;
			this.equipoVisitante = equipoVisitante;
		}
		public void muestraResult() {
			System.out.println(equipoLocal.getNombreEquipo() + ": "+puntosLocal + " " + equipoVisitante.getNombreEquipo()+ ": "+ puntosVisitante);
			System.out.println("Maximo anotador " + maximoAnotador.getPuntos());
			System.out.println("Maximo reboteador " + maximoReboteador.getRebotes());
			
		}
		public int getIdPartido() {
			return idPartido;
		}
		public void setIdPartido(int idPartido) {
			this.idPartido = idPartido;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public Equipo getEquipoLocal() {
			return equipoLocal;
		}
		public void setEquipoLocal(Equipo equipoLocal) {
			this.equipoLocal = equipoLocal;
		}
		public Equipo getEquipoVisitante() {
			return equipoVisitante;
		}
		public void setEquipoVisitante(Equipo equipoVisitante) {
			this.equipoVisitante = equipoVisitante;
		}
		public int getPuntosLocal() {
			return puntosLocal;
		}
		public void setPuntosLocal(int puntosLocal) {
			this.puntosLocal = puntosLocal;
		}
		public int getPuntosVisitante() {
			return puntosVisitante;
		}
		public void setPuntosVisitante(int puntosVisitante) {
			this.puntosVisitante = puntosVisitante;
		}
		public Jugador getMaximoAnotador() {
			return maximoAnotador;
		}
		public void setMaximoAnotador(Jugador maximoAnotador) {
			this.maximoAnotador = maximoAnotador;
		}
		public Jugador getMaximoReboteador() {
			return maximoReboteador;
		}
		public void setMaximoReboteador(Jugador maximoReboteador) {
			this.maximoReboteador = maximoReboteador;
		}
		
		public void muestraResultados() {
			System.out.println(this.puntosLocal+":"+this.puntosVisitante);
			
		}
		
		
		
		
		
		
		
}
