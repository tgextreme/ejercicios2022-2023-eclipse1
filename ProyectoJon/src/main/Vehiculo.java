package main;

public abstract class  Vehiculo {
	private  String marca;
	private String modelo;
	public Vehiculo(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	
}
