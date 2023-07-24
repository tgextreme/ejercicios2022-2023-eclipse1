package main;

public class Productos {
	private String  codigo;
	private String nombre;
	private String categoria;
	private double precio;
	
	Productos(String codigo,String nombre, String categoria, double precio){
		this.codigo=codigo;
		this.nombre=nombre;
		this.categoria=categoria;
		this.precio=precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
