package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido, direccion;
		Persona p3 = null;
		int edad;
		// TODO Auto-generated method stub
		// String nombre, String apellidos, String direccion, int edad)
		Persona p1 = new Persona("Tomas", "Gonzalez", "Falsa 15", 34);
		// String nombre, String apellidos, String direccion
		Persona p2 = new Persona("Tomas", "Gonzalez", "Falsa 15");
		// (String marca, String modelo, int puertas)
		Automovil a1 = new Automovil("Seat", "Leon", 4);
		p1.setAutomovil(a1);
		try {
			System.out.println("Dime nombre");
			nombre = sc.nextLine();
			System.out.println("Dime apellidos");
			apellido = sc.nextLine();
			System.out.println("Dime dirección");
			direccion = sc.nextLine();
			System.out.println("Dime edad");
			edad = sc.nextInt();

			p3 = new Persona(nombre, apellido, direccion, edad);
			System.out.println(p3.toString());
		} catch (Exception ex) {
			System.out.println("Error " + ex.getMessage());
		} finally {
			System.out.println("Programa terminado correctamente");
		}
		if(p3!=null) {
			System.out.println(p3.toString());
		}
	}

}
