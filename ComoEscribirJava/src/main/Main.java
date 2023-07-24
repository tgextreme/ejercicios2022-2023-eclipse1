package main;

public class Main {
	public static void main(String[] args) {
		//Trabajador(String dni, String nombre, String localidad)
		Trabajador jose=new Trabajador("1234567A", "Jose", "Orense");
		System.out.println(jose.identificacionTrabajador());
		jose.imprimirHola();
	}
}
