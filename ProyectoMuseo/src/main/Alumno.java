package main;

public class Alumno {

	private int edad;
	private boolean discapacidad;
	
	
	
	
	public Alumno(int edad, boolean discapacidad) {
		
		this.edad = edad;
		this.discapacidad = discapacidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(boolean discapacidad) {
		this.discapacidad = discapacidad;
	}
	
	

}
