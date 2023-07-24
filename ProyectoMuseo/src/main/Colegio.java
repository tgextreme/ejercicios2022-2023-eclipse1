package main;

public class Colegio {
	private String propiedad;
	private Alumno [] arrAlum=new Alumno[10];
	private int numAluActual=0;
	
	public int getNumAluActual() {
		return numAluActual;
	}
	public void setNumAluActual(int numAluActual) {
		this.numAluActual = numAluActual;
	}
	public Colegio(String propiedad) {
		
		this.propiedad = propiedad;
	}
	public String getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}
	public Alumno[] getArrAlum() {
		return arrAlum;
	}
	public void addArAlu(Alumno alumno) {
		this.arrAlum[this.numAluActual]=alumno;
		this.numAluActual++;
	}
	
	
	
	
}
