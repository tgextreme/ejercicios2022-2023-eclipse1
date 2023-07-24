package main;

public class Humano extends Mamifero {

	private String nombre;
	

	private String religion;
	private String ciudad;
	private String pais;

	public Humano(String nombre, String religion, String ciudad, String pais) {
		this.nombre = nombre;
		this.religion = religion;
		this.ciudad = ciudad;
		this.pais = pais;

	}
	
	public String getNombre() {
		return nombre;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
