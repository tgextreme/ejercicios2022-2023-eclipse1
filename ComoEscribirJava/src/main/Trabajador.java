package main;

public class Trabajador {
	String dni, nombre, localidad, nomDeCon;
	
	

	public Trabajador(String dni, String nombre, String localidad) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.localidad = localidad;
	}
	
	public String identificacionTrabajador() {
		return "El empleado se llama "+this.nombre+" vive en "+this.localidad+" tiene el DNI "+this.dni;
	}
	public void imprimirHola() {
		System.out.println("Hola mundo");
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
}
